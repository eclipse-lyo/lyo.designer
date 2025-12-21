# OSLC4J Code Generator CLI

Headless CLI wrapper for the Acceleo-based code generator.

## Build (fat jar)
- From the repository root: `mvn -Pcli-fat-jar -pl org.eclipse.lyo.oslc4j.codegenerator -am clean package`
- Fat jar output: `org.eclipse.lyo.oslc4j.codegenerator/target/org.eclipse.lyo.oslc4j.codegenerator-<version>-cli.jar`

## Run
- Generate code: `java -jar target/org.eclipse.lyo.oslc4j.codegenerator-<version>-cli.jar <path-to>.toolchain <output-dir> [properties...]`
- Generate specification only: `java -cp target/org.eclipse.lyo.oslc4j.codegenerator-<version>-cli.jar org.eclipse.lyo.oslc4j.codegenerator.main.GenerateSpecification <path-to>.toolchain <output-dir> [properties...]`

Notes:
- The CLI registers adaptorinterface, vocabulary, and toolchain EMF packages plus XMI factories for `.toolchain` models.
- Relative URIs in the model are resolved from the `.toolchain` file location; ensure referenced domain and vocabulary files are present.
- Example model input lives under `refimpl/model` in the `oslc/refimpl` repository (e.g., `toolchain.xml` with `generator.properties`).
