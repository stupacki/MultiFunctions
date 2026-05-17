# Multi Functions 3.0.0 Migration Guide

This guide is for applications and libraries upgrading from `2.0.1` or earlier to `3.0.0`.

## 1. Update The Dependency

Use the lowercase artifact id:

```kotlin
dependencies {
    implementation("com.github.stupacki:multi-functions:3.0.0")
}
```

JVM, Android, JS, and WASM consumers can use the same coordinate. iOS and other Kotlin/Native consumers should resolve the package from GitHub Packages because JitPack does not currently publish this project's Kotlin/Native iOS artifacts.

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

GitHub Packages may require credentials even for read access. Use a token with package read access.

## 2. Rename `joinToTuple` To `toTuple`

Replace imports and calls:

```kotlin
// Before
import io.multifunctions.joinToTuple

val row = joinToTuple("Ada", "Lovelace", 1815)
```

```kotlin
// After
import io.multifunctions.toTuple

val row = toTuple("Ada", "Lovelace", 1815)
```

The returned tuple types are unchanged: arity 2 returns `Pair`, arity 3 returns `Triple`, and arities 4 through 7 return `Quad`, `Penta`, `Hexa`, and `Hepta`.

## 3. Review `mapNotNull` Usage

In `3.0.0`, tuple `mapNotNull` follows Kotlin standard library behavior. The transform is called for every tuple, including tuples where every value is `null`; only `null` transform results are removed.

```kotlin
val rows = listOf(
    Pair(null, null),
    Pair("Ada", null),
)

rows.mapNotNull { first, second ->
    listOfNotNull(first, second).joinToString(" ").ifBlank { null }
}
```

If your old code relied on `mapNotNull` skipping all-null tuples before the transform was called, migrate that call to `mapAnyNotNull`:

```kotlin
// Before: 2.x skipped Pair(null, null) before calling the transform.
rows.mapNotNull { first, second ->
    listOfNotNull(first, second).joinToString(" ")
}
```

```kotlin
// After: keep the 2.x skip-all-null behavior explicitly.
rows.mapAnyNotNull { first, second ->
    listOfNotNull(first, second).joinToString(" ")
}
```

Use the same rule for indexed calls:

```kotlin
// Standard Kotlin semantics: transform every tuple.
rows.mapIndexedNotNull { index, first, second ->
    "$index:$first:$second".takeIf { first != null || second != null }
}

// Skip only tuples where every tuple value is null before transformation.
rows.mapIndexedAnyNotNull { index, first, second ->
    "$index:$first:$second"
}
```

Use `mapCheckNull` or `mapIndexedCheckNull` when the transform should run only if every tuple value is non-null.

## 4. Recompile Consumers

Treat `3.0.0` as a normal major-version recompilation. The `notNull` API remains source-compatible for normal usage, but its implementation no longer uses reified type parameters and casts. Recompile dependent modules rather than mixing previously compiled binaries with the new library.

## 5. Check Target Availability

`3.0.0` expands publication coverage to Android, JVM, JS, WASM JS, WASM WASI, iOS, tvOS, watchOS, Linux, Windows, and Android Native targets where supported by the build host.

Before upgrading production native consumers, verify that your exact target resolves. Pay particular attention to `macosX64`: it was present in earlier project builds but is not part of the current 3.0.0 target list.

## 6. Optional API Updates

After the required migration is complete, consumers can simplify tuple pipelines with the new helpers:

```kotlin
rows
    .filter { first, second -> first != null || second != null }
    .onEach { first, second -> println("$first $second") }
    .fold(0) { count, first, second ->
        if (first != null || second != null) count + 1 else count
    }
```

For lazy pipelines, use the new `Sequence` extensions:

```kotlin
sequenceOf(Pair(1, 2), Pair(null, null))
    .mapAnyNotNull { first, second -> first?.plus(second ?: 0) }
    .toList()
```
