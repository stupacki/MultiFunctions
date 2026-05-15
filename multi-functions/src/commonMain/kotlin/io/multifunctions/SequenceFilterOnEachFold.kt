package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Returns a lazy sequence containing only pair elements whose unpacked values match [predicate].
 */
inline fun <A, B> Sequence<Pair<A?, B?>>.filter(
    crossinline predicate: (A?, B?) -> Boolean
): Sequence<Pair<A?, B?>> = filter { (first, second) ->
    predicate(first, second)
}

/**
 * Returns a lazy sequence containing only triple elements whose unpacked values match [predicate].
 */
inline fun <A, B, C> Sequence<Triple<A?, B?, C?>>.filter(
    crossinline predicate: (A?, B?, C?) -> Boolean
): Sequence<Triple<A?, B?, C?>> = filter { (first, second, third) ->
    predicate(first, second, third)
}

/**
 * Returns a lazy sequence containing only quad elements whose unpacked values match [predicate].
 */
inline fun <A, B, C, D> Sequence<Quad<A?, B?, C?, D?>>.filter(
    crossinline predicate: (A?, B?, C?, D?) -> Boolean
): Sequence<Quad<A?, B?, C?, D?>> = filter { (first, second, third, fourth) ->
    predicate(first, second, third, fourth)
}

/**
 * Returns a lazy sequence containing only penta elements whose unpacked values match [predicate].
 */
inline fun <A, B, C, D, E> Sequence<Penta<A?, B?, C?, D?, E?>>.filter(
    crossinline predicate: (A?, B?, C?, D?, E?) -> Boolean
): Sequence<Penta<A?, B?, C?, D?, E?>> = filter { (first, second, third, fourth, fifth) ->
    predicate(first, second, third, fourth, fifth)
}

/**
 * Returns a lazy sequence containing only hexa elements whose unpacked values match [predicate].
 */
inline fun <A, B, C, D, E, F> Sequence<Hexa<A?, B?, C?, D?, E?, F?>>.filter(
    crossinline predicate: (A?, B?, C?, D?, E?, F?) -> Boolean
): Sequence<Hexa<A?, B?, C?, D?, E?, F?>> = filter { (first, second, third, fourth, fifth, sixth) ->
    predicate(first, second, third, fourth, fifth, sixth)
}

/**
 * Returns a lazy sequence containing only hepta elements whose unpacked values match [predicate].
 */
inline fun <A, B, C, D, E, F, G> Sequence<Hepta<A?, B?, C?, D?, E?, F?, G?>>.filter(
    crossinline predicate: (A?, B?, C?, D?, E?, F?, G?) -> Boolean
): Sequence<Hepta<A?, B?, C?, D?, E?, F?, G?>> = filter { (first, second, third, fourth, fifth, sixth, seventh) ->
    predicate(first, second, third, fourth, fifth, sixth, seventh)
}

/**
 * Returns a lazy sequence that performs [action] on each pair element with its values unpacked.
 */
inline fun <A, B> Sequence<Pair<A?, B?>>.onEach(
    crossinline action: (A?, B?) -> Unit
): Sequence<Pair<A?, B?>> = onEach { (first, second) ->
    action(first, second)
}

/**
 * Returns a lazy sequence that performs [action] on each triple element with its values unpacked.
 */
inline fun <A, B, C> Sequence<Triple<A?, B?, C?>>.onEach(
    crossinline action: (A?, B?, C?) -> Unit
): Sequence<Triple<A?, B?, C?>> = onEach { (first, second, third) ->
    action(first, second, third)
}

/**
 * Returns a lazy sequence that performs [action] on each quad element with its values unpacked.
 */
inline fun <A, B, C, D> Sequence<Quad<A?, B?, C?, D?>>.onEach(
    crossinline action: (A?, B?, C?, D?) -> Unit
): Sequence<Quad<A?, B?, C?, D?>> = onEach { (first, second, third, fourth) ->
    action(first, second, third, fourth)
}

/**
 * Returns a lazy sequence that performs [action] on each penta element with its values unpacked.
 */
inline fun <A, B, C, D, E> Sequence<Penta<A?, B?, C?, D?, E?>>.onEach(
    crossinline action: (A?, B?, C?, D?, E?) -> Unit
): Sequence<Penta<A?, B?, C?, D?, E?>> = onEach { (first, second, third, fourth, fifth) ->
    action(first, second, third, fourth, fifth)
}

/**
 * Returns a lazy sequence that performs [action] on each hexa element with its values unpacked.
 */
inline fun <A, B, C, D, E, F> Sequence<Hexa<A?, B?, C?, D?, E?, F?>>.onEach(
    crossinline action: (A?, B?, C?, D?, E?, F?) -> Unit
): Sequence<Hexa<A?, B?, C?, D?, E?, F?>> = onEach { (first, second, third, fourth, fifth, sixth) ->
    action(first, second, third, fourth, fifth, sixth)
}

/**
 * Returns a lazy sequence that performs [action] on each hepta element with its values unpacked.
 */
inline fun <A, B, C, D, E, F, G> Sequence<Hepta<A?, B?, C?, D?, E?, F?, G?>>.onEach(
    crossinline action: (A?, B?, C?, D?, E?, F?, G?) -> Unit
): Sequence<Hepta<A?, B?, C?, D?, E?, F?, G?>> = onEach { (first, second, third, fourth, fifth, sixth, seventh) ->
    action(first, second, third, fourth, fifth, sixth, seventh)
}

/**
 * Accumulates values starting with [initial], applying [operation] to each unpacked pair element.
 */
inline fun <T, A, B> Sequence<Pair<A?, B?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?) -> T
): T = fold(initial) { acc, (first, second) ->
    operation(acc, first, second)
}

/**
 * Accumulates values starting with [initial], applying [operation] to each unpacked triple element.
 */
inline fun <T, A, B, C> Sequence<Triple<A?, B?, C?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?) -> T
): T = fold(initial) { acc, (first, second, third) ->
    operation(acc, first, second, third)
}

/**
 * Accumulates values starting with [initial], applying [operation] to each unpacked quad element.
 */
inline fun <T, A, B, C, D> Sequence<Quad<A?, B?, C?, D?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?) -> T
): T = fold(initial) { acc, (first, second, third, fourth) ->
    operation(acc, first, second, third, fourth)
}

/**
 * Accumulates values starting with [initial], applying [operation] to each unpacked penta element.
 */
inline fun <T, A, B, C, D, E> Sequence<Penta<A?, B?, C?, D?, E?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?, E?) -> T
): T = fold(initial) { acc, (first, second, third, fourth, fifth) ->
    operation(acc, first, second, third, fourth, fifth)
}

/**
 * Accumulates values starting with [initial], applying [operation] to each unpacked hexa element.
 */
inline fun <T, A, B, C, D, E, F> Sequence<Hexa<A?, B?, C?, D?, E?, F?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?, E?, F?) -> T
): T = fold(initial) { acc, (first, second, third, fourth, fifth, sixth) ->
    operation(acc, first, second, third, fourth, fifth, sixth)
}

/**
 * Accumulates values starting with [initial], applying [operation] to each unpacked hepta element.
 */
inline fun <T, A, B, C, D, E, F, G> Sequence<Hepta<A?, B?, C?, D?, E?, F?, G?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?, E?, F?, G?) -> T
): T = fold(initial) { acc, (first, second, third, fourth, fifth, sixth, seventh) ->
    operation(acc, first, second, third, fourth, fifth, sixth, seventh)
}
