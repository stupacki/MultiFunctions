---
name: migrate-multifunctions-3
description: Guide migrations of Kotlin, Kotlin Multiplatform, Android, JVM, JS, WASM, iOS, or native consumer projects from MultiFunctions 2.x or earlier to MultiFunctions 3.0.0. Use when updating dependency coordinates, repository setup, imports, tuple factory calls, tuple null-handling APIs, or consumer build targets for com.github.stupacki:multi-functions.
---

# MultiFunctions 3.0.0 Migration

Use this skill when a consumer project needs to adopt MultiFunctions `3.0.0` or when reviewing code for 3.0.0 compatibility.

## Workflow

1. Inspect the consumer build files before editing:
   - `settings.gradle`, `settings.gradle.kts`
   - `build.gradle`, `build.gradle.kts`
   - `gradle/libs.versions.toml`
   - Kotlin source files that import `io.multifunctions`
2. Update the dependency coordinate to `com.github.stupacki:multi-functions:3.0.0`.
3. For iOS or Kotlin/Native consumers, ensure GitHub Packages is configured because JitPack does not publish this project's Kotlin/Native iOS artifacts.
4. Replace `joinToTuple(...)` imports and calls with `toTuple(...)`.
5. Review tuple `mapNotNull` and `mapIndexedNotNull` calls for behavior changes.
6. Compile or run the most focused available consumer test/build task.

## Dependency Coordinates

Use the lowercase artifact id:

```kotlin
dependencies {
    implementation("com.github.stupacki:multi-functions:3.0.0")
}
```

For version catalogs:

```toml
[versions]
multifunctions = "3.0.0"

[libraries]
multifunctions = { module = "com.github.stupacki:multi-functions", version.ref = "multifunctions" }
```

If the project still uses `com.github.stupacki:MultiFunctions`, change it to `com.github.stupacki:multi-functions`.

## Repository Setup

JVM, Android, JS, and WASM consumers may use the normal project repository setup. iOS and other Kotlin/Native consumers should include GitHub Packages:

```kotlin
dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://maven.pkg.github.com/stupacki/MultiFunctions") {
            credentials {
                username = providers.gradleProperty("gpr.user")
                    .orElse(providers.environmentVariable("GITHUB_USER"))
                    .orNull
                password = providers.gradleProperty("gpr.key")
                    .orElse(providers.environmentVariable("GITHUB_TOKEN"))
                    .orNull
            }
        }
    }
}
```

Tell the user that GitHub Packages may require read credentials. Do not ask for tokens unless an actual build resolution step needs them.

## API Renames

Replace:

```kotlin
import io.multifunctions.joinToTuple

val tuple = joinToTuple(a, b, c)
```

With:

```kotlin
import io.multifunctions.toTuple

val tuple = toTuple(a, b, c)
```

Return types are unchanged: arity 2 returns `Pair`, arity 3 returns `Triple`, and arities 4-7 return `Quad`, `Penta`, `Hexa`, and `Hepta`.

## Null-Handling Migration

In `3.0.0`, tuple `mapNotNull` and `mapIndexedNotNull` match Kotlin standard library semantics:

- They call the transform for every tuple.
- They remove only `null` transform results.
- They no longer skip all-null input tuples before transformation.

If consumer code depends on the old skip-all-null behavior, migrate it to `mapAnyNotNull` or `mapIndexedAnyNotNull`.

```kotlin
// 2.x behavior preserved in 3.0.0
rows.mapAnyNotNull { first, second ->
    listOfNotNull(first, second).joinToString(" ")
}
```

Use `mapCheckNull` or `mapIndexedCheckNull` when the transform should run only if every tuple value is non-null.

## Target Notes

`3.0.0` covers Android, JVM, JS, WASM JS, WASM WASI, iOS, tvOS, watchOS, Linux, Windows, and Android Native targets where supported by the build host.

Verify exact native target resolution in real consumer builds. Pay particular attention to `macosX64`: it was present in earlier project builds but is not part of the current 3.0.0 target list.

## Validation

Prefer the consumer project's existing focused checks. Examples:

```sh
./gradlew build
./gradlew check
./gradlew :app:compileKotlin
./gradlew :shared:assemble
```

If dependency resolution fails for GitHub Packages, explain that `GITHUB_USER` and `GITHUB_TOKEN` or Gradle properties `gpr.user` and `gpr.key` may be required.
