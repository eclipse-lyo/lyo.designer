package org.eclipse.lyo.tools.adaptormodel.server.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.lyo.oslc4j.codegenerator.main.Generate;

import adaptorinterface.AdaptorInterface;
import adaptorinterface.AdaptorinterfacePackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import org.eclipse.lyo.tools.adaptormodel.server.ModelException;
import org.eclipse.lyo.tools.adaptormodel.server.serialize.EObjectSerializer;
import org.eclipse.lyo.tools.adaptormodel.server.serialize.MetamodelIntrospector;
import org.eclipse.lyo.tools.adaptormodel.server.session.ModelSessionProvider;

/**
 * Core model operations backing both the REST and the MCP endpoints.
 *
 * <p>
 * All operations are reflective over the Adaptor Interface metamodel, which
 * means creating/updating any element type is supported without per-type code.
 * The only special-cased type is the {@link AdaptorInterface} root (which can be
 * created with no container).
 * </p>
 */
public final class ModelService {

    private final ModelSessionProvider session = ModelSessionProvider.INSTANCE;

    private static final String ADAPTOR_NS = "http://org.eclipse.lyo/oslc4j/adaptorInterface";
    private static final String TOOLCHAIN_NS = "http://org.eclipse.lyo/oslc4j/toolChain";
    private static final String VOCABULARY_NS = "http://org.eclipse.lyo/oslc4j/vocabulary";

    public JsonObject metamodel() {
        JsonObject result = new JsonObject();
        result.add("classes", MetamodelIntrospector.introspect());
        return result;
    }

    public JsonObject diagnostics() {
        return session.diagnostics();
    }

    public JsonObject getElement(String fragment) {
        if (fragment == null) {
            throw new ModelException("fragment is required");
        }
        EditingDomain editingDomain = requireSession();
        return session.read(editingDomain, resourceSet -> {
            EObject element = resolve(resourceSet, fragment);
            if (element == null) {
                throw new ModelException("Element not found: " + fragment);
            }
            return EObjectSerializer.serialize(element);
        });
    }

    public JsonArray query(String type, String text) {
        EditingDomain editingDomain = requireSession();
        return session.read(editingDomain, resourceSet -> {
            JsonArray array = new JsonArray();
            for (EObject element : allAdaptorObjects(resourceSet)) {
                if (type != null && !element.eClass().getName().equals(type)) {
                    continue;
                }
                if (text != null && !matchesText(element, text)) {
                    continue;
                }
                array.add(EObjectSerializer.summary(element));
            }
            return array;
        });
    }

    /**
     * Returns the top-level root elements of every resource in the session, with
     * their type and fragment. This makes it obvious whether the open model is an
     * {@code AdaptorInterface} (adaptor endpoints) or a {@code Specification}
     * (domain/vocabulary) model.
     */
    public JsonArray roots() {
        EditingDomain editingDomain = requireSession();
        return session.read(editingDomain, resourceSet -> {
            JsonArray array = new JsonArray();
            for (Resource resource : resourceSet.getResources()) {
                for (EObject root : resource.getContents()) {
                    if (!isSemantic(root)) {
                        continue;
                    }
                    JsonObject object = EObjectSerializer.summary(root);
                    object.addProperty("resourceURI", resource.getURI().toString());
                    array.add(object);
                }
            }
            return array;
        });
    }

    public JsonObject generateAdaptorCode(String fragment, String targetFolder) {
        EditingDomain editingDomain = requireSession();
        List<AdaptorInterface> interfaces = session.read(editingDomain,
                resourceSet -> collectAdaptorInterfaces(resourceSet, fragment));
        if (interfaces.isEmpty()) {
            throw new ModelException("No AdaptorInterface found"
                    + (fragment != null ? " at " + fragment : " in the open model"));
        }
        JsonArray generated = new JsonArray();
        boolean anyOk = false;
        for (AdaptorInterface adaptorInterface : interfaces) {
            JsonObject result = generateOne(adaptorInterface, targetFolder);
            generated.add(result);
            if (result.has("generated") && result.get("generated").getAsBoolean()) {
                anyOk = true;
            }
        }
        JsonObject out = new JsonObject();
        out.addProperty("generated", anyOk);
        out.add("adaptorInterfaces", generated);
        return out;
    }

