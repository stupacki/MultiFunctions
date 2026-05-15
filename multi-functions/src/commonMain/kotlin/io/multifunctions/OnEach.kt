package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

inline fun <A, B> Iterable<Pair<A?, B?>>.onEach(
    action: (A?, B?) -> Unit
): Iterable<Pair<A?, B?>> = onEach { (first, second) ->
    action(first, second)
}

inline fun <A, B, C> Iterable<Triple<A?, B?, C?>>.onEach(
    action: (A?, B?, C?) -> Unit
): Iterable<Triple<A?, B?, C?>> = onEach { (first, second, third) ->
    action(first, second, third)
}

inline fun <A, B, C, D> Iterable<Quad<A?, B?, C?, D?>>.onEach(
    action: (A?, B?, C?, D?) -> Unit
): Iterable<Quad<A?, B?, C?, D?>> = onEach { (first, second, third, fourth) ->
    action(first, second, third, fourth)
}

inline fun <A, B, C, D, E> Iterable<Penta<A?, B?, C?, D?, E?>>.onEach(
    action: (A?, B?, C?, D?, E?) -> Unit
): Iterable<Penta<A?, B?, C?, D?, E?>> = onEach { (first, second, third, fourth, fifth) ->
    action(first, second, third, fourth, fifth)
}

inline fun <A, B, C, D, E, F> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.onEach(
    action: (A?, B?, C?, D?, E?, F?) -> Unit
): Iterable<Hexa<A?, B?, C?, D?, E?, F?>> = onEach { (first, second, third, fourth, fifth, sixth) ->
    action(first, second, third, fourth, fifth, sixth)
}

inline fun <A, B, C, D, E, F, G> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.onEach(
    action: (A?, B?, C?, D?, E?, F?, G?) -> Unit
): Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>> = onEach { (first, second, third, fourth, fifth, sixth, seventh) ->
    action(first, second, third, fourth, fifth, sixth, seventh)
}
