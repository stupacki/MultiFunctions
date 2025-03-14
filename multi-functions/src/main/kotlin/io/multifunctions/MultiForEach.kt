package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Performs the given [action] on each [Pair] element.
 *
 * @param A the type of the first value in the pair
 * @param B the type of the second value in the pair
 * @param action the function to perform on each pair
 */
inline fun <A, B> Iterable<Pair<A?, B?>>.forEach(
    action: (A?, B?) -> Unit
) = forEach { (first, second) ->
    action(first, second)
}

/**
 * Performs the given [action] on each [Triple] element.
 *
 * @param A the type of the first value in the triple
 * @param B the type of the second value in the triple
 * @param C the type of the third value in the triple
 * @param action the function to perform on each triple
 */
inline fun <A, B, C> Iterable<Triple<A?, B?, C?>>.forEach(
    action: (A?, B?, C?) -> Unit
) = forEach { (first, second, third) ->
    action(first, second, third)
}

/**
 * Performs the given [action] on each [Quad] element.
 *
 * @param A the type of the first value in the quad
 * @param B the type of the second value in the quad
 * @param C the type of the third value in the quad
 * @param D the type of the fourth value in the quad
 * @param action the function to perform on each quad
 */
inline fun <A, B, C, D> Iterable<Quad<A?, B?, C?, D?>>.forEach(
    action: (A?, B?, C?, D?) -> Unit
) = forEach { (first, second, third, fourth) ->
    action(first, second, third, fourth)
}

/**
 * Performs the given [action] on each [Penta] element.
 *
 * @param A the type of the first value in the penta
 * @param B the type of the second value in the penta
 * @param C the type of the third value in the penta
 * @param D the type of the fourth value in the penta
 * @param E the type of the fifth value in the penta
 * @param action the function to perform on each penta
 */
inline fun <A, B, C, D, E> Iterable<Penta<A?, B?, C?, D?, E?>>.forEach(
    action: (A?, B?, C?, D?, E?) -> Unit
) = forEach { (first, second, third, fourth, fifth) ->
    action(first, second, third, fourth, fifth)
}

/**
 * Performs the given [action] on each [Hexa] element.
 *
 * @param A the type of the first value in the hexa
 * @param B the type of the second value in the hexa
 * @param C the type of the third value in the hexa
 * @param D the type of the fourth value in the hexa
 * @param E the type of the fifth value in the hexa
 * @param F the type of the sixth value in the hexa
 * @param action the function to perform on each hexa
 */
inline fun <A, B, C, D, E, F> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.forEach(
    action: (A?, B?, C?, D?, E?, F?) -> Unit
) = forEach { (first, second, third, fourth, fifth, sixth) ->
    action(first, second, third, fourth, fifth, sixth)
}

/**
 * Performs the given [action] on each [Hepta] element.
 *
 * @param A the type of the first value in the hepta
 * @param B the type of the second value in the hepta
 * @param C the type of the third value in the hepta
 * @param D the type of the fourth value in the hepta
 * @param E the type of the fifth value in the hepta
 * @param F the type of the sixth value in the hepta
 * @param G the type of the seventh value in the hepta
 * @param action the function to perform on each hepta
 */
inline fun <A, B, C, D, E, F, G> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.forEach(
    action: (A?, B?, C?, D?, E?, F?, G?) -> Unit
) = forEach { (first, second, third, fourth, fifth, sixth, seventh) ->
    action(first, second, third, fourth, fifth, sixth, seventh)
}