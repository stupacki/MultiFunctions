package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element. When one parameter of the tuple
 * is null the element will be removed from the collection.
 */
public inline fun <A, B, R> Iterable<Pair<A, B>>.mapIndexedCheckNull(
    transform: (Int, A, B) -> R,
): List<R> =
    mapIndexedNotNull { index, (first, second) ->
        when (null) {
            first, second -> null
            else -> transform(index, first, second)
        }
    }

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element. When one parameter of the tuple
 * is null the element will be removed from the collection.
 */
public inline fun <A, B, C, R> Iterable<Triple<A, B, C>>.mapIndexedCheckNull(
    transform: (Int, A, B, C) -> R,
): List<R> =
    mapIndexedNotNull { index, (first, second, third) ->
        when (null) {
            first, second, third -> null
            else -> transform(index, first, second, third)
        }
    }

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element. When one parameter of the tuple
 * is null the element will be removed from the collection.
 */
public inline fun <A, B, C, D, R> Iterable<Quad<A, B, C, D>>.mapIndexedCheckNull(
    transform: (Int, A, B, C, D) -> R,
): List<R> =
    mapIndexedNotNull { index, (first, second, third, fourth) ->
        when (null) {
            first, second, third, fourth -> null
            else -> transform(index, first, second, third, fourth)
        }
    }

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element. When one parameter of the tuple
 * is null the element will be removed from the collection.
 */
public inline fun <A, B, C, D, E, R> Iterable<Penta<A, B, C, D, E>>.mapIndexedCheckNull(
    transform: (Int, A, B, C, D, E) -> R,
): List<R> =
    mapIndexedNotNull { index, (first, second, third, fourth, fifth) ->
        when (null) {
            first, second, third, fourth, fifth -> null
            else -> transform(index, first, second, third, fourth, fifth)
        }
    }

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element. When one parameter of the tuple
 * is null the element will be removed from the collection.
 */
public inline fun <A, B, C, D, E, F, R> Iterable<Hexa<A, B, C, D, E, F>>.mapIndexedCheckNull(
    transform: (Int, A, B, C, D, E, F) -> R,
): List<R> =
    mapIndexedNotNull { index, (first, second, third, fourth, fifth, sixth) ->
        when (null) {
            first, second, third, fourth, fifth, sixth -> null
            else -> transform(index, first, second, third, fourth, fifth, sixth)
        }
    }

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element. When one parameter of the tuple
 * is null the element will be removed from the collection.
 */
public inline fun <A, B, C, D, E, F, G, R> Iterable<Hepta<A, B, C, D, E, F, G>>.mapIndexedCheckNull(
    transform: (Int, A, B, C, D, E, F, G) -> R,
): List<R> =
    mapIndexedNotNull { index, (first, second, third, fourth, fifth, sixth, seventh) ->
        when (null) {
            first, second, third, fourth, fifth, sixth, seventh -> null
            else -> transform(index, first, second, third, fourth, fifth, sixth, seventh)
        }
    }
