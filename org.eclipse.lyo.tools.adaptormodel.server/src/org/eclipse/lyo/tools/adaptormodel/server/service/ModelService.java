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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;

import adaptorinterface.AdaptorInterface;
import adaptorinterface.AdaptorinterfaceFactory;
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
            EObject newObject = AdaptorinterfaceFactory.eINSTANCE.create(eClass);
            setAttributes(newObject, attributes);
            EStructuralFeature cf = resolveContainmentFeature(container, newObject, containmentFeature);
            if (cf != null) {
                addToContainer(container, newObject, cf);
            } else if (container == null && "AdaptorInterface".equals(eClass.getName())) {
                Resource resource = primaryResource(resourceSet);
                if (resource == null) {
                    throw new ModelException("No resource available to host the AdaptorInterface root");
                }
                resource.getContents().add(newObject);
            } else {
                throw new ModelException("Could not resolve a containment feature for " + type
                        + (container != null ? " under " + containerFragment : " (no container provided)"));
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
        for (EClassifier classifier : AdaptorinterfacePackage.eINSTANCE.getEClassifiers()) {
            if (classifier instanceof EClass && classifier.getName().equals(type)) {
                return (EClass) classifier;
            }
        }
        throw new ModelException("Unknown element type: " + type);
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
                if (root.eClass().getEPackage() != AdaptorinterfacePackage.eINSTANCE) {
                    continue;
                }
                result.add(root);
                for (Iterator<EObject> it = root.eAllContents(); it.hasNext();) {
                    result.add(it.next());
                }
            }
        }
        return result;
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
