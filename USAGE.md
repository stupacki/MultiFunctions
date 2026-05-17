# Multi Functions Usage

This guide shows the public APIs available from `io.multifunctions`. Tuple collection helpers support `Pair`, `Triple`, `Quad`, `Penta`, `Hexa`, and `Hepta` unless a section says otherwise.

## Table Of Contents

- [Imports](#imports)
- [Tuple Models](#tuple-models)
- [toTuple](#totuple)
- [notNull](#notnull)
- [let](#let)
- [letCheckNull](#letchecknull)
- [forEach](#foreach)
- [forEachIndexed](#foreachindexed)
- [map](#map)
- [mapIndexed](#mapindexed)
- [mapNotNull](#mapnotnull)
- [mapIndexedNotNull](#mapindexednotnull)
- [mapCheckNull](#mapchecknull)
- [mapIndexedCheckNull](#mapindexedchecknull)
- [mapAnyNotNull](#mapanynotnull)
- [mapIndexedAnyNotNull](#mapindexedanynotnull)
- [flatMap](#flatmap)
- [filter](#filter)
- [onEach](#oneach)
- [fold](#fold)
- [Sequence APIs](#sequence-apis)
- [Choosing A Null-Handling Function](#choosing-a-null-handling-function)

## Imports

Import only the functions and tuple models you use:

```kotlin
import io.multifunctions.mapCheckNull
import io.multifunctions.models.Quad
```

## Tuple Models

Kotlin already has `Pair` and `Triple`. Multi Functions adds `Quad`, `Penta`, `Hexa`, and `Hepta`.

```kotlin
import io.multifunctions.models.Quad
import io.multifunctions.models.Penta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Hepta

val quad = Quad("Ada", "Lovelace", 1815, "UK")
val penta = Penta("Grace", "Hopper", 1906, "US", "COBOL")
val hexa = Hexa(1, 2, 3, 4, 5, 6)
val hepta = Hepta("a", "b", "c", "d", "e", "f", "g")

val values: List<Int> = hexa.toList()
```

Use `toList()` when all tuple values have the same type.

## toTuple

Use `toTuple(...)` when you want the library to choose the tuple type by arity.

```kotlin
import io.multifunctions.toTuple

val pair = toTuple("first", "last")
val triple = toTuple("Ada", "Lovelace", 1815)
val quad = toTuple("Ada", "Lovelace", 1815, "mathematician")
val hepta = toTuple(1, 2, 3, 4, 5, 6, 7)
```

Arity 2 returns `Pair`, arity 3 returns `Triple`, and arities 4 through 7 return `Quad`, `Penta`, `Hexa`, and `Hepta`.

## notNull

Use `notNull` when a block should run only if every individual value is non-null.

```kotlin
import io.multifunctions.notNull

val fullName: String? = notNull(firstName, lastName) { first, last ->
    "$first $last"
}
```

If any input is `null`, the result is `null` and the block is not called.

## let

Use tuple `let` to unpack tuple values into one block. Nullable values are passed through.

```kotlin
import io.multifunctions.let
import io.multifunctions.models.Quad

val profile = Quad(user, orders, favorites, notes)

val summary = profile.let { user, orders, favorites, notes ->
    "$user has ${orders?.size ?: 0} orders, ${favorites?.size ?: 0} favorites, and $notes"
}
```

## letCheckNull

Use `letCheckNull` when every tuple value must be non-null before the block runs.

```kotlin
import io.multifunctions.letCheckNull

val total: Int? = Pair(price, quantity).letCheckNull { price, quantity ->
    price * quantity
}
```

If either tuple value is `null`, `total` is `null`.

## forEach

Use tuple `forEach` to unpack every row for side effects.

```kotlin
import io.multifunctions.forEach

val users = listOf(
    Triple("Ada", "Lovelace", 1815),
    Triple("Grace", "Hopper", 1906),
)

users.forEach { firstName, lastName, birthYear ->
    println("$firstName $lastName was born in $birthYear")
}
```

## forEachIndexed

Use `forEachIndexed` when the row index is also needed.

```kotlin
import io.multifunctions.forEachIndexed

users.forEachIndexed { index, firstName, lastName, _ ->
    println("$index: $firstName $lastName")
}
```

## map

Use tuple `map` to transform every tuple while unpacking its values.

```kotlin
import io.multifunctions.map

val names = users.map { firstName, lastName, _ ->
    "$firstName $lastName"
}
```

## mapIndexed

Use `mapIndexed` to transform every tuple with its index.

```kotlin
import io.multifunctions.mapIndexed

val labels = users.mapIndexed { index, firstName, lastName, _ ->
    "${index + 1}. $firstName $lastName"
}
```

## mapNotNull

Use `mapNotNull` when the transform itself can return `null`. The transform is called for every tuple.

```kotlin
import io.multifunctions.mapNotNull

val adults = users.mapNotNull { firstName, lastName, birthYear ->
    "$firstName $lastName".takeIf { birthYear != null && birthYear < 2008 }
}
```

Only `null` transform results are removed.

## mapIndexedNotNull

Use `mapIndexedNotNull` when the transform can return `null` and needs the index.

```kotlin
import io.multifunctions.mapIndexedNotNull

val evenRows = users.mapIndexedNotNull { index, firstName, lastName, _ ->
    "$firstName $lastName".takeIf { index % 2 == 0 }
}
```

## mapCheckNull

Use `mapCheckNull` when the transform should run only for tuples where every value is non-null.

```kotlin
import io.multifunctions.mapCheckNull

val totals = listOf(
    Pair(10, 2),
    Pair(null, 4),
    Pair(7, 3),
).mapCheckNull { price, quantity ->
    price * quantity
}
```

The row with a `null` value is skipped before the transform is called.

## mapIndexedCheckNull

Use `mapIndexedCheckNull` when the transform should run only for fully non-null tuples and needs the index.

```kotlin
import io.multifunctions.mapIndexedCheckNull

val indexedTotals = listOf(
    Pair(10, 2),
    Pair(null, 4),
    Pair(7, 3),
).mapIndexedCheckNull { index, price, quantity ->
    "$index:${price * quantity}"
}
```

## mapAnyNotNull

Use `mapAnyNotNull` when tuples with all values set to `null` should be skipped, while partially-null tuples should still be transformed.

```kotlin
import io.multifunctions.mapAnyNotNull

val displayNames = listOf(
    Pair(null, null),
    Pair("Ada", null),
    Pair(null, "Lovelace"),
).mapAnyNotNull { firstName, lastName ->
    listOfNotNull(firstName, lastName).joinToString(" ")
}
```

## mapIndexedAnyNotNull

Use `mapIndexedAnyNotNull` for skip-all-null behavior with access to the row index.

```kotlin
import io.multifunctions.mapIndexedAnyNotNull

val indexedNames = listOf(
    Pair(null, null),
    Pair("Ada", null),
    Pair(null, "Lovelace"),
).mapIndexedAnyNotNull { index, firstName, lastName ->
    "$index:${listOfNotNull(firstName, lastName).joinToString(" ")}"
}
```

## flatMap

Use tuple `flatMap` when each tuple expands to zero or more values.

```kotlin
import io.multifunctions.flatMap

val tagsByUser = listOf(
    Pair("Ada", listOf("math", "logic")),
    Pair("Grace", listOf("compiler", "navy")),
)

val tags = tagsByUser.flatMap { name, tags ->
    tags.orEmpty().map { tag -> "$name:$tag" }
}
```

## filter

Use tuple `filter` to keep tuple rows by unpacked values.

```kotlin
import io.multifunctions.filter

val historicalUsers = users.filter { _, _, birthYear ->
    birthYear != null && birthYear < 1900
}
```

## onEach

Use tuple `onEach` to inspect unpacked values while keeping the original iterable.

```kotlin
import io.multifunctions.onEach

val sameUsers = users.onEach { firstName, lastName, _ ->
    println("Loaded $firstName $lastName")
}
```

## fold

Use tuple `fold` to accumulate over unpacked tuple values.

```kotlin
import io.multifunctions.fold

val birthYearSum = users.fold(0) { sum, _, _, birthYear ->
    sum + (birthYear ?: 0)
}
```

## Sequence APIs

Sequence helpers are lazy and return `Sequence` except for terminal operations such as `fold`.

Sequence `map`:

```kotlin
import io.multifunctions.map

val labels = sequenceOf(Pair("Ada", 1815), Pair("Grace", 1906))
    .map { name, year -> "$name:$year" }
    .toList()
```

Sequence `mapNotNull`:

```kotlin
import io.multifunctions.mapNotNull

val knownYears = sequenceOf(Pair("Ada", 1815), Pair("Unknown", null))
    .mapNotNull { name, year -> year?.let { "$name:$it" } }
    .toList()
```

Sequence `mapAnyNotNull`:

```kotlin
import io.multifunctions.mapAnyNotNull

val sequenceNames = sequenceOf(Pair(null, null), Pair("Ada", null), Pair(null, "Lovelace"))
    .mapAnyNotNull { firstName, lastName -> listOfNotNull(firstName, lastName).joinToString(" ") }
    .toList()
```

Sequence `mapCheckNull`:

```kotlin
import io.multifunctions.mapCheckNull

val checkedSums = sequenceOf(Pair(1, 2), Pair(null, 4), Pair(5, 6))
    .mapCheckNull { left, right -> left + right }
    .toList()
```

Sequence `filter` and `onEach`:

```kotlin
import io.multifunctions.filter
import io.multifunctions.onEach

val observed = sequenceOf(
    Pair(1, 2),
    Pair(null, 4),
    Pair(5, 6),
)
    .filter { left, right -> left != null || right != null }
    .onEach { left, right -> println("$left + $right") }
    .toList()
```

Sequence `fold`:

```kotlin
import io.multifunctions.fold

val sum = sequenceOf(Pair(1, 2), Pair(3, 4))
    .fold(0) { acc, left, right -> acc + (left ?: 0) + (right ?: 0) }
```

## Choosing A Null-Handling Function

Use `mapNotNull` when every tuple should be transformed and only `null` transform results should be removed.

Use `mapCheckNull` when the transform requires all tuple values to be non-null.

Use `mapAnyNotNull` when only fully-null tuples should be skipped and partially-null tuples should still be transformed.

Use `letCheckNull` or `notNull` when you are working with a single tuple or a fixed set of values instead of an iterable.
