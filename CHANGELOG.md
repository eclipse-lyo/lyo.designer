# Eclipse Lyo Designer Changelog

## [7.0.0-SNAPSHOT]

### Added

- Python code generation for OSLC resource classes, domain and vocabulary constants, package initializers, dependency metadata, and license files
- Support for Lyo BOM (allows to remove most of the dependency versions needed to run a Jersey-based OSLC Lyo server)
- Spotless guards around imports to allow applying Maven Spotless on generated code
- Root services URI is now prominently displayed on the home page for convenience
- Adaptors now print a large "ECLIPSE LYO" banner on startup for easy identification in the logs, especially when running multliple containers via Docker Compose

### Changed

- Deduplicated shared Java and Python code generator services and static-file templates into common packages
- Restructured the Java code generator into dedicated `java` subpackages to separate language-specific generator code
- Generate for JDK 21 when using Lyo SDK 7.0.0.
- All OPTIONS requests are not exempted from the authentication filter (to let the CORS preflight requests in).
- CORS support was reworked to work on all adaptor endpoints (not just Delegated UI dialogs), to support authentication correctly, and to allow CORS support be restricted to a few "CORS friend" origins.
- Bootstrap in templates was upgraded from v4 to v5 
- Generate for Jetty 12
- Added JNDI environment lookup for LYO_BASEURL

### Deprecated

### Removed

### Fixed

- "Jumping" of the preview dialogs was fixed along with them quickly disappearing before you could scroll them 
- If your code throws a WebApplicationException, generated code will not wrap it in another 500 WebApplicationException and instead re-throw it directly

## [6.0.0.Final]

### Added
- Generate for JDK 17 or 11, depending on whether Lyo Version 6.x.x or below is chosen.

### Changed
- generate the necessary maven dependencies for domain models that (a) are imported into the adaptor model yet (b) the adaptor is configured to not generate code from imported models. In such scenario, the maven dependency for the domain is necessary.
- Protect initServerProviders() method
- (**Breaking change**🧨) Migrated from Javax to Jakarta packages 
- upgrade to Jersey 3.1.5

### Deprecated

### Removed
- (**Breaking change**🧨) Removed support for JDK 11 (and all versions below 17) in the generated code. **JDK 17 is the new baseline for Eclipse Lyo.** The SDK and sample code has been tested using JDK 17, 20, and 21-ea.
- (**Breaking change**🧨) Removed support for Java EE and Jakarta EE 8 in the generated code.

### Fixed


## [5.1.1]

### Added
- added an optional "additionalConstraints" multi-line text attribute on Resources and ResourceProperties. The semantics of these properties This results in no code generation changes.
- Introducing a user setting that allows one to view Shapes or Vocabularies terms in the Specification models.
- Creating a common library that defines the relation between domains and vocab.
- Introducing User Preferences through a Windows->Preferences page. Specifically, the current settings allow user to choose whether Domain Specifications should show Vocabulary or Shape terms.


### Changed
- `LYO_BASE` is replaced with `LYO_BASEURL`. To override the Base URL of the adaptor, use the `baseurl` property. This release makes the use of this property consistent and check the `LYO_BASEURL` environment variable instead of `LYO_BASE`.
- Upgraded the frontend libraries from Bootstrap v4.0.0-beta to v4.2.1.

- Replaced class methods with instead methods on the ResourcesFactory class.
- Building Lyodesigner based on Eclipse 2022-03, and the corresponding versions of Sirius and Acceleo.
- Using depedency injection for Manager, Store and TRS classes
- Provide flexibility to for Store properties to be set via the Environment.
- Changing the way Resource and ResourceProperty items are represented in dialogs. We include prefixes to make their identification easier.

### Deprecated

### Removed

- The CSS and JS assets from Bootstrap are no longer bundled. The following files should be removed from the generated codebase:
  - `src/main/webapp/static/css/bootstrap-4.0.0-beta.min.css`
  - `src/main/webapp/static/js/bootstrap-4.0.0-beta.min.js`
  - `src/main/webapp/static/js/jquery-3.2.1.min.js`
  - `src/main/webapp/static/js/popper-1.11.0.min.js`

### Fixed
- Deprecated properties no longer cause errors when validating.
- generating PackageInfo schema annotations in the correct packages/folders where the resource classes are defined.


---

**Template**

## [Unreleased]

### Added

### Changed

### Deprecated

### Removed

### Fixed


> See https://keepachangelog.com/en/1.0.0/ for more info.
