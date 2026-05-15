package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

inline fun <T, A, B> Iterable<Pair<A?, B?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?) -> T
): T = fold(initial) { acc, (first, second) ->
    operation(acc, first, second)
}

inline fun <T, A, B, C> Iterable<Triple<A?, B?, C?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?) -> T
): T = fold(initial) { acc, (first, second, third) ->
    operation(acc, first, second, third)
}

inline fun <T, A, B, C, D> Iterable<Quad<A?, B?, C?, D?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?) -> T
): T = fold(initial) { acc, (first, second, third, fourth) ->
    operation(acc, first, second, third, fourth)
}

inline fun <T, A, B, C, D, E> Iterable<Penta<A?, B?, C?, D?, E?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?, E?) -> T
): T = fold(initial) { acc, (first, second, third, fourth, fifth) ->
    operation(acc, first, second, third, fourth, fifth)
}

inline fun <T, A, B, C, D, E, F> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?, E?, F?) -> T
): T = fold(initial) { acc, (first, second, third, fourth, fifth, sixth) ->
    operation(acc, first, second, third, fourth, fifth, sixth)
}

inline fun <T, A, B, C, D, E, F, G> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?, E?, F?, G?) -> T
): T = fold(initial) { acc, (first, second, third, fourth, fifth, sixth, seventh) ->
    operation(acc, first, second, third, fourth, fifth, sixth, seventh)
}
