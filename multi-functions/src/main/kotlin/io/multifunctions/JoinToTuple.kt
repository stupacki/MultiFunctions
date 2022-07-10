package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

fun <A, B> joinToTuple(
    first: A,
    second: B,
): Pair<A, B> =
    Pair(first, second)

fun <A, B, C> joinToTuple(
    first: A,
    second: B,
    third: C,
): Triple<A, B, C> =
    Triple(first, second, third)

fun <A, B, C, D> joinToTuple(
    first: A,
    second: B,
    third: C,
    fourth: D,
): Quad<A, B, C, D> =
    Quad(first, second, third, fourth)

fun <A, B, C, D, E> joinToTuple(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
): Penta<A, B, C, D, E> =
    Penta(first, second, third, fourth, fifth)

fun <A, B, C, D, E, F> joinToTuple(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F
): Hexa<A, B, C, D, E, F> =
    Hexa(first, second, third, fourth, fifth, sixth)

fun <A, B, C, D, E, F, G> joinToTuple(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G
): Hepta<A, B, C, D, E, F, G> =
    Hepta(first, second, third, fourth, fifth, sixth, seventh)
