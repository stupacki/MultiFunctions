package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Joins two values into a [Pair].
 *
 * @param A the type of the first value
 * @param B the type of the second value
 * @param first the first value
 * @param second the second value
 * @return a [Pair] containing the two values
 */
fun <A, B> joinToTuple(
    first: A,
    second: B,
): Pair<A, B> =
    Pair(first, second)

/**
 * Joins three values into a [Triple].
 *
 * @param A the type of the first value
 * @param B the type of the second value
 * @param C the type of the third value
 * @param first the first value
 * @param second the second value
 * @param third the third value
 * @return a [Triple] containing the three values
 */
fun <A, B, C> joinToTuple(
    first: A,
    second: B,
    third: C,
): Triple<A, B, C> =
    Triple(first, second, third)

/**
 * Joins four values into a [Quad].
 *
 * @param A the type of the first value
 * @param B the type of the second value
 * @param C the type of the third value
 * @param D the type of the fourth value
 * @param first the first value
 * @param second the second value
 * @param third the third value
 * @param fourth the fourth value
 * @return a [Quad] containing the four values
 */
fun <A, B, C, D> joinToTuple(
    first: A,
    second: B,
    third: C,
    fourth: D,
): Quad<A, B, C, D> =
    Quad(first, second, third, fourth)

/**
 * Joins five values into a [Penta].
 *
 * @param A the type of the first value
 * @param B the type of the second value
 * @param C the type of the third value
 * @param D the type of the fourth value
 * @param E the type of the fifth value
 * @param first the first value
 * @param second the second value
 * @param third the third value
 * @param fourth the fourth value
 * @param fifth the fifth value
 * @return a [Penta] containing the five values
 */
fun <A, B, C, D, E> joinToTuple(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
): Penta<A, B, C, D, E> =
    Penta(first, second, third, fourth, fifth)

/**
 * Joins six values into a [Hexa].
 *
 * @param A the type of the first value
 * @param B the type of the second value
 * @param C the type of the third value
 * @param D the type of the fourth value
 * @param E the type of the fifth value
 * @param F the type of the sixth value
 * @param first the first value
 * @param second the second value
 * @param third the third value
 * @param fourth the fourth value
 * @param fifth the fifth value
 * @param sixth the sixth value
 * @return a [Hexa] containing the six values
 */
fun <A, B, C, D, E, F> joinToTuple(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F
): Hexa<A, B, C, D, E, F> =
    Hexa(first, second, third, fourth, fifth, sixth)

/**
 * Joins seven values into a [Hepta].
 *
 * @param A the type of the first value
 * @param B the type of the second value
 * @param C the type of the third value
 * @param D the type of the fourth value
 * @param E the type of the fifth value
 * @param F the type of the sixth value
 * @param G the type of the seventh value
 * @param first the first value
 * @param second the second value
 * @param third the third value
 * @param fourth the fourth value
 * @param fifth the fifth value
 * @param sixth the sixth value
 * @param seventh the seventh value
 * @return a [Hepta] containing the seven values
 */
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
