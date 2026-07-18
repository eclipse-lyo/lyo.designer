package org.eclipse.lyo.tools.adaptormodel.server.serialize;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import adaptorinterface.AdaptorinterfacePackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Reflectively describes the Adaptor Interface metamodel (EClasses and their
 * features) so clients / MCP tools can discover what can be created.
 */
public final class MetamodelIntrospector {

    private MetamodelIntrospector() {
    }

    public static JsonArray introspect() {
        JsonArray classes = new JsonArray();
        for (EClassifier classifier : AdaptorinterfacePackage.eINSTANCE.getEClassifiers()) {
            if (!(classifier instanceof EClass)) {
                continue;
            }
            EClass eClass = (EClass) classifier;
            JsonObject classJson = new JsonObject();
            classJson.addProperty("name", eClass.getName());
            classJson.addProperty("abstract", eClass.isAbstract() || eClass.isInterface());

            JsonArray features = new JsonArray();
            for (EStructuralFeature feature : eClass.getEStructuralFeatures()) {
                JsonObject featureJson = new JsonObject();
                featureJson.addProperty("name", feature.getName());
                featureJson.addProperty("kind", feature instanceof EReference ? "reference" : "attribute");
                featureJson.addProperty("type", feature.getEType().getName());
                featureJson.addProperty("containment",
                        feature instanceof EReference && ((EReference) feature).isContainment());
                featureJson.addProperty("many", feature.isMany());
                featureJson.addProperty("required", feature.getLowerBound() > 0);
                if (feature.getEType() instanceof EEnum) {
                    JsonArray literals = new JsonArray();
                    for (EEnumLiteral literal : ((EEnum) feature.getEType()).getELiterals()) {
                        literals.add(literal.getLiteral());
                    }
                    featureJson.add("enumLiterals", literals);
                }
                features.add(featureJson);
            }
            classJson.add("features", features);
            classes.add(classJson);
        }
        return classes;
    }
}
