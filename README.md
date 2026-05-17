# Multi-Functions [![Release](https://jitpack.io/v/stupacki/MultiFunctions.svg)](https://jitpack.io/#stupacki/MultiFunctions) ![Weekly downloads](https://jitpack.io/v/stupacki/MultiFunctions/week.svg) ![Monthly downloads](https://jitpack.io/v/stupacki/MultiFunctions/month.svg)

Multi Functions is an extension library written in Kotlin for processing and binding multiple data to a single operation. It extends the standard libraries of Kotlin and can be used alongside them without interference.

## Installation

Use the dependency coordinate:

```text
com.github.stupacki:multi-functions:<VERSION>
```

JVM, Android, JS, and WASM consumers can use either JitPack or GitHub Packages. iOS and Kotlin/Native consumers should use GitHub Packages because JitPack does not currently publish this project's Kotlin/Native iOS artifacts.

### JitPack

Add JitPack to your repositories:

```kotlin
dependencyResolutionManagement {
    repositories {
        maven { url = uri("https://jitpack.io") }
    }
}
```

Then add the dependency:

```kotlin
dependencies {
    implementation("com.github.stupacki:multi-functions:<VERSION>")
}
```

For Groovy DSL:

```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.stupacki:multi-functions:<VERSION>'
}
```

### GitHub Packages

Add GitHub Packages to your repositories:

```kotlin
dependencyResolutionManagement {
    repositories {
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

Then add the dependency:

```kotlin
dependencies {
    implementation("com.github.stupacki:multi-functions:<VERSION>")
}
```

GitHub Packages may require credentials with package read access.

### Version Catalog

Use the same coordinate with either repository source:

```toml
[versions]
multifunctions = "<VERSION>"

[libraries]
multifunctions = { module = "com.github.stupacki:multi-functions", version.ref = "multifunctions" }
```

```kotlin
dependencies {
    implementation(libs.multifunctions)
}
```

### GitHub Packages With Groovy DSL

If your project uses Groovy DSL, add GitHub Packages like this:

```groovy
dependencyResolutionManagement {
    repositories {
        maven {
            url = uri('https://maven.pkg.github.com/stupacki/MultiFunctions')
            credentials {
                username = providers.gradleProperty('gpr.user')
                    .orElse(providers.environmentVariable('GITHUB_USER'))
                    .orNull
                password = providers.gradleProperty('gpr.key')
                    .orElse(providers.environmentVariable('GITHUB_TOKEN'))
                    .orNull
            }
        }
    }
}
```

```groovy
dependencies {
    implementation 'com.github.stupacki:multi-functions:<VERSION>'
}
```

## What is this Library About?

Multi Functions is designed to simplify binding tuple values to a single operation. It lets you unpack `Pair`, `Triple`, `Quad`, `Penta`, `Hexa`, and `Hepta` values directly in common Kotlin operations without nested destructuring or deep nullable chains.

The library provides:

- Tuple models for arities missing from the Kotlin standard library: `Quad`, `Penta`, `Hexa`, and `Hepta`
- Tuple factories through `toTuple(...)`
- Tuple-unpacking `let`, `forEach`, `map`, `flatMap`, `filter`, `onEach`, and `fold`
- Indexed variants such as `mapIndexed`, `mapIndexedNotNull`, and `mapIndexedCheckNull`
- Null-aware variants for common workflows: `letCheckNull`, `mapCheckNull`, `mapAnyNotNull`, and `notNull`
- Lazy `Sequence` variants for map/filter/onEach/fold style pipelines

See [USAGE.md](USAGE.md) for examples of every public library function.

## Examples

### Let

Bind multiple values to a single operation. All values passed to `let` can be nullable.

```kotlin
import io.multifunctions.let

val apiResult = Quad(
    userApi.get(userId),
    ordersApi.get(userId),
    favoritesApi.get(userId),
    notesApi.get(userId),
)

apiResult.let { user, orders, favorites, notes ->
    HttpResult.renderPage(
        user = user,
        orders = orders,
        favorites = favorites,
        notes = notes,
    )
}
```

### LetCheckNull

Use `letCheckNull` when the block should run only if every tuple value is non-null.

```kotlin
val apiResult = Pair(
    userApi.get(userId),
    ordersApi.get(userId),
)

val result = apiResult.letCheckNull { user, orders ->
    HttpResult.renderPage(
        user = user,
        orders = orders,
    )
}
```

If either value is `null`, `result` is `null` and the block is not called.

### Map

Use tuple-unpacking `map` for data table tests. For example, testing a function `Calculate.xPlusY(x: Int?, y: Int?)` with multiple test data:

```kotlin
val testData = listOf(
    Triple(1, 1, 2),
    Triple(-1, 1, 0),
    Triple(-1, -1, -2),
    Triple(0, 0, 0),
)

testData.map { xData, yData, expectedResult ->
    Calculate.xPlusY(x = xData, y = yData) shouldBe expectedResult
}
```

Use `mapCheckNull` when the transform should run only for rows where every tuple value is non-null:

```kotlin
import io.multifunctions.mapCheckNull

val testData = listOf(
    Triple(1, 1, 2),
    Triple(-1, 1, 0),
    Triple(-1, -1, -2),
    Triple(0, 0, 0),
)

testData.mapCheckNull { xData, yData, expectedResult ->
    Calculate.xPlusY(x = xData, y = yData) shouldBe expectedResult
}
```

Use `mapNotNull` when the transform itself can return `null`. This follows Kotlin's standard `mapNotNull` behavior: all rows are passed to the transform, and only `null` transform results are removed.

```kotlin
testData.mapNotNull { xData, yData, expectedResult ->
    Calculate.xPlusY(x = xData, y = yData)
        .takeIf { it == expectedResult }
}
```

Use `mapAnyNotNull` when rows with all tuple values set to `null` should be skipped before transformation, while partially-null rows should still be handled.

```kotlin
listOf(
    Pair(null, null),
    Pair("Ada", null),
    Pair(null, "Lovelace"),
).mapAnyNotNull { firstName, lastName ->
    listOfNotNull(firstName, lastName).joinToString(" ")
}
```

Indexed variants are available for the same workflows:

```kotlin
testData.mapIndexedCheckNull { index, xData, yData, expectedResult ->
    "$index: ${Calculate.xPlusY(x = xData, y = yData) == expectedResult}"
}
```

### Filter, OnEach, And Fold

Tuple values can also be unpacked in common collection operations:

```kotlin
val rows = listOf(
    Triple("Ada", "Lovelace", 1815),
    Triple("Grace", "Hopper", 1906),
)

rows
    .filter { _, _, year -> year < 1900 }
    .onEach { firstName, lastName, _ ->
        println("$firstName $lastName")
    }
    .fold(0) { count, _, _, _ ->
        count + 1
    }
```

### Sequence Pipelines

The tuple helpers are also available for lazy `Sequence` pipelines:

```kotlin
sequenceOf(Pair(1, 2), Pair(3, 4))
    .filter { x, y -> x != null && y != null }
    .onEach { x, y -> println("$x + $y") }
    .mapCheckNull { x, y -> x + y }
    .toList()
```

### Tuple Factories

Use `toTuple(...)` to create tuples without choosing the concrete tuple class yourself:

```kotlin
val pair = toTuple("left", "right")
val quad = toTuple("one", "two", "three", "four")
val hepta = toTuple(1, 2, 3, 4, 5, 6, 7)
```

## License

Distributed under the Apache 2.0 License. Copyright © 2017-2026 Benny Schneider