    private static List<AdaptorInterface> collectAdaptorInterfaces(ResourceSet resourceSet, String fragment) {
        List<AdaptorInterface> result = new ArrayList<>();
        if (fragment != null) {
            EObject element = resolve(resourceSet, fragment);
            if (element instanceof AdaptorInterface) {
                result.add((AdaptorInterface) element);
            } else if (element != null) {
                throw new ModelException("Element " + fragment + " is not an AdaptorInterface");
            }
            return result;
        }
        for (EObject element : allAdaptorObjects(resourceSet)) {
            if (element instanceof AdaptorInterface) {
                result.add((AdaptorInterface) element);
            }
        }
        return result;
    }

    private static JsonObject generateOne(AdaptorInterface adaptorInterface, String targetFolderArg) {
        JsonObject result = new JsonObject();
        result.addProperty("fragment", EObjectSerializer.fragmentOf(adaptorInterface));
        result.addProperty("name", adaptorInterface.getName());
        try {
            File projectFolder = modellingProjectBaseFolder(adaptorInterface);
            File targetFolder = resolveTargetFolder(projectFolder, targetFolderArg);
            Generate generator = new Generate(adaptorInterface, targetFolder, new ArrayList<>());
            generator.doGenerate(new BasicMonitor());
            refreshProject(adaptorInterface);
            result.addProperty("targetFolder", targetFolder.getAbsolutePath());
            result.addProperty("generated", true);
        } catch (IOException e) {
            result.addProperty("generated", false);
            result.addProperty("error", e.getMessage());
        }
        return result;
    }

    private static File modellingProjectBaseFolder(EObject self) {
        EObject rootContainer = EcoreUtil.getRootContainer(self);
        org.eclipse.emf.common.util.URI rootUri = EcoreUtil.getURI(rootContainer);
        org.eclipse.emf.common.util.URI resolved = CommonPlugin.resolve(rootUri);
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IPath location = Path.fromOSString(resolved.toFileString());
        IFile ifile = workspace.getRoot().getFileForLocation(location);
        return ifile.getProject().getLocation().toFile();
    }

    private static File resolveTargetFolder(File projectFolder, String override) throws ModelException {
        if (override != null && !override.isEmpty()) {
            File folder = new File(override);
            if (!folder.isAbsolute()) {
                folder = new File(projectFolder, override);
            }
            return folder;
        }
        File propertiesFile = new File(projectFolder, "generator.properties");
        if (propertiesFile.isFile()) {
            Properties properties = new Properties();
            try (FileInputStream in = new FileInputStream(propertiesFile)) {
                properties.load(in);
            } catch (IOException e) {
                throw new ModelException("Could not read generator.properties: " + e.getMessage());
            }
            String generationPath = properties.getProperty("generationPath");
            if (generationPath != null && !generationPath.isEmpty()) {
                File folder = new File(generationPath);
                if (!folder.isAbsolute()) {
                    folder = new File(projectFolder, generationPath);
                }
                return folder;
            }
        }
        throw new ModelException(
                "No generation target folder. Provide 'targetFolder' or set 'generationPath' in generator.properties.");
    }

    private static void refreshProject(EObject self) {
        try {
            EObject rootContainer = EcoreUtil.getRootContainer(self);
            org.eclipse.emf.common.util.URI rootUri = EcoreUtil.getURI(rootContainer);
            org.eclipse.emf.common.util.URI resolved = CommonPlugin.resolve(rootUri);
            IWorkspace workspace = ResourcesPlugin.getWorkspace();
            IPath location = Path.fromOSString(resolved.toFileString());
            IFile ifile = workspace.getRoot().getFileForLocation(location);
            if (ifile != null && ifile.getProject() != null) {
                ifile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
            }
        } catch (Throwable t) {
            // best-effort refresh; ignore
        }
    }

