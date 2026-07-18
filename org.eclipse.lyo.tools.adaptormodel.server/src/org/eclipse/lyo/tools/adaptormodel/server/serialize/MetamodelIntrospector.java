package org.eclipse.lyo.tools.adaptormodel.server.serialize;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import adaptorinterface.AdaptorinterfacePackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Reflectively describes the Lyo semantic metamodels (Adaptor Interface,
 * Toolchain and Vocabulary) so clients / MCP tools can discover what can be
 * created. The {@code toolchain} and {@code vocabulary} packages are resolved
 * from the EMF package registry, so they are only listed when their bundles are
 * loaded in the running runtime.
 */
public final class MetamodelIntrospector {

    private static final String TOOLCHAIN_NS = "http://org.eclipse.lyo/oslc4j/toolChain";
    private static final String VOCABULARY_NS = "http://org.eclipse.lyo/oslc4j/vocabulary";

    private MetamodelIntrospector() {
    }

    public static JsonArray introspect() {
        JsonArray classes = new JsonArray();
        for (EPackage pkg : semanticPackages()) {
            for (EClassifier classifier : pkg.getEClassifiers()) {
                if (!(classifier instanceof EClass)) {
                    continue;
                }
                EClass eClass = (EClass) classifier;
                JsonObject classJson = new JsonObject();
                classJson.addProperty("package", pkg.getNsPrefix());
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
        }
        return classes;
    }

    private static List<EPackage> semanticPackages() {
        List<EPackage> pkgs = new ArrayList<>();
        pkgs.add(AdaptorinterfacePackage.eINSTANCE);
        for (String ns : new String[] { TOOLCHAIN_NS, VOCABULARY_NS }) {
            EPackage pkg = EPackage.Registry.INSTANCE.getEPackage(ns);
            if (pkg != null) {
                pkgs.add(pkg);
            }
        }
        return pkgs;
    }
}
