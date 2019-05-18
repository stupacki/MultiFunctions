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
inline infix fun <A, B, R : Any> Iterable<Pair<A?, B?>>.mapIndexedCheckNull(transform: (Int, A, B) -> R): List<R> =
    mapCheckNull { first, second -> Pair(first, second) }
        .mapIndexed { index, (first, second) ->
            transform(index, first, second)
        }

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element. When one parameter of the tuple
 * is null the element will be removed from the collection.
 */
inline infix fun <A, B, C, R : Any> Iterable<Triple<A?, B?, C?>>.mapIndexedCheckNull(transform: (Int, A, B, C) -> R): List<R> =
    mapCheckNull { first, second, third -> Triple(first, second, third) }
        .mapIndexed { index, (first, second, third) ->
            transform(index, first, second, third)
        }

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element. When one parameter of the tuple
 * is null the element will be removed from the collection.
 */
inline infix fun <A, B, C, D, R : Any> Iterable<Quad<A?, B?, C?, D?>>.mapIndexedCheckNull(transform: (Int, A, B, C, D) -> R): List<R> =
    mapCheckNull { first, second, third, fourth -> Quad(first, second, third, fourth) }
        .mapIndexed { index, (first, second, third, fourth) ->
            transform(index, first, second, third, fourth)
        }

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element. When one parameter of the tuple
 * is null the element will be removed from the collection.
 */
inline infix fun <A, B, C, D, E, R : Any> Iterable<Penta<A?, B?, C?, D?, E?>>.mapIndexedCheckNull(transform: (Int, A, B, C, D, E) -> R): List<R> =
    mapCheckNull { first, second, third, fourth, fifth -> Penta(first, second, third, fourth, fifth) }
        .mapIndexed { index, (first, second, third, fourth, fifth) ->
            transform(index, first, second, third, fourth, fifth)
        }

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element. When one parameter of the tuple
 * is null the element will be removed from the collection.
 */
inline infix fun <A, B, C, D, E, F, R : Any> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapIndexedCheckNull(transform: (Int, A, B, C, D, E, F) -> R): List<R> =
    mapCheckNull { first, second, third, fourth, fifth, sixth -> Hexa(first, second, third, fourth, fifth, sixth) }
        .mapIndexed { index, (first, second, third, fourth, fifth, sixth) ->
            transform(index, first, second, third, fourth, fifth, sixth)
        }

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element. When one parameter of the tuple
 * is null the element will be removed from the collection.
 */
inline infix fun <A, B, C, D, E, F, G, R : Any> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.mapIndexedCheckNull(transform: (Int, A, B, C, D, E, F, G) -> R): List<R> =
    mapCheckNull { first, second, third, fourth, fifth, sixth, seventh -> Hepta(first, second, third, fourth, fifth, sixth, seventh) }
        .mapIndexed { index, (first, second, third, fourth, fifth, sixth, seventh) ->
            transform(index, first, second, third, fourth, fifth, sixth, seventh)
        }
