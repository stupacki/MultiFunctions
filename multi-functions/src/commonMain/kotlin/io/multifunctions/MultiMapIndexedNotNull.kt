package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 *
 * @param A the type of the first value in the pair
 * @param B the type of the second value in the pair
 * @param R the type of the result elements
 * @param transform the function to apply to each pair with its index
 * @return a list of transformed elements, excluding those with null values
 */
inline fun <A, B, R> Iterable<Pair<A?, B?>>.mapIndexedNotNull(
    transform: (Int, A?, B?) -> R?
): List<R> = mapIndexedNotNull { index, (first, second) ->
    when {
        first == null && second == null -> null
        else -> transform(index, first, second)
    }
}

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 *
 * @param A the type of the first value in the triple
 * @param B the type of the second value in the triple
 * @param C the type of the third value in the triple
 * @param R the type of the result elements
 * @param transform the function to apply to each triple with its index
 * @return a list of transformed elements, excluding those with null values
 */
inline fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.mapIndexedNotNull(
    transform: (Int, A?, B?, C?) -> R?
): List<R> = mapIndexedNotNull { index, (first, second, third) ->
    when {
        first == null && second == null && third == null -> null
        else -> transform(index, first, second, third)
    }
}

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 *
 * @param A the type of the first value in the quad
 * @param B the type of the second value in the quad
 * @param C the type of the third value in the quad
 * @param D the type of the fourth value in the quad
 * @param R the type of the result elements
 * @param transform the function to apply to each quad with its index
 * @return a list of transformed elements, excluding those with null values
 */
inline fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.mapIndexedNotNull(
    transform: (Int, A?, B?, C?, D?) -> R?
): List<R> = mapIndexedNotNull { index, (first, second, third, fourth) ->
    when {
        first == null && second == null && third == null && fourth == null -> null
        else -> transform(index, first, second, third, fourth)
    }
}

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 *
 * @param A the type of the first value in the penta
 * @param B the type of the second value in the penta
 * @param C the type of the third value in the penta
 * @param D the type of the fourth value in the penta
 * @param E the type of the fifth value in the penta
 * @param R the type of the result elements
 * @param transform the function to apply to each penta with its index
 * @return a list of transformed elements, excluding those with null values
 */
inline fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.mapIndexedNotNull(
    transform: (Int, A?, B?, C?, D?, E?) -> R?
): List<R> = mapIndexedNotNull { index, (first, second, third, fourth, fifth) ->
    when {
        first == null && second == null && third == null && fourth == null && fifth == null -> null
        else -> transform(index, first, second, third, fourth, fifth)
    }
}

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
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
 * @return a list of transformed elements, excluding those with null values
 */
inline fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapIndexedNotNull(
    transform: (Int, A?, B?, C?, D?, E?, F?) -> R?
): List<R> = mapIndexedNotNull { index, (first, second, third, fourth, fifth, sixth) ->
    when {
        first == null && second == null && third == null && fourth == null && fifth == null && sixth == null -> null
        else -> transform(index, first, second, third, fourth, fifth, sixth)
    }
}

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
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
 * @return a list of transformed elements, excluding those with null values
 */
inline fun <A, B, C, D, E, F, G, R> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.mapIndexedNotNull(
    transform: (Int, A?, B?, C?, D?, E?, F?, G?) -> R?
): List<R> = mapIndexedNotNull { index, (first, second, third, fourth, fifth, sixth, seventh) ->
    when {
        first == null && second == null && third == null && fourth == null && fifth == null && sixth == null && seventh == null -> null
        else -> transform(index, first, second, third, fourth, fifth, sixth, seventh)
    }
}