    public JsonObject create(JsonObject request) {
        final String type = str(request, "type");
        final String containerFragment = optStr(request, "containerFragment");
        final String containmentFeature = optStr(request, "containmentFeature");
        final JsonObject attributes = request.has("attributes") ? request.getAsJsonObject("attributes")
                : new JsonObject();
        final JsonObject references = request.has("references") ? request.getAsJsonObject("references")
                : new JsonObject();

        final EditingDomain editingDomain = requireSession();
        final String[] outFragment = { null };
        session.write(editingDomain, () -> {
            ResourceSet resourceSet = editingDomain.getResourceSet();
            EClass eClass = resolveEClass(type);
            if (eClass.isAbstract() || eClass.isInterface()) {
                throw new ModelException("Cannot instantiate abstract/interface type: " + type);
            }
            EObject container = containerFragment != null ? resolve(resourceSet, containerFragment) : null;
            EObject newObject = eClass.getEPackage().getEFactoryInstance().create(eClass);
            setAttributes(newObject, attributes);
            EStructuralFeature cf = resolveContainmentFeature(container, newObject, containmentFeature);
            if (cf != null) {
                addToContainer(container, newObject, cf);
            } else if (container == null) {
                // No container provided: attach as a root element.
                EObject rootOwner = null;
                EStructuralFeature rootFeature = null;
                if ("AdaptorInterface".equals(eClass.getName())) {
                    EObject toolchain = findRootOfType(resourceSet, "Toolchain");
                    if (toolchain != null) {
                        EStructuralFeature tc = toolchain.eClass().getEStructuralFeature("adaptorInterfaces");
                        if (tc instanceof EReference && ((EReference) tc).isContainment()) {
                            rootOwner = toolchain;
                            rootFeature = tc;
                        }
                    }
                }
                if (rootOwner != null && rootFeature != null) {
                    addToContainer(rootOwner, newObject, rootFeature);
                } else {
                    Resource resource = primaryResource(resourceSet);
                    if (resource == null) {
                        throw new ModelException("No resource available to host " + type);
                    }
                    resource.getContents().add(newObject);
                }
            } else {
                throw new ModelException("Could not resolve a containment feature for " + type + " under "
                        + containerFragment
                        + ". Provide an explicit containmentFeature or choose a container that can hold this type.");
            }
            setReferences(newObject, references, resourceSet);
            outFragment[0] = EObjectSerializer.fragmentOf(newObject);
        });

        JsonObject result = new JsonObject();
        result.addProperty("fragment", outFragment[0]);
        result.addProperty("type", type);
        return result;
    }

    public void update(String fragment, JsonObject request) {
        if (fragment == null) {
            throw new ModelException("fragment is required");
        }
        final JsonObject attributes = request.has("attributes") ? request.getAsJsonObject("attributes")
                : new JsonObject();
        final JsonObject references = request.has("references") ? request.getAsJsonObject("references")
                : new JsonObject();
        final EditingDomain editingDomain = requireSession();
        session.write(editingDomain, () -> {
            ResourceSet resourceSet = editingDomain.getResourceSet();
            EObject element = resolve(resourceSet, fragment);
            if (element == null) {
                throw new ModelException("Element not found: " + fragment);
            }
            setAttributes(element, attributes);
            setReferences(element, references, resourceSet);
        });
    }

    public void delete(String fragment) {
        if (fragment == null) {
            throw new ModelException("fragment is required");
        }
        final EditingDomain editingDomain = requireSession();
        session.write(editingDomain, () -> {
            ResourceSet resourceSet = editingDomain.getResourceSet();
            EObject element = resolve(resourceSet, fragment);
            if (element == null) {
                throw new ModelException("Element not found: " + fragment);
            }
            EcoreUtil.remove(element);
        });
    }

    // ---- internals ----

    private EditingDomain requireSession() {
        EditingDomain editingDomain = session.findEditingDomain();
        if (editingDomain == null) {
            throw new ModelException(
                    "No open Adaptor Interface model / Sirius session found. Open the AdaptorInterface diagram first.");
        }
        return editingDomain;
    }

