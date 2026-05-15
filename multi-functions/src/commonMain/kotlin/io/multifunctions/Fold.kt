package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Accumulates values starting with [initial], applying [operation] to each unpacked pair element.
 */
inline fun <T, A, B> Iterable<Pair<A?, B?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?) -> T
): T = fold(initial) { acc, (first, second) ->
    operation(acc, first, second)
}

/**
 * Accumulates values starting with [initial], applying [operation] to each unpacked triple element.
 */
inline fun <T, A, B, C> Iterable<Triple<A?, B?, C?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?) -> T
): T = fold(initial) { acc, (first, second, third) ->
    operation(acc, first, second, third)
}

/**
 * Accumulates values starting with [initial], applying [operation] to each unpacked quad element.
 */
inline fun <T, A, B, C, D> Iterable<Quad<A?, B?, C?, D?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?) -> T
): T = fold(initial) { acc, (first, second, third, fourth) ->
    operation(acc, first, second, third, fourth)
}

/**
 * Accumulates values starting with [initial], applying [operation] to each unpacked penta element.
 */
inline fun <T, A, B, C, D, E> Iterable<Penta<A?, B?, C?, D?, E?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?, E?) -> T
): T = fold(initial) { acc, (first, second, third, fourth, fifth) ->
    operation(acc, first, second, third, fourth, fifth)
}

/**
 * Accumulates values starting with [initial], applying [operation] to each unpacked hexa element.
 */
inline fun <T, A, B, C, D, E, F> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?, E?, F?) -> T
): T = fold(initial) { acc, (first, second, third, fourth, fifth, sixth) ->
    operation(acc, first, second, third, fourth, fifth, sixth)
}

/**
 * Accumulates values starting with [initial], applying [operation] to each unpacked hepta element.
 */
inline fun <T, A, B, C, D, E, F, G> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?, E?, F?, G?) -> T
): T = fold(initial) { acc, (first, second, third, fourth, fifth, sixth, seventh) ->
    operation(acc, first, second, third, fourth, fifth, sixth, seventh)
}
