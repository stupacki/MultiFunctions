# Multi-Functions [![](https://jitpack.io/v/stupacki/MultiFunctions.svg)](https://jitpack.io/#stupacki/MultiFunctions)

Multi Functions is an extension library written in Kotlin for processing and binding multiple data to a single operation. It extends the standard libraries of Kotlin and can be used alongside them without interference.

## Download the Latest Version

### Using Gradle with Groovy DSL

**Root Project `build.gradle`:**
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

**Module `build.gradle`:**
```groovy
dependencies {
    implementation 'com.github.stupacki:MultiFunctions:<insert version>'
}
```

### Using Gradle with Kotlin DSL and Dependency Resolution Management

**`settings.gradle.kts`:**
```kotlin
dependencyResolutionManagement {
    repositories {
        ...
        maven { url = uri("https://jitpack.io") }
    }
}
```

**`libs.versions.toml`:**
```toml
[versions]
multifunctions = "<insert version>"

[libraries]
multifunctions = { module = "com.github.stupacki:MultiFunctions", version.ref = "multifunctions" }
```

**Module `build.gradle.kts`:**
```kotlin
dependencies {
    implementation(libs.multifunctions)
}
```

## What is this Library About?

Multi Functions is designed to simplify the process of binding multiple data values to a single operation, avoiding deep hierarchy structures in your code. It provides several utility functions to handle multiple nullable and non-nullable values efficiently.

## Examples

### Multi Let

Bind multiple data values to a single operation without deep hierarchy structures. All values passed to the function can be nullable.

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

### Multi LetCheckNull

If you don't want to deal with null values within your let operations, use `letCheckNull`.

```kotlin
val apiResult = Pair(
    userApi.get(userId),
    ordersApi.get(userId),
)

apiResult.letCheckNull { user, orders ->
    HttpResult.renderPage(
        user = user,
        orders = orders,
    )
}
```

### Multi Map

Use `Multi Map` for data table tests. For example, testing a function `Calculate.xPlusY(x: Int?, y: Int?)` with multiple test data:

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

For non-nullable values, use `mapCheckNull`:

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

## License

Distributed under the Apache 2.0 License. Copyright © 2017 Benny Schneider