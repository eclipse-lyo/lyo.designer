package example;

import example.generated.Child;
import example.generated.Diamond;
import example.generated.FirstFeature;
import example.generated.Root;
import example.generated.SecondFeature;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;

public class VerifyGeneratedInheritance {
    public static void main(String[] args) throws Exception {
        check(Child.class.getMethod("getRightValue").getDeclaringClass() == Diamond.class,
                "secondary-parent property must be inherited from the superclass");
        check(Diamond.class.getMethod("getRootValue").getDeclaringClass() == Root.class,
                "diamond must reuse the shared ancestor");
        check(Child.class.getDeclaredFields().length == 0,
                "child must not redeclare inherited storage");
        check(FirstFeature.class.getDeclaredField("firstValue") != null,
                "first RDF domain must retain its resource");
        check(SecondFeature.class.getDeclaredField("secondValue") != null,
                "second RDF domain must retain its resource");
        check(SecondFeature.class.getAnnotation(OslcResourceShape.class).description()
                .equals("first\nsecond \\path"), "resource description must round-trip");
        check(SecondFeature.class.getAnnotation(OslcResourceShape.class).title()
                .equals("A \"resource\""), "resource title must round-trip");
        check(SecondFeature.class.getAnnotation(OslcResourceShape.class).describes()[0]
                .equals("https://example.org/vocabulary#Class"),
                "Java keyword escaping must not change the RDF class name");
        check(Diamond.class.getMethod("getLocalValue").getAnnotation(OslcDescription.class).value()
                .equals("line one\nline \"two\" \\path\r\ttail"),
                "property description must round-trip");
        check(Diamond.class.getMethod("getLocalValue").getAnnotation(OslcTitle.class).value()
                .equals("a \"title\""), "property title must round-trip");
        check(Diamond.class.getMethod("protectedProbe").invoke(new Diamond()).equals("kept"),
                "regeneration must preserve protected code");
        System.out.println("Generated inheritance and annotation checks passed.");
    }

    private static void check(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}
