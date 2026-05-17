package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Returns a list containing only pair elements whose unpacked values match [predicate].
 */
inline fun <A, B> Iterable<Pair<A?, B?>>.filter(
    predicate: (A?, B?) -> Boolean
): List<Pair<A?, B?>> = filter { (first, second) ->
    predicate(first, second)
}

/**
 * Returns a list containing only triple elements whose unpacked values match [predicate].
 */
inline fun <A, B, C> Iterable<Triple<A?, B?, C?>>.filter(
    predicate: (A?, B?, C?) -> Boolean
): List<Triple<A?, B?, C?>> = filter { (first, second, third) ->
    predicate(first, second, third)
}

/**
 * Returns a list containing only quad elements whose unpacked values match [predicate].
 */
inline fun <A, B, C, D> Iterable<Quad<A?, B?, C?, D?>>.filter(
    predicate: (A?, B?, C?, D?) -> Boolean
): List<Quad<A?, B?, C?, D?>> = filter { (first, second, third, fourth) ->
    predicate(first, second, third, fourth)
}

/**
 * Returns a list containing only penta elements whose unpacked values match [predicate].
 */
inline fun <A, B, C, D, E> Iterable<Penta<A?, B?, C?, D?, E?>>.filter(
    predicate: (A?, B?, C?, D?, E?) -> Boolean
): List<Penta<A?, B?, C?, D?, E?>> = filter { (first, second, third, fourth, fifth) ->
    predicate(first, second, third, fourth, fifth)
}

/**
 * Returns a list containing only hexa elements whose unpacked values match [predicate].
 */
inline fun <A, B, C, D, E, F> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.filter(
    predicate: (A?, B?, C?, D?, E?, F?) -> Boolean
): List<Hexa<A?, B?, C?, D?, E?, F?>> = filter { (first, second, third, fourth, fifth, sixth) ->
    predicate(first, second, third, fourth, fifth, sixth)
}

/**
 * Returns a list containing only hepta elements whose unpacked values match [predicate].
 */
inline fun <A, B, C, D, E, F, G> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.filter(
    predicate: (A?, B?, C?, D?, E?, F?, G?) -> Boolean
): List<Hepta<A?, B?, C?, D?, E?, F?, G?>> = filter { (first, second, third, fourth, fifth, sixth, seventh) ->
    predicate(first, second, third, fourth, fifth, sixth, seventh)
}
