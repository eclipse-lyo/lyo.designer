# Lyo Designer Changelog

## [Unreleased]

### Added
- added an optional "additionalConstraints" multi-line text attribute on Resources and ResourceProperties. The semantics of these properties This results in no code generation changes.
- Introducing a user setting that allows one to view Shapes or Vocabularies terms in the Specification models.
- Creating a common library that defines the relation between domains and vocab.
- Introducing User Preferences through a Windows->Preferences page. Specifically, the current settings allow user to choose whether Domain Specifications should show Vocabulary or Shape terms.


### Changed

- `LYO_BASE` is replaced with `LYO_BASEURL`. To override the Base URL of the adaptor, use the `baseurl` property. This release makes the use of this property consistent and check the `LYO_BASEURL` environment variable instead of `LYO_BASE`.
- Upgraded the frontend libraries from Bootstrap v4.0.0-beta to v4.2.1.

- Replaced class methods with instead methods on the ResourcesFactory class.

### Deprecated

### Removed

- The CSS and JS assets from Bootstrap are no longer bundled. The following files should be removed from the generated codebase:
  - `src/main/webapp/static/css/bootstrap-4.0.0-beta.min.css`
  - `src/main/webapp/static/js/bootstrap-4.0.0-beta.min.js`
  - `src/main/webapp/static/js/jquery-3.2.1.min.js`
  - `src/main/webapp/static/js/popper-1.11.0.min.js`

### Fixed

---

**Template**

## [Unreleased]

### Added

### Changed

### Deprecated

### Removed

### Fixed


> See https://keepachangelog.com/en/1.0.0/ for more info.