    private static EClass resolveEClass(String type) {
        EClass found = findEClass(AdaptorinterfacePackage.eINSTANCE, type);
        if (found != null) {
            return found;
        }
        for (String ns : new String[] { TOOLCHAIN_NS, VOCABULARY_NS }) {
            EPackage pkg = EPackage.Registry.INSTANCE.getEPackage(ns);
            if (pkg != null) {
                found = findEClass(pkg, type);
                if (found != null) {
                    return found;
                }
            }
        }
        throw new ModelException("Unknown element type: " + type
                + ". The corresponding metamodel bundle may not be loaded in this runtime.");
    }

    private static EClass findEClass(EPackage pkg, String type) {
        for (EClassifier classifier : pkg.getEClassifiers()) {
            if (classifier instanceof EClass && classifier.getName().equals(type)) {
                return (EClass) classifier;
            }
        }
        return null;
    }

    private static EObject resolve(ResourceSet resourceSet, String fragment) {
        for (Resource resource : resourceSet.getResources()) {
            if (resource.getContents().isEmpty()) {
                continue;
            }
            try {
                EObject element = resource.getEObject(fragment);
                if (element != null) {
                    return element;
                }
            } catch (Throwable t) {
                // not in this resource - try the next one
            }
        }
        return null;
    }

    private static EStructuralFeature resolveContainmentFeature(EObject container, EObject newObject,
            String explicit) {
        if (container == null) {
            return null;
        }
        if (explicit != null) {
            EStructuralFeature feature = container.eClass().getEStructuralFeature(explicit);
            if (feature instanceof EReference && ((EReference) feature).isContainment()) {
                return feature;
            }
            throw new ModelException("Not a containment reference: " + explicit);
        }
        EStructuralFeature foundMany = null;
        EStructuralFeature foundSingle = null;
        for (EStructuralFeature feature : container.eClass().getEAllStructuralFeatures()) {
            if (feature instanceof EReference && ((EReference) feature).isContainment()
                    && feature.getEType().isInstance(newObject)) {
                if (feature.isMany()) {
                    foundMany = feature;
                } else {
                    foundSingle = feature;
                }
            }
        }
        return foundMany != null ? foundMany : foundSingle;
    }

    @SuppressWarnings("unchecked")
    private static void addToContainer(EObject container, EObject newObject, EStructuralFeature cf) {
        if (cf.isMany()) {
            ((List<EObject>) container.eGet(cf)).add(newObject);
        } else {
            container.eSet(cf, newObject);
        }
    }

    private static void setAttributes(EObject object, JsonObject attributes) {
        for (Map.Entry<String, JsonElement> entry : attributes.entrySet()) {
            EStructuralFeature feature = object.eClass().getEStructuralFeature(entry.getKey());
            if (!(feature instanceof EAttribute)) {
                throw new ModelException("Not an attribute: " + entry.getKey());
            }
            if (entry.getValue().isJsonNull()) {
                continue;
            }
            EAttribute attribute = (EAttribute) feature;
            EClassifier dataType = attribute.getEType();
            if (dataType instanceof EEnum) {
                EEnumLiteral literal = ((EEnum) dataType).getEEnumLiteral(entry.getValue().getAsString());
                if (literal == null) {
                    throw new ModelException(
                            "Invalid literal '" + entry.getValue().getAsString() + "' for " + attribute.getName());
                }
                object.eSet(attribute, literal.getInstance());
            } else if (Boolean.class.equals(dataType.getInstanceClass())
                    || boolean.class.equals(dataType.getInstanceClass())) {
                object.eSet(attribute, entry.getValue().getAsBoolean());
            } else if (isIntegerLike(dataType.getInstanceClass())) {
                object.eSet(attribute, entry.getValue().getAsInt());
            } else {
                object.eSet(attribute, entry.getValue().getAsString());
            }
        }
    }

