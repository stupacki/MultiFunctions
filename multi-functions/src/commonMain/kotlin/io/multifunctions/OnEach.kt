package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Performs [action] on each pair element with its values unpacked, then returns the original iterable.
 */
inline fun <A, B> Iterable<Pair<A?, B?>>.onEach(
    action: (A?, B?) -> Unit
): Iterable<Pair<A?, B?>> = onEach { (first, second) ->
    action(first, second)
}

/**
 * Performs [action] on each triple element with its values unpacked, then returns the original iterable.
 */
inline fun <A, B, C> Iterable<Triple<A?, B?, C?>>.onEach(
    action: (A?, B?, C?) -> Unit
): Iterable<Triple<A?, B?, C?>> = onEach { (first, second, third) ->
    action(first, second, third)
}

/**
 * Performs [action] on each quad element with its values unpacked, then returns the original iterable.
 */
inline fun <A, B, C, D> Iterable<Quad<A?, B?, C?, D?>>.onEach(
    action: (A?, B?, C?, D?) -> Unit
): Iterable<Quad<A?, B?, C?, D?>> = onEach { (first, second, third, fourth) ->
    action(first, second, third, fourth)
}

/**
 * Performs [action] on each penta element with its values unpacked, then returns the original iterable.
 */
inline fun <A, B, C, D, E> Iterable<Penta<A?, B?, C?, D?, E?>>.onEach(
    action: (A?, B?, C?, D?, E?) -> Unit
): Iterable<Penta<A?, B?, C?, D?, E?>> = onEach { (first, second, third, fourth, fifth) ->
    action(first, second, third, fourth, fifth)
}

/**
 * Performs [action] on each hexa element with its values unpacked, then returns the original iterable.
 */
inline fun <A, B, C, D, E, F> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.onEach(
    action: (A?, B?, C?, D?, E?, F?) -> Unit
): Iterable<Hexa<A?, B?, C?, D?, E?, F?>> = onEach { (first, second, third, fourth, fifth, sixth) ->
    action(first, second, third, fourth, fifth, sixth)
}

/**
 * Performs [action] on each hepta element with its values unpacked, then returns the original iterable.
 */
inline fun <A, B, C, D, E, F, G> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.onEach(
    action: (A?, B?, C?, D?, E?, F?, G?) -> Unit
): Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>> = onEach { (first, second, third, fourth, fifth, sixth, seventh) ->
    action(first, second, third, fourth, fifth, sixth, seventh)
}
