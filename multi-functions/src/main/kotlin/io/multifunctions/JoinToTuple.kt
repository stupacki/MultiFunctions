package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Joins [A] and [B] into a [Pair]
 */
public fun <A, B> joinToTuple(
    first: A,
    second: B,
): Pair<A, B> = Pair(first, second)

/**
 * Joins [A], [B] and [C] into a [Triple]
 */
public fun <A, B, C> joinToTuple(
    first: A,
    second: B,
    third: C,
): Triple<A, B, C> = Triple(first, second, third)

/**
 * Joins [A], [B], [C] and [D] into a [Quad]
 */
public fun <A, B, C, D> joinToTuple(
    first: A,
    second: B,
    third: C,
    fourth: D,
): Quad<A, B, C, D> = Quad(first, second, third, fourth)

/**
 * Joins [A], [B], [C], [D] and [E] into a [Penta]
 */
public fun <A, B, C, D, E> joinToTuple(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
): Penta<A, B, C, D, E> = Penta(first, second, third, fourth, fifth)

/**
 * Joins [A], [B], [C], [D], [E] and [F] into a [Hexa]
 */
public fun <A, B, C, D, E, F> joinToTuple(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
): Hexa<A, B, C, D, E, F> = Hexa(first, second, third, fourth, fifth, sixth)

/**git config --global user.name "John Doe"
 * Joins [A], [B], [C], [D], [E], [F] and [G] into a [Hepta]
 */
public fun <A, B, C, D, E, F, G> joinToTuple(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G,
): Hepta<A, B, C, D, E, F, G> = Hepta(first, second, third, fourth, fifth, sixth, seventh)
