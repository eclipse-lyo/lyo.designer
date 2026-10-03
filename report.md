# Lyo Designer SysML generator investigation and fixes

## Published oslc-domains update — 3 October 2026

Merged Lyo main `0428059da2d24ee8b0152c9348c67c0f7fad9402` into the local PR #866 branch (`e652b1e0`), then synchronized the published model from the pinned OSLC RDF revision used below. The final model update was reapplied to main's clean XML after discovering that the original synchronizer attached every top-level property declaration to every shape in a file. It now follows explicit shape-property links, supports separate RDF-shapes and Designer-domain namespaces, emits valid Designer enum values, repairs vocabulary references and deduplicates full predicate identities across local/inherited contracts. The synchronizer suite now has 49 passing tests.

Additional Designer fixes are committed as `55cd6ba` (import concrete range types), `fa68331` (omit package metadata for excluded resources) and `5ffb90f` (use explicit RDF class IRIs when excluded domains do not export generated range constants). Each generator change was rebuilt successfully under Java 21.

Both published model roots and every existing domain/vocabulary general configuration are generation-disabled. The regeneration wrapper enables the required configurations temporarily, retains the permanent hand-maintained Core exclusion and restores exact original bytes in `finally`. A downstream smoke specification deliberately enables imported-model generation but produces only its four local Java files, with no artifact Java or package metadata.

The final clean artifact build compiles 147 Java sources; all 55 resource shapes validate with zero failures. The POM and Maven coordinates remain unchanged. Full workflow, verification evidence and compatibility limits are recorded in [PUBLISHED-DOMAINS.md](C:/src/oslc/temp_gen/lyo-pr866-audit/domains/model-sync/PUBLISHED-DOMAINS.md). The update changes public contracts; examples include AM `getInstanceShape()` becoming a single Link and `getType()` becoming `Set<Link>`. The declaration diff is a review aid, not a count of binary breaks, because inherited methods can remain available. This package run does not replace the dependency used by the running SysML server; its authenticated catalog was checked again and still returns HTTP 200.

Created and validated [lyo-published-model-sync](C:/Users/Andrew/.codex/skills/lyo-published-model-sync/SKILL.md), with a committed copy in the Lyo worktree's `.agents/skills`. All changes remain local; nothing was pushed or published.

## Completed RDF migration and runtime verification — 3 October 2026

**The actual SysML/KerML model has now been synchronized, regenerated and verified with a running Jetty server.** This section supersedes the earlier audit below, whose statements about unchanged models, uncommitted synchronizer changes and unresolved startup describe the earlier state.

The synchronizer from Lyo PR #866 now has an explicit `sync-domain` migration command. It replaces the selected vocabulary/domain sections from the current RDF, reconstructs all local `rdfs:subClassOf` edges, preserves unrelated configuration and surviving resource identities, and supports imported parent resources. The checked-in Turtle snapshots are pinned to upstream `829005202d921a90cf2ed8607f2c97917f66e018`; the old RDF/XML files are retained as historical 2023 inputs. The current vocabulary namespaces are `https://www.omg.org/spec/sysml/vocabulary#` and `https://www.omg.org/spec/kerml/vocabulary#`; shapes use `https://www.omg.org/spec/SysML/20250201/shapes/` and `https://www.omg.org/spec/kerml/20250201/shapes#`.

Using the tool exposed two additional bugs. Imported AM Resource metadata must be recognized by full RDF predicate URI, otherwise generated getters duplicate inherited metadata annotations. Property IDs must also use full predicate identity: IDs based on local names confused `dcterms:type` with `sysml:type`, making a language property resolve to the metadata property. Both are fixed and regression-tested. The original duplicate title arose from the old model mapping `elementName` to `dcterms:title` while inheriting `getTitle()`. The current model has a separate language `name` predicate and inherits the metadata title.

| Verification | Result |
| --- | --- |
| Synchronizer regression suite | 38 tests pass |
| Repeat actual model synchronization | Model files byte-identical |
| Domain clean install | 540 Java sources; success |
| Server package | Success |
| Runtime ResourceShape construction | 266 classes; zero failures |
| Jetty | Java 21 / Jetty 12.1.11 running on port 8085 |
| Authenticated OSLC requests | Seven HTTP 200 responses |
| Unauthenticated catalog | HTTP 401; authentication remains enabled |

The API checks cover the service provider catalog, Element and Multiplicity resource shapes and reads, and both unfiltered and filtered OSLC queries. Response parsing checks the current language predicate/type IRIs and confirms that filtering excludes the other seeded resource. The server is available at `http://localhost:8085/sysml_oslc_server`, using the existing demo login `user:user`. Its isolated Fuseki container is `codex-sysml-rdf-20261003`, dataset `/ds` on localhost:3030, with no host volumes. The pre-existing Promcode container was left untouched. Both services remain running for review.

The domain was generated in an isolated CLI output directory, then 540 local Java files were refreshed atomically while preserving protected regions. An earlier in-place generation attempt encountered Windows file-write errors and is not the successful generation evidence. No substantive custom domain code was lost; 58 obsolete generated sources are backed up outside the compilation tree. The actual model's imported-model generation flag remains unchanged. The server was regenerated directly with the same rebuilt CLI.

Evidence is retained at `C:/src/oslc/temp_gen/sysml-rdf-migration-20261003`: `fresh-domain-generation.log`, `domain-build.log`, `server-generation.log`, `server-build.log`, `all-shapes.log`, `final-repeat-sync.log`, `jetty.log`, and `api/results.json` with response bodies. Rerun instructions are in [scripts/README.md](C:/src/oslc/misc/sysml-oslc-server/scripts/README.md); RDF provenance and synchronization commands are in the model's `source/RDF-SOURCES.md` and `source/Sync-Models.ps1`.

