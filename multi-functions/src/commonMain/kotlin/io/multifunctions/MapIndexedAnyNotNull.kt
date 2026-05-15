package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each tuple that contains at least one non-null value and its index in the original collection.
 */
inline fun <A, B, R> Iterable<Pair<A?, B?>>.mapIndexedAnyNotNull(
    transform: (Int, A?, B?) -> R?
): List<R> = mapIndexedNotNull { index, (first, second) ->
    when {
        first == null && second == null -> null
        else -> transform(index, first, second)
    }
}

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each tuple that contains at least one non-null value and its index in the original collection.
 */
inline fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.mapIndexedAnyNotNull(
    transform: (Int, A?, B?, C?) -> R?
): List<R> = mapIndexedNotNull { index, (first, second, third) ->
    when {
        first == null && second == null && third == null -> null
        else -> transform(index, first, second, third)
    }
}

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each tuple that contains at least one non-null value and its index in the original collection.
 */
inline fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.mapIndexedAnyNotNull(
    transform: (Int, A?, B?, C?, D?) -> R?
): List<R> = mapIndexedNotNull { index, (first, second, third, fourth) ->
    when {
        first == null && second == null && third == null && fourth == null -> null
        else -> transform(index, first, second, third, fourth)
    }
}

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each tuple that contains at least one non-null value and its index in the original collection.
 */
inline fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.mapIndexedAnyNotNull(
    transform: (Int, A?, B?, C?, D?, E?) -> R?
): List<R> = mapIndexedNotNull { index, (first, second, third, fourth, fifth) ->
    when {
        first == null && second == null && third == null && fourth == null && fifth == null -> null
        else -> transform(index, first, second, third, fourth, fifth)
    }
}

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each tuple that contains at least one non-null value and its index in the original collection.
 */
inline fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapIndexedAnyNotNull(
    transform: (Int, A?, B?, C?, D?, E?, F?) -> R?
): List<R> = mapIndexedNotNull { index, (first, second, third, fourth, fifth, sixth) ->
    when {
        first == null && second == null && third == null && fourth == null && fifth == null && sixth == null -> null
        else -> transform(index, first, second, third, fourth, fifth, sixth)
    }
}

/**
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each tuple that contains at least one non-null value and its index in the original collection.
 */
inline fun <A, B, C, D, E, F, G, R> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.mapIndexedAnyNotNull(
    transform: (Int, A?, B?, C?, D?, E?, F?, G?) -> R?
): List<R> = mapIndexedNotNull { index, (first, second, third, fourth, fifth, sixth, seventh) ->
    when {
        first == null && second == null && third == null && fourth == null && fifth == null && sixth == null && seventh == null -> null
        else -> transform(index, first, second, third, fourth, fifth, sixth, seventh)
    }
}
