package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element in the original collection. When one parameter of the tuple is null the element
 * will be removed from the collection.
 */
inline fun <A, B, R> Iterable<Pair<A?, B?>>.mapCheckNull(transform: (A, B) -> R): List<R> =
    mapNotNull { (first, second) ->
        when (null) {
            first, second -> null
            else -> transform(first, second)
        }
    }

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element in the original collection. When one parameter of the tuple is null the element
 * will be removed from the collection.
 */
inline fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.mapCheckNull(transform: (A, B, C) -> R): List<R> =
    mapNotNull { (first, second, third) ->
        when (null) {
            first, second, third -> null
            else -> transform(first, second, third)
        }
    }

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element in the original collection. When one parameter of the tuple is null the element
 * will be removed from the collection.
 */
inline fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.mapCheckNull(transform: (A, B, C, D) -> R): List<R> =
    mapNotNull { (first, second, third, fourth) ->
        when (null) {
            first, second, third, fourth -> null
            else -> transform(first, second, third, fourth)
        }
    }

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element in the original collection. When one parameter of the tuple is null the element
 * will be removed from the collection.
 */
inline fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.mapCheckNull(
    transform: (A, B, C, D, E) -> R
): List<R> =
    mapNotNull { (first, second, third, fourth, fifth) ->
        when (null) {
            first, second, third, fourth, fifth -> null
            else -> transform(first, second, third, fourth, fifth)
        }
    }

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element in the original collection. When one parameter of the tuple is null the element
 * will be removed from the collection.
 */
inline fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapCheckNull(
    transform: (A, B, C, D, E, F) -> R
): List<R> =
    mapNotNull { (first, second, third, fourth, fifth, sixth) ->
        when (null) {
            first, second, third, fourth, fifth, sixth -> null
            else -> transform(first, second, third, fourth, fifth, sixth)
        }
    }

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element in the original collection. When one parameter of the tuple is null the element
 * will be removed from the collection.
 */
inline fun <A, B, C, D, E, F, G, R> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.mapCheckNull(
    transform: (A, B, C, D, E, F, G) -> R
): List<R> =
    mapNotNull { (first, second, third, fourth, fifth, sixth, seventh) ->
        when (null) {
            first, second, third, fourth, fifth, sixth, seventh -> null
            else -> transform(first, second, third, fourth, fifth, sixth, seventh)
        }
    }