Limitations: shared Java properties use a cardinality envelope across subclass restrictions, so generated Java shapes do not reproduce every RDF constraint. The RDF remains authoritative. Three incomplete primitive declarations use explicit Boolean overrides (`isConstant`, `isVariable`, `mayTimeVary`); other unambiguous existing model types can provide fallbacks. The API sample does not establish complete SysML conformance or exercise the external backend/population workflow. An initially empty dataset query returned 500 because Lyo Store requires the configured graph to exist; the test fixture seeds that graph, and this library behavior was not changed. Existing server `.lost` preview customizations remain available for review; UI equivalence was not tested.

All changes are committed locally, with no pushes:

| Repository / branch | Commits |
| --- | --- |
| Designer / `codex/sysml-generator-fixes` | `7fa3c62` generator inheritance and CLI fixes; this report receives a separate documentation commit |
| Lyo PR worktree / `codex/sysml-model-sync-audit` | `fd12dc6f`, `7578f21c`, `98b4388e`, `ec0d232d`: synchronizer fixes and authoritative migration |
| SysML / `b-new-new-model-update` | `25127d7` baseline regeneration; `f6b39e6` RDF/model migration; `36cd26d` regenerated domain; `5c13a67` metadata/predicate identity fixes; `5764cc8` server and API verification; `7c1d515` rerun documentation |

## Current RDF and model-sync PR audit — 3 October 2026

Compared the working Designer vocabulary/domain XML with the four current Turtle documents in `oslc-op/oslc-specs/specs/sysml`: SysML and KerML vocabularies and OSLC shapes. Downloaded sources are retained under `C:\src\oslc\temp_gen\sysml-rdf-audit-20261003`; upstream master was `829005202d921a90cf2ed8607f2c97917f66e018`. Parsed all four with RDFlib and compared explicit RDF classes, properties and described resource classes with the XML. This uses explicit triples, without RDFS/OWL inference. `model-comparison.json` lists every name difference; a name absent from the current RDF is not assumed to be a one-to-one rename.

**The working model is out of date.** Both language vocabularies use dated `20230201/vocab#` IRIs; current vocabulary IRIs are `https://www.omg.org/spec/sysml/vocabulary#` and `https://www.omg.org/spec/kerml/vocabulary#`. The old shapes namespaces end in `20230201/shapes#`; current SysML shapes use `https://www.omg.org/spec/SysML/20250201/shapes/` and KerML uses `https://www.omg.org/spec/kerml/20250201/shapes#`. Case and trailing delimiters are significant.

| Explicit entities | Working model | Current RDF |
| --- | ---: | ---: |
| SysML vocabulary classes | 172 | 182 |
| SysML vocabulary properties | 410 | 341 |
| SysML described shape classes | 172 | 175 |
| KerML vocabulary classes | 79 | 84 |
| KerML vocabulary properties | 199 | 181 |
| KerML described shape classes | 79 | 82 |

Examples of old class names absent from current SysML RDF include `FlowConnectionDefinition`, `FlowConnectionUsage`, `ItemFlow`, and `SuccessionFlowConnectionUsage`; new names include `FlowDefinition`, `FlowUsage`, `Flow`, and `SuccessionFlowUsage`. The property changes are also extensive: the current vocabulary uses names such as `name`, rather than old owner-prefixed names such as `elementName`.

Both current Element shapes declare a language-specific `name` predicate and a separate `dcterms:title`. The working XML instead maps `elementName` to `dcterms:title`, while inheriting a different Java `getTitle()` from AM Resource. This confirms that the observed runtime collision is incompatible with the current shape mapping. Updating only the namespace or silently removing one annotation would not constitute a correct complete model migration.

