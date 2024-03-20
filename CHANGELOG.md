# Lyo Designer Changelog

## [Unreleased]

### Added
- added an optional "additionalConstraints" multi-line text attribute on Resources and ResourceProperties. The semantics of these properties This results in no code generation changes.
- Introducing a user setting that allows one to view Shapes or Vocabularies terms in the Specification models.
- Creating a common library that defines the relation between domains and vocab.
- Introducing User Preferences through a Windows->Preferences page. Specifically, the current settings allow user to choose whether Domain Specifications should show Vocabulary or Shape terms.
- Generate for JDK 17 or 11, depending on whether Lyo Version 6.x.x or below is chosen.


### Changed
- generate the necessary maven dependencies for domain models that (a) are imported into the adaptor model yet (b) the adaptor is configured to not generate code from imported models. In such scenario, the maven dependency for the domain is necessary.
- `LYO_BASE` is replaced with `LYO_BASEURL`. To override the Base URL of the adaptor, use the `baseurl` property. This release makes the use of this property consistent and check the `LYO_BASEURL` environment variable instead of `LYO_BASE`.
- Upgraded the frontend libraries from Bootstrap v4.0.0-beta to v4.2.1.

- Replaced class methods with instead methods on the ResourcesFactory class.
- Building Lyodesigner based on Eclipse 2022-03, and the corresponding versions of Sirius and Acceleo.
- Using depedency injection for Manager, Store and TRS classes
- Provide flexibility to for Store properties to be set via the Environment.
- Changing the way Resource and ResourceProperty items are represented in dialogs. We include prefixes to make their identification easier.
- Protect initServerProviders() method
- Migrated from Javax to Jakarta packages, including upgrade to Jersey 3.1.5

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
