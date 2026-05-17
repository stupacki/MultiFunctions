# Changelog

## 3.0.0

### Breaking Changes

- The tuple factory function has been renamed from `joinToTuple(...)` to `toTuple(...)`.
- `mapNotNull` and `mapIndexedNotNull` now match Kotlin standard library semantics: the transform is called for every tuple, and only `null` transform results are removed.
- The previous `mapNotNull` behavior, where tuples with all values set to `null` were skipped before transformation, now lives in `mapAnyNotNull` and `mapIndexedAnyNotNull`.
- The published artifact should be consumed as `com.github.stupacki:multi-functions:3.0.0`.
- Native/iOS consumers must resolve the library from GitHub Packages for this release. JitPack does not publish the Kotlin/Native iOS artifacts for this project.
- Published targets changed as part of the Kotlin Multiplatform publishing update. Consumers should verify that their target is available before upgrading, especially if they depended on `macosX64` in earlier releases.

### Added

- Added tuple-unpacking `filter`, `onEach`, and `fold` extensions for `Pair`, `Triple`, `Quad`, `Penta`, `Hexa`, and `Hepta` iterables.
- Added lazy `Sequence` extensions for tuple-unpacking `map`, `mapNotNull`, `mapAnyNotNull`, `mapCheckNull`, `filter`, `onEach`, and `fold`.
- Added `mapAnyNotNull` and `mapIndexedAnyNotNull` for workflows that should skip only tuples where every value is `null`.
- Added Android, JVM, JS, WASM JS, WASM WASI, iOS, tvOS, watchOS, Linux, Windows, and Android Native publication coverage where supported by the build host.
- Added GitHub Packages publishing support for the multiplatform artifacts.
- Added external-consumer integration projects that verify published package resolution across JVM, Android, iOS, JS, WASM, and native consumers.

### Changed

- Updated the build to Kotlin `2.3.21` and Android Gradle Plugin `9.2.1`.
- Switched Android publication setup to the Android Kotlin Multiplatform library plugin.
- Removed the explicit Kotlin standard library dependency from common source sets and now rely on the Kotlin plugin defaults.
- Simplified source and test filenames by removing the historical `Multi` prefix.
- Reworked `notNull` internals to use direct null checks instead of reified casts.
- Refreshed README examples to document the current API names and null-handling behavior.

### Fixed

- Fixed `mapNotNull` and `mapIndexedNotNull` API semantics so they no longer skip all-null input tuples before calling the transform.
- Fixed tuple model documentation for `Quad`, `Penta`, `Hexa`, and `Hepta`.
- Fixed packaging and repository configuration so published GitHub Packages artifacts can be consumed from independent builds.

## 2.0.1

- Previous stable release.
