package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Performs the given [action] on each element, providing sequential index with the element.
 * @param [action] function that takes the index of an element and the element itself
 * and performs the desired action on the element.
 */
inline fun <A, B> Iterable<Pair<A?, B?>>.forEachIndexed(
    action: (Int, A?, B?) -> Unit
) = forEachIndexed { index, (first, second) ->
    action(index, first, second)
}

/**
 * Performs the given [action] on each element, providing sequential index with the element.
 * @param [action] function that takes the index of an element and the element itself
 * and performs the desired action on the element.
 */
inline fun <A, B, C> Iterable<Triple<A?, B?, C?>>.forEachIndexed(
    action: (Int, A?, B?, C?) -> Unit
) = forEachIndexed { index, (first, second, third) ->
    action(index, first, second, third)
}

/**
 * Performs the given [action] on each element, providing sequential index with the element.
 * @param [action] function that takes the index of an element and the element itself
 * and performs the desired action on the element.
 */
inline fun <A, B, C, D> Iterable<Quad<A?, B?, C?, D?>>.forEachIndexed(
    action: (Int, A?, B?, C?, D?) -> Unit
) = forEachIndexed { index, (first, second, third, fourth) ->
    action(index, first, second, third, fourth)
}

/**
 * Performs the given [action] on each element, providing sequential index with the element.
 * @param [action] function that takes the index of an element and the element itself
 * and performs the desired action on the element.
 */
inline fun <A, B, C, D, E> Iterable<Penta<A?, B?, C?, D?, E?>>.forEachIndexed(
    action: (Int, A?, B?, C?, D?, E?) -> Unit
) = forEachIndexed { index, (first, second, third, fourth, fifth) ->
    action(index, first, second, third, fourth, fifth)
}

/**
 * Performs the given [action] on each element, providing sequential index with the element.
 * @param [action] function that takes the index of an element and the element itself
 * and performs the desired action on the element.
 */
inline fun <A, B, C, D, E, F> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.forEachIndexed(
    action: (Int, A?, B?, C?, D?, E?, F?) -> Unit
) = forEachIndexed { index, (first, second, third, fourth, fifth, sixth) ->
    action(index, first, second, third, fourth, fifth, sixth)
}

/**
 * Performs the given [action] on each element, providing sequential index with the element.
 * @param [action] function that takes the index of an element and the element itself
 * and performs the desired action on the element.
 */
inline fun <A, B, C, D, E, F, G> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.forEachIndexed(
    action: (Int, A?, B?, C?, D?, E?, F?, G?) -> Unit
) = forEachIndexed { index, (first, second, third, fourth, fifth, sixth, seventh) ->
    action(index, first, second, third, fourth, fifth, sixth, seventh)
}
