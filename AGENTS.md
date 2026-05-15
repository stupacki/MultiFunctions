# Agent Notes

## Project

MultiFunctions is a Kotlin Multiplatform extension library published as:

```text
com.github.stupacki:multi-functions
```

The library source lives in `multi-functions/`. The `integration/` directory is a separate Gradle build that verifies published GitHub Packages artifacts from the perspective of external consumers.

## Build And Test

Use the repository root wrapper for normal library work:

```sh
./scripts/build-library quick
./scripts/build-library check
./scripts/build-library build
./gradlew :multi-functions:check
./gradlew :multi-functions:assemble
```

`./scripts/build-library quick` runs the fast local matrix:

```text
:multi-functions:jvmTest
:multi-functions:testAndroidHostTest
:multi-functions:jsNodeTest
:multi-functions:wasmJsNodeTest
:multi-functions:wasmWasiNodeTest
```

Use `./gradlew tasks --all` if task names are uncertain. There is no root `testAllUnitTest` task.

## Publishing

The default artifact version comes from `artifactVersion` in `gradle.properties`. Most scripts accept an optional version override:

```sh
./scripts/build-library release-local
./scripts/build-library release-github 2.1.1
```

GitHub Packages publishing requires:

```sh
export GITHUB_USER=<your-github-user>
export GITHUB_TOKEN=<token-with-package-write-access>
```

## Integration Build

The integration build intentionally resolves the published package, not the local project. It usually needs read credentials for GitHub Packages:

```sh
export GITHUB_USER=<your-github-user>
export GITHUB_TOKEN=<token-with-read-packages>
```

Run integration tasks from the repository root with `-p integration`, or from inside `integration/` with `../gradlew`.

Quote task paths that contain `kmp-app` when sharing commands. This prevents accidental shell line breaks at the hyphen from turning `:kmp-app:...` into `:kmp-` plus a second command.

Useful integration commands:

```sh
./gradlew -p integration ":kmp-app:jsNodeDevelopmentRun"
./gradlew -p integration ":kmp-app:jsNodeProductionRun"
./gradlew -p integration ":kmp-app:wasmJsNodeDevelopmentRun"
./gradlew -p integration ":kmp-app:wasmWasiNodeDevelopmentRun"
./gradlew -p integration ":kmp-app:assemble"
./gradlew -p integration ":android-app:assembleDebug"
./gradlew -p integration ":ios-app:linkDebugFrameworkIosSimulatorArm64"
```

Expected JS/WASM smoke output is similar to:

```text
Multi Functions GitHub Packages resolved for JS Node application in 4 target groups with smoke sum 36
```

## Code Style

- Keep Kotlin sources in package `io.multifunctions` unless working in the integration app.
- Prefer extension functions and tuple model patterns already present in `multi-functions/src/commonMain`.
- Add or update common tests under `multi-functions/src/commonTest` for behavior changes.
- Keep generated build output, IDE metadata, and local credentials out of commits.
- Do not replace the integration build dependency with a project dependency; it exists to validate external package resolution.

## Wrapper Notes

The root and integration Gradle wrappers should stay aligned when intentionally updating Gradle. If adding wrapper files under `integration/`, make sure `.gitignore` allows:

```text
!/integration/gradle/wrapper/gradle-wrapper.jar
!/integration/gradle/wrapper/gradle-wrapper.properties
!/integration/gradlew
!/integration/gradlew.bat
```
