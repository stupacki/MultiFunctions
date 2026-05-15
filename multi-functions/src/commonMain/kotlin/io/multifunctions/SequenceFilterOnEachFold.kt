package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

inline fun <A, B> Sequence<Pair<A?, B?>>.filter(
    crossinline predicate: (A?, B?) -> Boolean
): Sequence<Pair<A?, B?>> = filter { (first, second) ->
    predicate(first, second)
}

inline fun <A, B, C> Sequence<Triple<A?, B?, C?>>.filter(
    crossinline predicate: (A?, B?, C?) -> Boolean
): Sequence<Triple<A?, B?, C?>> = filter { (first, second, third) ->
    predicate(first, second, third)
}

inline fun <A, B, C, D> Sequence<Quad<A?, B?, C?, D?>>.filter(
    crossinline predicate: (A?, B?, C?, D?) -> Boolean
): Sequence<Quad<A?, B?, C?, D?>> = filter { (first, second, third, fourth) ->
    predicate(first, second, third, fourth)
}

inline fun <A, B, C, D, E> Sequence<Penta<A?, B?, C?, D?, E?>>.filter(
    crossinline predicate: (A?, B?, C?, D?, E?) -> Boolean
): Sequence<Penta<A?, B?, C?, D?, E?>> = filter { (first, second, third, fourth, fifth) ->
    predicate(first, second, third, fourth, fifth)
}

inline fun <A, B, C, D, E, F> Sequence<Hexa<A?, B?, C?, D?, E?, F?>>.filter(
    crossinline predicate: (A?, B?, C?, D?, E?, F?) -> Boolean
): Sequence<Hexa<A?, B?, C?, D?, E?, F?>> = filter { (first, second, third, fourth, fifth, sixth) ->
    predicate(first, second, third, fourth, fifth, sixth)
}

inline fun <A, B, C, D, E, F, G> Sequence<Hepta<A?, B?, C?, D?, E?, F?, G?>>.filter(
    crossinline predicate: (A?, B?, C?, D?, E?, F?, G?) -> Boolean
): Sequence<Hepta<A?, B?, C?, D?, E?, F?, G?>> = filter { (first, second, third, fourth, fifth, sixth, seventh) ->
    predicate(first, second, third, fourth, fifth, sixth, seventh)
}

inline fun <A, B> Sequence<Pair<A?, B?>>.onEach(
    crossinline action: (A?, B?) -> Unit
): Sequence<Pair<A?, B?>> = onEach { (first, second) ->
    action(first, second)
}

inline fun <A, B, C> Sequence<Triple<A?, B?, C?>>.onEach(
    crossinline action: (A?, B?, C?) -> Unit
): Sequence<Triple<A?, B?, C?>> = onEach { (first, second, third) ->
    action(first, second, third)
}

inline fun <A, B, C, D> Sequence<Quad<A?, B?, C?, D?>>.onEach(
    crossinline action: (A?, B?, C?, D?) -> Unit
): Sequence<Quad<A?, B?, C?, D?>> = onEach { (first, second, third, fourth) ->
    action(first, second, third, fourth)
}

inline fun <A, B, C, D, E> Sequence<Penta<A?, B?, C?, D?, E?>>.onEach(
    crossinline action: (A?, B?, C?, D?, E?) -> Unit
): Sequence<Penta<A?, B?, C?, D?, E?>> = onEach { (first, second, third, fourth, fifth) ->
    action(first, second, third, fourth, fifth)
}

inline fun <A, B, C, D, E, F> Sequence<Hexa<A?, B?, C?, D?, E?, F?>>.onEach(
    crossinline action: (A?, B?, C?, D?, E?, F?) -> Unit
): Sequence<Hexa<A?, B?, C?, D?, E?, F?>> = onEach { (first, second, third, fourth, fifth, sixth) ->
    action(first, second, third, fourth, fifth, sixth)
}

inline fun <A, B, C, D, E, F, G> Sequence<Hepta<A?, B?, C?, D?, E?, F?, G?>>.onEach(
    crossinline action: (A?, B?, C?, D?, E?, F?, G?) -> Unit
): Sequence<Hepta<A?, B?, C?, D?, E?, F?, G?>> = onEach { (first, second, third, fourth, fifth, sixth, seventh) ->
    action(first, second, third, fourth, fifth, sixth, seventh)
}

inline fun <T, A, B> Sequence<Pair<A?, B?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?) -> T
): T = fold(initial) { acc, (first, second) ->
    operation(acc, first, second)
}

inline fun <T, A, B, C> Sequence<Triple<A?, B?, C?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?) -> T
): T = fold(initial) { acc, (first, second, third) ->
    operation(acc, first, second, third)
}

inline fun <T, A, B, C, D> Sequence<Quad<A?, B?, C?, D?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?) -> T
): T = fold(initial) { acc, (first, second, third, fourth) ->
    operation(acc, first, second, third, fourth)
}

inline fun <T, A, B, C, D, E> Sequence<Penta<A?, B?, C?, D?, E?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?, E?) -> T
): T = fold(initial) { acc, (first, second, third, fourth, fifth) ->
    operation(acc, first, second, third, fourth, fifth)
}

inline fun <T, A, B, C, D, E, F> Sequence<Hexa<A?, B?, C?, D?, E?, F?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?, E?, F?) -> T
): T = fold(initial) { acc, (first, second, third, fourth, fifth, sixth) ->
    operation(acc, first, second, third, fourth, fifth, sixth)
}

inline fun <T, A, B, C, D, E, F, G> Sequence<Hepta<A?, B?, C?, D?, E?, F?, G?>>.fold(
    initial: T,
    operation: (acc: T, A?, B?, C?, D?, E?, F?, G?) -> T
): T = fold(initial) { acc, (first, second, third, fourth, fifth, sixth, seventh) ->
    operation(acc, first, second, third, fourth, fifth, sixth, seventh)
}