    private static boolean isIntegerLike(Class<?> clazz) {
        return clazz == int.class || clazz == Integer.class || clazz == short.class || clazz == Short.class
                || clazz == long.class || clazz == Long.class;
    }

    @SuppressWarnings("unchecked")
    private static void setReferences(EObject object, JsonObject references, ResourceSet resourceSet) {
        for (Map.Entry<String, JsonElement> entry : references.entrySet()) {
            EStructuralFeature feature = object.eClass().getEStructuralFeature(entry.getKey());
            if (!(feature instanceof EReference)) {
                throw new ModelException("Not a reference: " + entry.getKey());
            }
            EReference reference = (EReference) feature;
            if (!entry.getValue().isJsonArray()) {
                throw new ModelException("references." + entry.getKey() + " must be a JSON array of fragment strings");
            }
            JsonArray array = entry.getValue().getAsJsonArray();
            List<EObject> targets = new ArrayList<>();
            for (JsonElement element : array) {
                targets.add(resolve(resourceSet, element.getAsString()));
            }
            if (reference.isMany()) {
                ((List<EObject>) object.eGet(reference)).clear();
                ((List<EObject>) object.eGet(reference)).addAll(targets);
            } else {
                object.eSet(reference, targets.isEmpty() ? null : targets.get(0));
            }
        }
    }

    private static List<EObject> allAdaptorObjects(ResourceSet resourceSet) {
        List<EObject> result = new ArrayList<>();
        for (Resource resource : resourceSet.getResources()) {
            for (EObject root : resource.getContents()) {
                collectSemantic(root, result);
            }
        }
        return result;
    }

    private static void collectSemantic(EObject eo, List<EObject> out) {
        if (isSemantic(eo)) {
            out.add(eo);
            for (EObject child : eo.eContents()) {
                collectSemantic(child, out);
            }
        }
    }

    private static boolean isSemantic(EObject eo) {
        String ns = eo.eClass().getEPackage().getNsURI();
        return ADAPTOR_NS.equals(ns) || TOOLCHAIN_NS.equals(ns) || VOCABULARY_NS.equals(ns);
    }

    private static EObject findRootOfType(ResourceSet resourceSet, String typeName) {
        for (Resource resource : resourceSet.getResources()) {
            for (EObject root : resource.getContents()) {
                if (typeName.equals(root.eClass().getName())) {
                    return root;
                }
            }
        }
        return null;
    }

    private static boolean matchesText(EObject object, String text) {
        String needle = text.toLowerCase();
        EStructuralFeature idFeature = EObjectSerializer.findIdFeature(object);
        if (idFeature != null) {
            Object value = object.eGet(idFeature);
            if (value != null && value.toString().toLowerCase().contains(needle)) {
                return true;
            }
        }
        EStructuralFeature nameFeature = object.eClass().getEStructuralFeature("name");
        if (nameFeature != null) {
            Object value = object.eGet(nameFeature);
            if (value != null && value.toString().toLowerCase().contains(needle)) {
                return true;
            }
        }
        EStructuralFeature titleFeature = object.eClass().getEStructuralFeature("title");
        if (titleFeature != null) {
            Object value = object.eGet(titleFeature);
            if (value != null && value.toString().toLowerCase().contains(needle)) {
                return true;
            }
        }
        return false;
    }

    private static String str(JsonObject request, String key) {
        if (!request.has(key) || request.get(key).isJsonNull()) {
            throw new ModelException("Missing required field: " + key);
        }
        return request.get(key).getAsString();
    }

    private static String optStr(JsonObject request, String key) {
        if (!request.has(key) || request.get(key).isJsonNull()) {
            return null;
        }
        return request.get(key).getAsString();
    }

    private static Resource primaryResource(ResourceSet resourceSet) {
        for (Resource resource : resourceSet.getResources()) {
            for (EObject root : resource.getContents()) {
                if (root instanceof AdaptorInterface) {
                    return resource;
                }
            }
        }
        for (Resource resource : resourceSet.getResources()) {
            if (!resource.getContents().isEmpty()) {
                return resource;
            }
        }
        return null;
    }
}
