package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Returns a single list of all elements yielded from results of [transform] function being invoked on each [Pair] element of the original collection.
 *
 * @param A the type of the first value in the pair
 * @param B the type of the second value in the pair
 * @param R the type of the result elements
 * @param transform the function to transform each pair into an iterable of results
 * @return a list of all elements yielded from the transform function
 */
inline fun <A, B, R> Iterable<Pair<A?, B?>>.flatMap(
    transform: (A?, B?) -> Iterable<R>
): List<R?> = flatMap { (first, second) ->
    transform(first, second)
}

/**
 * Returns a single list of all elements yielded from results of [transform] function being invoked on each [Triple] element of the original collection.
 *
 * @param A the type of the first value in the triple
 * @param B the type of the second value in the triple
 * @param C the type of the third value in the triple
 * @param R the type of the result elements
 * @param transform the function to transform each triple into an iterable of results
 * @return a list of all elements yielded from the transform function
 */
inline fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.flatMap(
    transform: (A?, B?, C?) -> Iterable<R>
): List<R?> = flatMap { (first, second, third) ->
    transform(first, second, third)
}

/**
 * Returns a single list of all elements yielded from results of [transform] function being invoked on each [Quad] element of the original collection.
 *
 * @param A the type of the first value in the quad
 * @param B the type of the second value in the quad
 * @param C the type of the third value in the quad
 * @param D the type of the fourth value in the quad
 * @param R the type of the result elements
 * @param transform the function to transform each quad into an iterable of results
 * @return a list of all elements yielded from the transform function
 */
inline fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.flatMap(
    transform: (A?, B?, C?, D?) -> Iterable<R>
): List<R?> = flatMap { (first, second, third, fourth) ->
    transform(first, second, third, fourth)
}

/**
 * Returns a single list of all elements yielded from results of [transform] function being invoked on each [Penta] element of the original collection.
 *
 * @param A the type of the first value in the penta
 * @param B the type of the second value in the penta
 * @param C the type of the third value in the penta
 * @param D the type of the fourth value in the penta
 * @param E the type of the fifth value in the penta
 * @param R the type of the result elements
 * @param transform the function to transform each penta into an iterable of results
 * @return a list of all elements yielded from the transform function
 */
inline fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.flatMap(
    transform: (A?, B?, C?, D?, E?) -> Iterable<R>
): List<R?> = flatMap { (first, second, third, fourth, fifth) ->
    transform(first, second, third, fourth, fifth)
}

/**
 * Returns a single list of all elements yielded from results of [transform] function being invoked on each [Hexa] element of the original collection.
 *
 * @param A the type of the first value in the hexa
 * @param B the type of the second value in the hexa
 * @param C the type of the third value in the hexa
 * @param D the type of the fourth value in the hexa
 * @param E the type of the fifth value in the hexa
 * @param F the type of the sixth value in the hexa
 * @param R the type of the result elements
 * @param transform the function to transform each hexa into an iterable of results
 * @return a list of all elements yielded from the transform function
 */
inline fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.flatMap(
    transform: (A?, B?, C?, D?, E?, F?) -> Iterable<R>
): List<R?> = flatMap { (first, second, third, fourth, fifth, sixth) ->
    transform(first, second, third, fourth, fifth, sixth)
}

/**
 * Returns a single list of all elements yielded from results of [transform] function being invoked on each [Hepta] element of the original collection.
 *
 * @param A the type of the first value in the hepta
 * @param B the type of the second value in the hepta
 * @param C the type of the third value in the hepta
 * @param D the type of the fourth value in the hepta
 * @param E the type of the fifth value in the hepta
 * @param F the type of the sixth value in the hepta
 * @param G the type of the seventh value in the hepta
 * @param R the type of the result elements
 * @param transform the function to transform each hepta into an iterable of results
 * @return a list of all elements yielded from the transform function
 */
inline fun <A, B, C, D, E, F, G, R> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.flatMap(
    transform: (A?, B?, C?, D?, E?, F?, G?) -> Iterable<R>
): List<R?> = flatMap { (first, second, third, fourth, fifth, sixth, seventh) ->
    transform(first, second, third, fourth, fifth, sixth, seventh)
}
