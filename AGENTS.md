# Agent Guide for Lyo Designer

When validating a change to the code generator, build the plug-ins project
first if the generator reactor cannot resolve
`org.eclipse.lyo.oslc4j.plugins/target/repository`. The plug-ins project
produces the local p2 repository consumed by the generator:

```bash
mvn -B -pl org.eclipse.lyo.oslc4j.plugins -am verify
mvn -B -pl org.eclipse.lyo.oslc4j.codegenerator -am verify
```
