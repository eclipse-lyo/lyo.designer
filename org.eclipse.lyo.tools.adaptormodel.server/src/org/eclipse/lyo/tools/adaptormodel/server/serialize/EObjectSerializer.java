package org.eclipse.lyo.tools.adaptormodel.server.serialize;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EDataType;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Reflective (de)serialization of EMF objects to/from JSON using only the
 * EMF reflective API. Unlike the Capella reference, identity is based on the
 * EMF URI fragment ({@code resource.getURIFragment(eObject)}) which is stable
 * for every EObject regardless of whether it carries an {@code id} attribute.
 *
 * <p>
 * Containment and cross-references are emitted as lightweight summaries
 * ({@code type + fragment + name}) rather than recursed, to avoid dumping the
 * whole model and to avoid cycles.
 * </p>
 */
public final class EObjectSerializer {

    private EObjectSerializer() {
    }

    public static String fragmentOf(EObject eObject) {
        return eObject.eResource() != null ? eObject.eResource().getURIFragment(eObject) : null;
    }

    /**
     * Returns the {@code id} structural feature if the object has a String-valued
     * attribute named {@code id} (as {@code Resource} / {@code ResourceProperty}
     * do). Used only as a convenience field in the JSON output.
     */
    public static EStructuralFeature findIdFeature(EObject eObject) {
        for (EStructuralFeature sf : eObject.eClass().getEAllStructuralFeatures()) {
            if ("id".equals(sf.getName()) && sf.getEType() instanceof EDataType
                    && String.class.equals(((EDataType) sf.getEType()).getInstanceClass())) {
                return sf;
            }
        }
        return null;
    }

    public static JsonObject summary(EObject eObject) {
        JsonObject json = new JsonObject();
        json.addProperty("type", eObject.eClass().getName());
        json.addProperty("fragment", fragmentOf(eObject));
        json.addProperty("name", nameOf(eObject));
        EStructuralFeature idFeature = findIdFeature(eObject);
        if (idFeature != null) {
            json.addProperty("id", (String) eObject.eGet(idFeature));
        }
        return json;
    }

    public static JsonObject serialize(EObject eObject) {
        JsonObject json = new JsonObject();
        if (eObject == null) {
            return json;
        }
        json.addProperty("type", eObject.eClass().getName());
        json.addProperty("fragment", fragmentOf(eObject));
        if (eObject.eResource() != null) {
            json.addProperty("uri", eObject.eResource().getURI().toString() + "#" + fragmentOf(eObject));
        }
        EStructuralFeature idFeature = findIdFeature(eObject);
        if (idFeature != null) {
            json.addProperty("id", (String) eObject.eGet(idFeature));
        }
        json.addProperty("name", nameOf(eObject));
        json.addProperty("containerFragment",
                eObject.eContainer() != null ? fragmentOf(eObject.eContainer()) : null);

        for (EStructuralFeature sf : eObject.eClass().getEAllStructuralFeatures()) {
            if (sf.isDerived()) {
                continue;
            }
            Object value = eObject.eGet(sf);
            if (value == null) {
                continue;
            }
            if (sf instanceof EReference) {
                EReference reference = (EReference) sf;
                if (reference.isContainment()) {
                    json.add(sf.getName(), summarizeList(value));
                } else {
                    json.add(sf.getName(), summarizeList(value));
                }
            } else {
                if (value instanceof Boolean) {
                    json.addProperty(sf.getName(), (Boolean) value);
                } else if (value instanceof Number) {
                    json.addProperty(sf.getName(), (Number) value);
                } else if (value instanceof Enum<?>) {
                    json.addProperty(sf.getName(), ((Enum<?>) value).name());
                } else {
                    json.addProperty(sf.getName(), value.toString());
                }
            }
        }
        return json;
    }

    private static JsonArray summarizeList(Object value) {
        JsonArray array = new JsonArray();
        if (value instanceof java.util.List<?>) {
            for (Object element : (java.util.List<?>) value) {
                if (element instanceof EObject) {
                    array.add(summary((EObject) element));
                }
            }
        } else if (value instanceof EObject) {
            array.add(summary((EObject) value));
        }
        return array;
    }

    private static String nameOf(EObject eObject) {
        EStructuralFeature nameFeature = eObject.eClass().getEStructuralFeature("name");
        if (nameFeature != null) {
            Object value = eObject.eGet(nameFeature);
            if (value != null) {
                return value.toString();
            }
        }
        return null;
    }
}