Inspected [Lyo PR #866](https://github.com/eclipse-lyo/lyo/pull/866) at head `1552535d251b78c2787b97a2ebdfb8f54bd36a42`. Its original 27 tests pass. Checked it out in a separate local worktree, `C:\src\oslc\temp_gen\lyo-pr866-audit`, on branch `codex/sysml-model-sync-audit`; the main Lyo checkout is unchanged. Improved its `domains/model-sync` tool to:

- Accept `sync-shapes --vocabulary` for filenames such as `sysmlVocabularies.xml`, generating relative hrefs to the chosen file.
- Refresh an existing property's predicate link when its named RDF property changes and the target vocabulary term resolves, instead of retaining a stale link.
- Traverse all space-separated inheritance parent IDs, with cycle/diamond protection, when checking inherited properties.
- Avoid extracting an OSLC shape twice merely because it has both `rdf:type oslc:ResourceShape` and `oslc:describes`.
- Assign IDs to new shape resources.
- Reject an RDF namespace with no matching terms/shapes before writing, preventing the old 2023 namespace from silently producing an empty synchronization against current RDF.

Added six regression tests covering named vocabulary files, stale predicates, idempotence, secondary parents, diamond/cycle traversal, duplicate extraction, dry-run preservation and obsolete namespace rejection. All 33 tests pass. An actual CLI dry-run against current SysML RDF with the working model's old namespace correctly fails without changing the model; see `old-namespace-diagnostic.log`.

These improvements are local and uncommitted; nothing was pushed or posted to the PR. The synchronizer still does not automatically migrate namespace sections, infer member renames, remove obsolete terms or reconstruct inheritance from `rdfs:subClassOf`. Therefore the working model and generated Java were left unchanged by this audit. A full update requires an explicit namespace/member/inheritance migration with regeneration, Java compilation and runtime ResourceShape checks; the previous server startup failure remains unresolved.

## Working SysML checkout repaired — 3 October 2026

**The actual SysML domain checkout now passes `clean install`: all 508 Java sources compile and the domain JAR is installed locally.** Earlier successful SysML compilation covered an isolated output directory; it did not update the user's working project. The seven newly reported missing-accessor errors came from older generated classes still present in the working checkout at `15d1a98`, not the verified generated output. The original generator build that produced those incomplete classes remains unidentified.

Regenerated the working domain with the fixed specification CLI, Java 21, and marker `7.0.0.dev+sysml-working-20261003`. The expected accessors are emitted, including `getActionDefinitionAction`, `getFlowConnectionUsageFlowConnectionDefinition`, `getIncludeUseCaseUsageUseCaseIncluded`, `getMetadataUsageMetadataDefinition`, `getPerformActionUsagePerformedAction`, and `getSatisfyRequirementUsageSatisfyingFeature`. The old colliding `MetadataFeature` identity is superseded by domain-qualified class names.

The working project originally contained 356 Java files. Regeneration added 304 domain-qualified files but does not remove the 152 obsolete unqualified files. Those obsolete sources were checked for generated-file markers and substantive protected code; none contained custom implementation. They were moved outside the compilation tree into `C:\src\oslc\temp_gen\sysml-working-regeneration-20261003\superseded`, leaving 508 source files. This is a recoverable naming migration, not permanent deletion.

The first compilation after that migration revealed three retained vocabulary classes using the old constant API (`KERML_VOCABULARY_NAMSPACE`, etc.), incompatible with current references such as `NS` and `FEATUREMEMBERSHIP_LOCAL_NAME`. Because the source model sets `doNotGenerateFromImportedModels=true`, normal regeneration did not refresh those classes. Generated a current isolated model copy with that flag disabled, then refreshed only `DctermsVocabularyConstants.java`, `Kerml_vocabVocabularyConstants.java`, and `Sysml_vocabVocabularyConstants.java` in the working output. All original protected regions, including copyright/license text, were preserved. The source model's configuration and XML hash remain unchanged.

The current imported domain-model configuration also generates the required `oslc-domains` dependency automatically. Removed its now-redundant copy from the POM's protected dependency block, leaving one dependency declaration.

Regeneration created 11 new `.lost` files; there are 13 including the two pre-existing files. Inspection found no substantive protected code in any of them. They remain available for review. The entire pre-regeneration source tree, POM and model are backed up in the same investigation directory.

Validation used the repository Maven wrapper with the actual domain POM: `clean install` succeeded under Java 21, compiled all 508 sources, built `sysml-oslc-domain-0.1.0-SNAPSHOT.jar`, and installed it into the local Maven repository. The module has no tests. Evidence: `generation.log`, `stale-audit.json`, `lost-audit.json`, `vocab-generation.log`, and `domain-clean-install-verified.log` under `C:\src\oslc\temp_gen\sysml-working-regeneration-20261003`.

The server verification below supersedes the earlier domain-only limitation. Working changes remain uncommitted and nothing was pushed.

## Working server regeneration — 3 October 2026

Removed duplicate protected dependency declarations for `sysml-oslc-domain` and `oslc-domains` from the server POM, retaining the declarations generated from the model. Regenerated the server using the same fixed CLI and its `toolchain.xml`, with the server-model directory as the output base. Generated references now use the domain-qualified resource names.

Migrated the handwritten `PopulationService` and `ProjectCommitSelectionService` from `javax.inject`, `javax.servlet` and `javax.ws.rs` to their Jakarta equivalents. Updated PopulationService to the current `Sysml_shElement` type and accessor API. Its additional RDF identifier and short-title metadata are preserved as extended properties because those convenience fields are absent from the current model. Verified that the Lyo extended-properties getter returns the mutable backing map.

The actual server passes Maven `-DskipTests package` under Java 21 and produces `target/sysml_oslc_server.war`. This verifies Java compilation and WAR assembly; tests were skipped. Evidence is `server-generation.log` and `server-package-migrated.log` in `C:\src\oslc\temp_gen\sysml-working-regeneration-20261003`.

Server regeneration created nine new `.lost` files. Some contain substantive custom preview getter lists, unlike the domain's placeholder-only lost blocks. These files and the pre-regeneration server source backup remain recoverable. Current upstream templates generate resource-specific preview JSPs instead of using those legacy generic-preview lists; equivalent preview behavior has not been verified.

Jetty startup was also attempted with `jetty:run-war`. The connector bound to port 8085, but the application failed initialization: `OslcCoreDuplicatePropertyDefinitionException` reports duplicate `http://purl.org/dc/terms/title` annotations for `Sysml_shMultiplicity` during `ResourceShapeFactory` registration. Thus successful compilation does not establish runtime compatibility. This separate RDF-property collision remains unresolved; evidence is `jetty-startup.log`. The smoke-test process was stopped.

## Promcode compatibility check — 2 October 2026

**Zero additional breaking changes from this patch were detected in Promcode.** All 73 compared project/model files match between upstream and fixed regeneration, after the same normalization used for Refimpl. No patch-specific files, Java types, method signatures, POM content, JSP content or lost protected content differ.

The checkout at `C:\src\oslc\misc\promcode-lyo-server` initially used `gen/260710` (`8818590`) with only an untracked domain-model copy. The existing branch was preserved; switched to `main` and fast-forwarded to `b419c44`. The old domain-model copy differed from the current Lyo source, so it was backed up under the investigation directory and refreshed from `C:\src\oslc\lyo\domains\org.eclipse.lyo.tools.domainmodels`. Both generations used this identical domain-model source and unchanged latest-main toolchain model.

Ran the same fixed CLI as the SysML/Refimpl checks, and the freshly compiled upstream control from the Refimpl investigation, with marker `7.0.0.dev+promcode-compat-20261002`. The toolchain config uses `filesBasePath="."`, so `OutputDirectory` was the nested `promcode-lyo-server` project, matching the target intended by the model project's `generationPath=../promcode-lyo-server`.

| Comparison/check | Result |
| --- | --- |
| Fixed versus upstream | 73 files each; 0 changed, 0 added, 0 removed |
| Fixed versus committed main | 12 changed; 20 added; 0 removed |
| Added output | 16 JSPs, `LyoAppConfiguration.java`, 3 `.lost` files |
| Committed baseline `mvn test` | Build succeeds; 18 Java sources compile; no tests present |
| Fixed regeneration `mvn test` | Build succeeds; 19 Java sources compile; no tests present |
| Protected implementation lost | None: all `.lost` content consists of TODO placeholders |
| Freshness audit | 26 tracked Java/JSP/XML generated candidates rewritten; 4 not rewritten |

The three `.lost` files are `pom.xml.lost`, `ArtifactService.java.lost` and `ProjectService.java.lost`. The POM contains the old `plugins` placeholder, replaced by upstream template guard names; the services contain four preview getter-list TODO blocks. Both generators produce exactly the same protected content. The stale retained candidates are `LyoGeneratedAppConfig.java` and the generic UI JSPs `selectiondialog.jsp`, `uipreview.jsp`, and `viewresource.jsp`. Nothing was deleted automatically.

### Upstream migrations separate from this patch

- Generated compilation release changes from Java 17 to Java 21.
- Jetty changes from `org.eclipse.jetty:jetty-maven-plugin:11.0.20` to `org.eclipse.jetty.ee10:jetty-ee10-maven-plugin:12.1.11`; Cargo and other build plugins also update.
- Swagger UI changes from `5.18.2` to `5.32.8`; the generated POM removes the Eclipse snapshot repository, adds compile-scope `slf4j-api`, and declares `maven-enforcer-plugin` without a version. The latter produces a Maven warning but does not fail the checked build.
- Generic UI/preview dispatch becomes resource-specific JSP dispatch and `oslc-ui-model` is removed, despite the legacy model flag `generateJspFilesForOslcUI="true"`. These changes occur equally in upstream and fixed generation. Browser behavior and Jetty/Fuseki integration were not exercised by the compilation check.

Promcode uses imported PROMCODE resource classes and `doNotGenerateFromImportedModels=true`; it has no local resource specification. Like Refimpl, this does not exercise local multiple inheritance or colliding resource-class renaming. It adds coverage of store-backed server generation and a model with the legacy generic-UI flag, while the SysML and dedicated fixture checks cover local resource generation.

The regenerated files and domain-model copy remain uncommitted on Promcode `main`; the old generation branch is intact. No changes were pushed. Evidence is under `C:\src\oslc\temp_gen\promcode-compatibility-20261002`: `comparison.json`, `compare_generation.py`, `fixed-generation.log`, `upstream-generation.log`, `committed-test.log`, `fixed-test.log`, `promcode-main.tar`, and `saved-domainmodels/`.

## Refimpl compatibility check — 2 October 2026

**Zero additional breaking changes from this patch were detected in Refimpl.** All 359 compared source/model files are identical between regeneration with freshly compiled upstream templates and regeneration with the fixed templates. This establishes zero patch-specific file additions, removals or content changes, including Java APIs, POMs, JSPs and JavaScript, for the current Refimpl model. It is not a universal compatibility claim for arbitrary Designer models.

Updated `C:\src\oslc\refimpl` by fast-forwarding `main` from `be90cde` to `8935f96a2ad2f5b89e3ec7d3a5caace9d24c082c`, then regenerated its actual working checkout using the same rebuilt CLI and Java 21. The checkout was clean before updating. A Git archive of this exact Refimpl revision supplied the identical input for the upstream control run.

For the control, archived Designer `c8c6974` into an isolated directory and freshly compiled its original templates with the code-generator reactor `verify`. Only the Java 21 target configuration and the same CLI entry point/script were copied in; none of the inheritance, naming, escaping, vocabulary or standalone-POM fixes were applied. The unchanged common runtime classes and product plugin dependencies were shared with the fixed run. Both invocations used the same domain-model source, original model configuration, output-directory layout and generator version marker: `7.0.0.dev+refimpl-compat-20261002`.

| Comparison/check | Result |
| --- | --- |
| Fixed versus upstream source/model inventory | 359 files on each side; 0 changed, 0 added, 0 removed |
| Patch-specific Java changes or renamed types | 0 |
| Fixed versus committed Refimpl | 67 files modified; 44 JSPs and 1 `.lost` file added; 0 files removed |
| Maven `test`, committed Refimpl control | All 7 modules succeed; all 4 executed tests pass |
| Maven `test`, fixed regeneration | All 7 modules succeed; all 4 executed tests pass |
| Protected-content loss attributable to patch | 0; both runs produce the same TODO-only `.lost` content |
| Freshness audit | 212 tracked Java/JSP/XML generated candidates rewritten; 14 retained candidates not rewritten |

The comparison normalizes CRLF/LF and ignores only the blank/date/separator header of `.lost` files. It excludes Maven `target`, `overlays`, and `dependency-reduced-pom.xml` build output. The two `.lost` protected blocks and their comments match exactly. The default Maven tests cover compilation across the four servers and client plus repository/TRS tests; Docker acceptance tests and browser/JSP behavior were not tested. An initial parallel test attempt caused a shared port-9998 collision; the committed control was rerun sequentially and passed. That harness failure is not a generator defect.

### Regeneration changes already present upstream

- All four server POMs downgrade Swagger UI from `5.32.14` to template value `5.32.8`.
- CM replaces its generic HTML/preview JSP dispatch with resource-specific pages and removes the `oslc-ui-model` dependency. Its `.lost` file contains only the two `setResourceGetterMethods` TODO comments, with no custom implementation to restore.
- Selection-dialog services and JSPs adopt upstream HTMX behavior and new `*-selector-results.jsp` output naming. Some generated bodies and responses therefore change relative to the committed implementation, despite no patch-specific difference.
- The 14 retained generated candidates comprise nine old selector-results JSPs, three CM generic-UI JSPs, and two RM Java files (`RMConstants.java` and `resources/package-info.java`). These are stale-file audit candidates, not automatic deletion recommendations. They remain in the checkout; both control and fixed generation retain them.

Refimpl has `doNotGenerateFromImportedModels=true` on all four adaptors, empty per-adaptor resource specifications, and an empty local dummy domain. Its resource classes come from the external domain library. Consequently, this is a meaningful server-template/consumer compatibility check, but does not exercise local multiple-inheritance storage generation, colliding local resource class names, or standalone domain POM generation. Those paths remain covered by the SysML generation and dedicated fixture below. The collision fix's naming migration still applies to affected SysML models even though Refimpl needs no patch-specific migration.

Refimpl regeneration remains uncommitted in its `main` checkout, including the required copied `org.eclipse.lyo.tools.domainmodels` directory, generated JSPs and the TODO-only `.lost` file. No source model configuration was changed and nothing was pushed. Full evidence and the reproducible comparison script are in `C:\src\oslc\temp_gen\refimpl-compatibility-20261002`: `comparison.json`, `compare_generation.py`, `upstream-generator-build.log`, `upstream-generation.log`, `fixed-generation.log`, `committed-refimpl-test-sequential.log`, and `fixed-refimpl-test.log`.

## Latest `main` rebuild and verified fixes — 2 October 2026

**The generator fixes compile the full regenerated SysML domain: 508 Java sources.** A dedicated generated-code fixture also passes Java compilation and runtime assertions after two generation passes. The original collapsed-getter failure remains unreproduced; it should not be attributed to multiple inheritance without identifying the original generator build.

### Source revision and build

Fetched the renamed remote branch, `origin/main`, at `c8c6974`. Work is on `codex/sysml-generator-fixes`, based on that revision. The earlier commits remain on their original branches (`2ff11d7` in Designer and `7ef6ef5` in the SysML repository); earlier uncommitted investigation changes were saved in a stash before switching. Nothing has been pushed. The fixes described below are currently uncommitted.

Latest Lyo dependencies require Java 21. The CLI now checks for Java 21 or newer, and the Tycho target configuration explicitly resolves against JavaSE-21. Setting `JAVA_HOME` after changing directory avoids the local mise directory hook resetting the chosen JDK. The build used Temurin 21.0.11.

The initial template compile encountered stale compiled `.emtl` query signatures. Deleting those generated template files, then rebuilding, resolved the errors. The CLI's `-Build` path now removes the generated `.emtl` files before building. The code-generator reactor `verify` and the complete 23-module `package` build both succeeded. The complete build produced the Windows CLI plugin runtime as well as the other product packages.

### Reproduced defects and implemented fixes

1. **Secondary ancestors already supplied by a Java superclass were implemented again.** Previously, subtraction considered only the first-parent chain. For example, `CalculationDefinition` redeclared `behaviorStep` and `behaviorParameter` already implemented by `ActionDefinition`. `resourceServices.mtl` now considers all RDF ancestors supplied by the selected Java superclass. A shared `implementationProperties` query deduplicates local/interface property references and excludes the same property objects already implemented by the superclass. `generateResource.mtl` uses it consistently for fields, adders, getters and setters. `CalculationDefinition` now inherits these accessors and storage.

2. **Same Java names in one package overwrote different RDF resources.** Fresh upstream generation reports 152 paths written twice because SysML and KerML resources share names and a configured package. `javaName(Resource, ...)` now prefixes colliding names with the domain namespace prefix; noncolliding names retain their existing names. All template callers share this calculation. The complete fixed output retains both domains' classes/interfaces and has no duplicate-path diagnostics or `.lost` files. This is an API naming change: callers of affected classes must migrate, and stale previously generated unprefixed files require a deliberate cleanup when applying the new generator to an existing project. The tested collision scope is resources within the same containing specification and Java package.

3. **Model text was embedded directly in Java string literals.** Resource/property titles and descriptions containing line breaks, quotes or backslashes produced invalid Java. A shared Java string-escaping service now handles them, along with property-definition names, allowed values and vocabulary string constants. The fixture verifies that annotations retain the original text at runtime.

4. **Vocabulary constants changed RDF local names during Java identifier normalization.** A vocabulary class named `Class` received a prefixed Java identifier, and the old template also used that transformed identifier as its RDF local-name value. Constants now preserve the actual vocabulary class name, while Java identifiers remain escaped. The fixture asserts an exact `https://example.org/vocabulary#Class` describes URI.

5. **Fresh standalone domain POMs had unmanaged dependency versions.** They declared `slf4j-api` and `oslc4j-core` without a parent or dependency-management import. Both standalone POM templates now supply the Lyo BOM as the default content of the existing `pre_dependencies` protected block. Existing customized BOM content remains preserved. A previously empty protected block still overrides the new default and may need migration; the successful fixture covers fresh generation and regeneration with the default BOM.

The CLI also supports standalone specification generation through `-Specification`, using `GenerateSpecification` registration and module selection. The visited-resource traversal guards secondary-ancestor enumeration against revisiting nodes; this does not implement comprehensive inheritance-cycle validation throughout all templates.

### Validation and interpretation

| Check | Fresh latest-main baseline | Fixed generation |
| --- | --- | --- |
| SysML Java sources | 353 | 508 with imported vocabulary generation enabled |
| Paths written twice | 152 | 0 |
| Fresh `.lost` files | Present | 0 |
| Standalone POM dependency management | Missing | Lyo BOM supplied |
| Generated inheritance fixture | Overwrites and invalid annotation literals | Compiles; runtime assertions pass |
| Complete SysML domain compile | Fresh POM initially stops at missing dependency versions | All 508 sources compile with project dependency customization |

The 155 additional sources comprise 152 recovered collision outputs and three vocabulary constant classes. The original model has `doNotGenerateFromImportedModels=true`; the final compilation fixture changes that flag to false **only in an isolated model copy**, so the referenced vocabulary constants are generated. Missing imported constants under the original flag are configuration behavior, not a newly established template defect. The rebuilt upstream templates already emit a complete POM: the earlier run's missing POM/module-resolution exception came from stale or invalid compiled templates.

The SysML model references external `org.eclipse.lyo.oslc.domains.Person`. Its existing generated POM supplies `org.eclipse.lyo:oslc-domains` in the protected dependencies block. Fresh default generation does not supply that project customization. For full Java compilation, the isolated fixed output received the existing project's dependency block; no generated Java source was edited. Compilation then succeeded. This verifies the generated domain sources and their inheritance contracts, not the complete OSLC server or its runtime integration.

`scripts/tests/Test-GeneratedInheritance.ps1` generates the fixture twice, inserts a protected method between runs, rejects `.lost` files, compiles the output, and runs `VerifyGeneratedInheritance`. Assertions cover a diamond, a child repeating a superclass-supplied secondary ancestor, shared local/inherited property references, same-name resources in two domains, annotation escaping, RDF vocabulary identity, and protected-code preservation. It does not cover incompatible separately defined properties with the same Java accessor signature or arbitrary inheritance cycles.

Run the repository test script with a new output directory:

```powershell
.\scripts\tests\Test-GeneratedInheritance.ps1 `
    -JavaHome 'C:\Users\Andrew\AppData\Local\mise\installs\java\temurin-21.0.11+10.0.LTS' `
    -DomainModelsSource 'C:\src\oslc\lyo\domains\org.eclipse.lyo.tools.domainmodels'
```

Evidence is under `C:\src\oslc\temp_gen\sysml-main-verification-20261002`:

- `baseline-generation.log`: fresh latest-main collision diagnostics.
- `clean-template-build.log`: successful fresh template compilation.
- `fixed-full-build.log`: successful complete product build and subsequent CLI generation.
- `fixture-final.log`: successful generated-code compilation and runtime assertions.
- `sysml-final-generation.log`: complete fixed SysML generation without collision diagnostics.
- `sysml-final-compile-with-project-dependencies.log`: full 508-source compilation success.
- `sysml-final-compile-verified.log`: successful verification after removing an accidentally duplicated dependency introduced by the compilation harness.
- `sysml-final/`: isolated model and generated/compiled domain; original application files are unchanged.

## Historical analysis and proposals

The remainder records the earlier cached-template investigation and proposed alternatives. Its build observations are superseded where corrected above. Parent-interface inheritance and contextual accessor-name redesign remain proposals, not changes implemented by this patch.

## Verification results — 2 October 2026

**The collapsed-getter failure does not reproduce with the available CLI templates.** Fresh generation and regeneration over the committed output both restore all missing local getters. Multiple inheritance still warrants improvements, but it is not a demonstrated cause of the original collapsed getters.

| Check | Committed baseline | Fresh domain generation | Regeneration over existing files |
| --- | --- | --- | --- |
| Java source files | 356 | 353 | 356 |
| Locally declared getters | 142 | 613 | 613 |
| Fields lacking corresponding local getters | 472 across 97 classes | 0 | 0 |
| `ActionUsage` getters | 1 | 3 | 3 |
| `FeatureMembership` getters | 1 | 4 | 4 |

The local-getter audit is a textual check of private fields against getter names; it is not a Java type checker. A separate name-based audit of interface methods against each generated class and its superclass chain found no missing method names in fresh output. Return-type, parameter-type and annotation compatibility still require compilation or deeper checks.

The three files absent from fresh output are `DctermsVocabularyConstants.java`, `Kerml_vocabVocabularyConstants.java`, and `Sysml_vocabVocabularyConstants.java`. They survive in existing output but are not regenerated. This is incomplete generation, not evidence that these files should be deleted.

### What is confirmed

- Fresh `ActionUsage` has `getActionUsageActionDefinition()`, `getStepBehavior()`, and `getStepParameter()`, each with the matching RDF property annotation. Fresh `FeatureMembership` has all four expected getters. `ConstraintDefinition` has `getBehaviorParameter()`.
- Redundant secondary-parent implementation is real: both `ActionDefinition` and its subclass `CalculationDefinition` emit storage and accessors for `behaviorStep` and `behaviorParameter`. Proposal 1 remains relevant to this duplication, although the duplication does not by itself prove a runtime failure.
- Resource interfaces still have no parent-interface `extends` clause. Proposal 3 describes a contract improvement, not a reproduced cause of missing getters.
- The specification run reports **152 output paths generated twice**. SysML and KerML contain same-named resources mapped to the same Java package and file names. This is a separate, confirmed output-identity defect and must be addressed before accepting the domain output.
- Even fresh generation produces `Feature.java.lost` and `InvocationExpression.java.lost`. Their newly produced entries contain empty protected blocks for `featureIsNonunique` and `invocationExpressionOperand`; no substantive custom code appears in those fresh lost entries. The corresponding existing `.lost` files change during regeneration. This supports collisions within a single generation run, rather than a problem exclusively with previously generated files.
- Generated annotations contain raw multiline descriptions. For example, `AllocationDefinition.java` has actual line breaks inside the `@OslcResourceShape` description string. A Maven compile of the 353 fresh sources, using a compiler supporting `--release 21`, fails with 100 reported syntax errors including unclosed string literals. The parser failures prevent a complete Java contract/type verdict.
- The fresh specification run emits no POM and no vocabulary constants. It logs `AcceleoEvaluationException: Error while resolving module dependencies.` and nevertheless prints `Generation finished.` Exit status alone is not sufficient to accept generation.
- The model's resource IDs are unique under case-sensitive comparison. A preliminary PowerShell audit incorrectly suggested duplicates because its default string comparisons were case-insensitive; that result was corrected and is not a model defect.

### What remains unproven

The original getter collapse has not been reproduced. Its original generator build remains unidentified. Proposal 2's contextual accessor naming is a source-level risk, but this run does not demonstrate a missing interface method caused by it. Do not describe either as an established root cause of the original 19 errors.

### Build and CLI investigation

Existing changes were committed before testing, without pushing:

- Designer: `2ff11d7` — report and existing adaptor-model Eclipse project metadata.
- SysML server: `7ef6ef5` — restore the truncated domain POM closing sections. Maven OAuth overlays were left untracked as build output.

The original CLI selects the server `generate.mtl` entry point. A server-model run regenerated `Application.java` with a unique verification marker, but the model's `doNotGenerateFromImportedModels="true"` setting left the separately configured domain untouched. That run cannot verify domain getters.

For direct domain testing, the CLI was extended locally with an explicit `-Specification` switch. It selects the existing `generateSpecification.mtl` module and passes no extra server-template argument. Package and resource-factory registration remain available for standalone execution. These verification-enabling changes have not been committed.

The first root build used Java 25 despite the requested Java 17 and failed parsing Eclipse p2 metadata with `jdk.xml.maxGeneralEntitySizeLimit`. Disabling Maven startup hooks did not fix the runtime selection. The directory change triggers the mise environment hook; moving the script's JDK assignment after `Push-Location` resulted in a verified Java 17 process.

The JDK 17 root build compiled the Java CLI but failed in Acceleo template compilation with `XMLTypePackage.getAnyURI()` because `theXMLTypePackage` was null. Consequently, generation used the newly compiled CLI with the **previously available compiled `.emtl` templates**, including `generateResource.emtl` dated 25 July 2026. It is not a successful fresh template build. All source `.mtl` copies in `target/classes` matched repository sources byte-for-byte, but that does not establish the provenance of the older compiled `.emtl` files. This limits conclusions about freshly compiled templates and the original December generator build.

Designer generation ran under JDK 17. The domain POM targets Java 21; the first domain compile under Java 17 failed because release 21 is unsupported. A stale Java 21 installation path also failed to launch. The actual syntax-checking compile used the available JDK 25 with the POM's release 21 setting. For that fresh-output compilation only, the committed repaired POM was copied into the isolated output because generation produced none. The compile therefore tests generated Java with a supplied harness POM, not successful POM generation.

### Reproduction artifacts

All generation was performed in isolated copies below `C:/src/oslc/temp_gen/sysml-verification-20261001/`; the working SysML model and generated sources were preserved.

- `fresh/`: copied original models and initially empty generated output.
- `existing/`: original models and source snapshot from committed SysML revision `7ef6ef5`.
- `fresh-generation.log`: initial root-build failure under Java 25.
- `fresh-domain-generation.log`: interrupted retry before the JDK selection fix.
- `fresh-domain-generation-jdk17.log`: root build under JDK 17, including Acceleo compiler failure.
- `existing-generation.log`: server-only generation, which did not regenerate the domain.
- `fresh-domain-existing-templates.log` and `existing-domain-generation.log`: direct domain runs using the available compiled templates.
- `baseline-audit.json`, `fresh-audit.json`, `existing-audit.json`, and `fresh-contract-audit.json`: getter and method-name audit results. The fresh audit records the missing POM before the harness copy.
- `fresh-domain-compile.log`, `fresh-domain-compile-jdk21.log`, and `fresh-domain-compile-release21.log`: compiler attempts and actual syntax errors.
- `Audit-GeneratedDomain.ps1` and `Audit-InterfaceContracts.ps1`: reproducible textual checks.

Direct domain command, after the local CLI changes and Java compilation:

```powershell
& C:\src\oslc\lyo.designer\scripts\Invoke-LyoDesignerCodeGenerator.ps1 `
  -ModelPath C:\src\oslc\temp_gen\sysml-verification-20261001\fresh\org.oasis.oslcop.sysml.oslc-domain-model\sysmlDomainSpecification.xml `
  -OutputDirectory C:\src\oslc\temp_gen\sysml-verification-20261001\fresh\org.oasis.oslcop.sysml.oslc-domain-model `
  -DomainModelsSource C:\src\oslc\lyo\domains\org.eclipse.lyo.tools.domainmodels `
  -JavaHome 'C:\Program Files\Eclipse Adoptium\jdk-17.0.20.101-hotspot' `
  -CodegenVersion '7.0.0.dev+20261002-sysml-fresh' `
  -Specification
```

### Revised priorities

1. Escape all model text used in Java string literals, including resource-shape descriptions and property annotations. Use a shared literal encoder for quotes, backslashes, CR/LF, and control characters.
2. Resolve Java class/interface/file identity across domains. Detect duplicate output paths before writing; either require distinct configured packages or provide a deliberate naming policy. Valid same-named RDF resources must not silently overwrite each other.
3. Make specification generation complete: POM and vocabulary constants must be produced, and failures must be visible in the CLI result. Repair the fresh template-build failure so source-template changes can be verified.
4. Remove redundant secondary-parent property implementation using Proposal 1 and add diamond fixtures.
5. Evaluate stable accessor naming and parent-interface inheritance with focused fixtures. These remain proposed improvements, not reproduced causes of the getter collapse.
6. Identify the original generator build and reproduce its collapsed getters before attributing that historical corruption to a particular template or engine behavior.

The original proposal below is retained as the pre-verification analysis. Its claims of uncertainty and proposed changes should be read in light of these results.

## Scope and evidence

The SysML domain on `b-new-new-model-update` contains generated classes that fail to implement interface getters. The supplied build report lists 19 compilation errors following regeneration in commit `3791c4c`. Earlier generated output at `f87f989` contains the missing getters.

RDF/SysML multiple inheritance should remain supported. The proposed fixes concern its projection into Java: one concrete superclass, multiple interface parents, and a complete, consistent property implementation.

The initial analysis inspected the local Lyo Designer checkout at `b1c85da` (`codex/headless-codegen-cli`). At that stage no generator changes or regeneration tests had been performed. The verification section above records the subsequent investigation. The generator build used for the original failing regeneration has not been identified or reproduced.

## Observed getter corruption

In `sysml-oslc-server/org.oasis.oslcop.sysml.oslc-domain/src/main/java/org/oasis/oslcop/sysml/ActionUsage.java`, the generated class extends `OccurrenceUsage` and implements `IActionUsage` and `IStep`. All three fields and setters exist, but only `getStepParameter()` exists. That getter carries the protected-area marker and RDF property annotation for `actionUsageActionDefinition`.

Likewise, `FeatureMembership.java` contains four fields and setters but only `getFeaturingFeature()`.

The current `files/generateResource.mtl` already loops over local properties plus `interfaceProperties()` for getters, as it does for setters. Simply adding secondary-parent properties to the getter loop is therefore not a demonstrated fix. The mixed annotation/method output indicates corruption during generation or subsequent processing; its precise cause remains unconfirmed.

First reproduce the failure with the original generator build, both into an empty directory and over existing generated files. Capture Acceleo diagnostics and compare output before any subsequent processing. This separates template evaluation, protected-area preservation, stale compiled templates, and later transformations without assuming which caused the failure.

## Eclipse Lyo runtime libraries

No runtime-library patch is indicated by the inspected evidence. The immediate failures concern generated Java contracts and implementations.

## Lyo Designer proposal 1: compute effective properties across the inheritance graph

Target: `org.eclipse.lyo.oslc4j.codegenerator/src/org/eclipse/lyo/oslc4j/codegenerator/services/resourceServices.mtl`, especially `allProperties()`, `inheritedProperties()`, `interfaceResources()`, and `interfaceProperties()`.

Currently, `inheritedProperties()` follows only the first-parent chain. `interfaceResources()` excludes that chain, but does not exclude secondary ancestors whose implementations are already supplied by the concrete Java superclass. `allProperties()` concatenates property collections without deduplicating shared properties.

For example, if a superclass already implements an interface ancestor, a subclass can emit that ancestor's fields and accessors again. In diamonds, repeated property occurrences also affect name resolution.

Replace these overlapping calculations with explicit, shared queries:

```text
effectiveProperties(R) =
    distinct(properties of R and every transitive RDF parent)

providedBySuperclass(R) =
    effectiveProperties(firstParent(R)), or empty when no parent exists

propertiesToImplement(R) =
    effectiveProperties(R) minus providedBySuperclass(R)
```

Use deterministic traversal with a visited set. Deduplicate a model property reached through multiple inheritance paths. For separate declarations mapping to the same RDF predicate, check compatibility before merging; do not silently discard differing types, cardinalities, ranges, or other contract metadata. Intentional property refinements need an explicit resolution policy.

Use `propertiesToImplement()` consistently for fields, getters, setters, adders, and their required imports in `files/generateResource.mtl`. Use `effectiveProperties()` for consumers that need the complete resource contract, including previews and service/UI property enumeration.

Validate inheritance cycles with an actionable diagnostic. A shared ancestor reached twice is a valid diamond, not a cycle.

## Lyo Designer proposal 2: stabilize accessor names

Target: `org.eclipse.lyo.oslc4j.codegenerator/src/org/eclipse/lyo/oslc4j/codegenerator/services/resourcePropertyServices.mtl`, especially `javaAttributeName()` and accessor-name queries.

`javaAttributeName(property, resource)` currently chooses whether to prefix a name by counting matching names in `allProperties(resource)`. A property can consequently receive a different name when viewed from a subclass with additional parents, or when duplicated traversal paths inflate the count. That can make an implementation disagree with the interface declaring the property.

Resolve each property's Java name using its declaration context and reuse the resolved name everywhere:

```text
interface method name = implementation method name = inherited method name
```

Preserve existing names where possible. Detect remaining Java signature collisions explicitly. Namespace prefixes alone cannot distinguish every collision within one domain. Compatible inherited signatures can share an implementation; incompatible signatures require a diagnostic or an explicit mapping policy.

Do not fix collisions by independently renaming inherited methods in each consuming class. Review any naming changes for generated API compatibility and protected-area preservation.

## Lyo Designer proposal 3: generate interface inheritance

Target: `org.eclipse.lyo.oslc4j.codegenerator/src/org/eclipse/lyo/oslc4j/codegenerator/files/generateResourceInterface.mtl`, plus class declaration/import generation in `files/generateResource.mtl`.

The current resource interface declares its local properties but does not extend interfaces for its RDF parents. Generate all direct parent interfaces, for example:

```java
public interface IActionUsage extends IOccurrenceUsage, IStep {
    // Locally declared accessors
}

public class ActionUsage extends OccurrenceUsage
        implements IActionUsage {
    // Implement properties absent from OccurrenceUsage
}
```

Java interface inheritance represents all RDF parents while the concrete class retains one Java superclass. Generate imports for parent interfaces from other domains. Use the same accessor-name resolution for interface declarations and class implementations.

Preserve the existing first-parent superclass selection for the initial patch to minimize changes to generated APIs. Do not reorder parents implicitly.

## Regression tests and acceptance criteria

Add generation fixtures and compile the generated Java. Tests must check annotation correctness as well as method presence: compilation alone would not detect a getter mapped to the wrong RDF predicate.

| Fixture | Required outcome |
| --- | --- |
| `ActionUsage` | Three distinct getters, each with its correct RDF property annotation |
| `FeatureMembership` | Four distinct getters, matching its interface contracts |
| Diamond inheritance | One storage location and one implementation per shared property |
| Superclass already implements a secondary ancestor | Subclass emits no duplicate storage for that ancestor |
| Colliding property names | Interface and class signatures agree; incompatible collisions produce diagnostics |
| Cross-domain inheritance | Parent-interface and property-type imports compile |
| Fresh generation | Complete getter output in an empty destination |
| Regeneration | Complete getter output with protected user content preserved |
| Inheritance cycle | Clear diagnostic without unbounded recursion |

Acceleo protected areas use unique markers. Existing generated files must therefore be included in regression tests, without assuming protected-area processing caused the observed collapse. Reference: [Acceleo user guide](https://wiki.eclipse.org/Acceleo/User_Guide).

After the minimal fixtures pass, regenerate the SysML domain and compile it. Compare getter annotations against the model, and regenerate a second time to verify stable output and user-code preservation.

## Separate POM defect

The supplied report also describes a generated POM missing closing `</dependencies></project>` tags. Investigate this independently through the POM template and generation diagnostics. It is not established as a consequence of multiple inheritance.

## Recommended patch sequence

1. Reproduce and fix the collapsed-getter output with a minimal fixture and fresh/regeneration tests.
2. Introduce shared effective-property and superclass-provided-property calculations.
3. Stabilize accessor names and add collision diagnostics.
4. Generate parent-interface inheritance and verify cross-domain imports.
5. Regenerate and compile the complete SysML domain, checking annotations and preservation of user code.

Restoring missing getters directly in generated SysML classes can unblock a build, but the durable fix belongs in the generator and its regression fixtures.
