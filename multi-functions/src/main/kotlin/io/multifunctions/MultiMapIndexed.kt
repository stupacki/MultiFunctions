package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Returns a list containing the results of applying the given [transform] function
 * to each element and its index in the original collection.
 *
 * @param A the type of the first value in the pair
 * @param B the type of the second value in the pair
 * @param R the type of the result elements
 * @param transform the function to apply to each pair with its index
 * @return a list of transformed elements
 */
inline fun <A, B, R> Iterable<Pair<A?, B?>>.mapIndexed(
    transform: (Int, A?, B?) -> R
): List<R?> = mapIndexed { index, (first, second) ->
    transform(index, first, second)
}

/**
 * Returns a list containing the results of applying the given [transform] function
 * to each element and its index in the original collection.
 *
 * @param A the type of the first value in the triple
 * @param B the type of the second value in the triple
 * @param C the type of the third value in the triple
 * @param R the type of the result elements
 * @param transform the function to apply to each triple with its index
 * @return a list of transformed elements
 */
inline fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.mapIndexed(
    transform: (Int, A?, B?, C?) -> R
): List<R?> = mapIndexed { index, (first, second, third) ->
    transform(index, first, second, third)
}

/**
 * Returns a list containing the results of applying the given [transform] function
 * to each element and its index in the original collection.
 *
 * @param A the type of the first value in the quad
 * @param B the type of the second value in the quad
 * @param C the type of the third value in the quad
 * @param D the type of the fourth value in the quad
 * @param R the type of the result elements
 * @param transform the function to apply to each quad with its index
 * @return a list of transformed elements
 */
inline fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.mapIndexed(
    transform: (Int, A?, B?, C?, D?) -> R
): List<R?> = mapIndexed { index, (first, second, third, fourth) ->
    transform(index, first, second, third, fourth)
}

/**
 * Returns a list containing the results of applying the given [transform] function
 * to each element and its index in the original collection.
 *
 * @param A the type of the first value in the penta
 * @param B the type of the second value in the penta
 * @param C the type of the third value in the penta
 * @param D the type of the fourth value in the penta
 * @param E the type of the fifth value in the penta
 * @param R the type of the result elements
 * @param transform the function to apply to each penta with its index
 * @return a list of transformed elements
 */
inline fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.mapIndexed(
    transform: (Int, A?, B?, C?, D?, E?) -> R
): List<R?> = mapIndexed { index, (first, second, third, fourth, fifth) ->
    transform(index, first, second, third, fourth, fifth)
}

/**
 * Returns a list containing the results of applying the given [transform] function
 * to each element and its index in the original collection.
 *
 * @param A the type of the first value in the hexa
 * @param B the type of the second value in the hexa
 * @param C the type of the third value in the hexa
 * @param D the type of the fourth value in the hexa
 * @param E the type of the fifth value in the hexa
 * @param F the type of the sixth value in the hexa
 * @param R the type of the result elements
 * @param transform the function to apply to each hexa with its index
 * @return a list of transformed elements
 */
inline fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapIndexed(
    transform: (Int, A?, B?, C?, D?, E?, F?) -> R
): List<R?> = mapIndexed { index, (first, second, third, fourth, fifth, sixth) ->
    transform(index, first, second, third, fourth, fifth, sixth)
}

/**
 * Returns a list containing the results of applying the given [transform] function
 * to each element and its index in the original collection.
 *
 * @param A the type of the first value in the hepta
 * @param B the type of the second value in the hepta
 * @param C the type of the third value in the hepta
 * @param D the type of the fourth value in the hepta
 * @param E the type of the fifth value in the hepta
 * @param F the type of the sixth value in the hepta
 * @param G the type of the seventh value in the hepta
 * @param R the type of the result elements
 * @param transform the function to apply to each hepta with its index
 * @return a list of transformed elements
 */
inline fun <A, B, C, D, E, F, G, R> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.mapIndexed(
    transform: (Int, A?, B?, C?, D?, E?, F?, G?) -> R
): List<R?> = mapIndexed { index, (first, second, third, fourth, fifth, sixth, seventh) ->
    transform(index, first, second, third, fourth, fifth, sixth, seventh)
}
