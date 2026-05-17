package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Returns a lazy sequence containing the results of applying [transform] to each unpacked pair element.
 */
inline fun <A, B, R> Sequence<Pair<A?, B?>>.map(
    crossinline transform: (A?, B?) -> R
): Sequence<R> = map { (first, second) ->
    transform(first, second)
}

/**
 * Returns a lazy sequence containing the results of applying [transform] to each unpacked triple element.
 */
inline fun <A, B, C, R> Sequence<Triple<A?, B?, C?>>.map(
    crossinline transform: (A?, B?, C?) -> R
): Sequence<R> = map { (first, second, third) ->
    transform(first, second, third)
}

/**
 * Returns a lazy sequence containing the results of applying [transform] to each unpacked quad element.
 */
inline fun <A, B, C, D, R> Sequence<Quad<A?, B?, C?, D?>>.map(
    crossinline transform: (A?, B?, C?, D?) -> R
): Sequence<R> = map { (first, second, third, fourth) ->
    transform(first, second, third, fourth)
}

/**
 * Returns a lazy sequence containing the results of applying [transform] to each unpacked penta element.
 */
inline fun <A, B, C, D, E, R> Sequence<Penta<A?, B?, C?, D?, E?>>.map(
    crossinline transform: (A?, B?, C?, D?, E?) -> R
): Sequence<R> = map { (first, second, third, fourth, fifth) ->
    transform(first, second, third, fourth, fifth)
}

/**
 * Returns a lazy sequence containing the results of applying [transform] to each unpacked hexa element.
 */
inline fun <A, B, C, D, E, F, R> Sequence<Hexa<A?, B?, C?, D?, E?, F?>>.map(
    crossinline transform: (A?, B?, C?, D?, E?, F?) -> R
): Sequence<R> = map { (first, second, third, fourth, fifth, sixth) ->
    transform(first, second, third, fourth, fifth, sixth)
}

/**
 * Returns a lazy sequence containing the results of applying [transform] to each unpacked hepta element.
 */
inline fun <A, B, C, D, E, F, G, R> Sequence<Hepta<A?, B?, C?, D?, E?, F?, G?>>.map(
    crossinline transform: (A?, B?, C?, D?, E?, F?, G?) -> R
): Sequence<R> = map { (first, second, third, fourth, fifth, sixth, seventh) ->
    transform(first, second, third, fourth, fifth, sixth, seventh)
}

/**
 * Returns a lazy sequence containing only non-null results of applying [transform] to each unpacked pair element.
 */
inline fun <A, B, R> Sequence<Pair<A?, B?>>.mapNotNull(
    crossinline transform: (A?, B?) -> R?
): Sequence<R> = mapNotNull { (first, second) ->
    transform(first, second)
}

/**
 * Returns a lazy sequence containing only non-null results of applying [transform] to each unpacked triple element.
 */
inline fun <A, B, C, R> Sequence<Triple<A?, B?, C?>>.mapNotNull(
    crossinline transform: (A?, B?, C?) -> R?
): Sequence<R> = mapNotNull { (first, second, third) ->
    transform(first, second, third)
}

/**
 * Returns a lazy sequence containing only non-null results of applying [transform] to each unpacked quad element.
 */
inline fun <A, B, C, D, R> Sequence<Quad<A?, B?, C?, D?>>.mapNotNull(
    crossinline transform: (A?, B?, C?, D?) -> R?
): Sequence<R> = mapNotNull { (first, second, third, fourth) ->
    transform(first, second, third, fourth)
}

/**
 * Returns a lazy sequence containing only non-null results of applying [transform] to each unpacked penta element.
 */
inline fun <A, B, C, D, E, R> Sequence<Penta<A?, B?, C?, D?, E?>>.mapNotNull(
    crossinline transform: (A?, B?, C?, D?, E?) -> R?
): Sequence<R> = mapNotNull { (first, second, third, fourth, fifth) ->
    transform(first, second, third, fourth, fifth)
}

/**
 * Returns a lazy sequence containing only non-null results of applying [transform] to each unpacked hexa element.
 */
inline fun <A, B, C, D, E, F, R> Sequence<Hexa<A?, B?, C?, D?, E?, F?>>.mapNotNull(
    crossinline transform: (A?, B?, C?, D?, E?, F?) -> R?
): Sequence<R> = mapNotNull { (first, second, third, fourth, fifth, sixth) ->
    transform(first, second, third, fourth, fifth, sixth)
}

/**
 * Returns a lazy sequence containing only non-null results of applying [transform] to each unpacked hepta element.
 */
inline fun <A, B, C, D, E, F, G, R> Sequence<Hepta<A?, B?, C?, D?, E?, F?, G?>>.mapNotNull(
    crossinline transform: (A?, B?, C?, D?, E?, F?, G?) -> R?
): Sequence<R> = mapNotNull { (first, second, third, fourth, fifth, sixth, seventh) ->
    transform(first, second, third, fourth, fifth, sixth, seventh)
}

/**
 * Returns a lazy sequence of non-null transform results, skipping pair elements where both values are null.
 */
inline fun <A, B, R> Sequence<Pair<A?, B?>>.mapAnyNotNull(
    crossinline transform: (A?, B?) -> R?
): Sequence<R> = mapNotNull { (first, second) ->
    when {
        first == null && second == null -> null
        else -> transform(first, second)
    }
}

/**
 * Returns a lazy sequence of non-null transform results, skipping triple elements where all values are null.
 */
inline fun <A, B, C, R> Sequence<Triple<A?, B?, C?>>.mapAnyNotNull(
    crossinline transform: (A?, B?, C?) -> R?
): Sequence<R> = mapNotNull { (first, second, third) ->
    when {
        first == null && second == null && third == null -> null
        else -> transform(first, second, third)
    }
}

/**
 * Returns a lazy sequence of non-null transform results, skipping quad elements where all values are null.
 */
inline fun <A, B, C, D, R> Sequence<Quad<A?, B?, C?, D?>>.mapAnyNotNull(
    crossinline transform: (A?, B?, C?, D?) -> R?
): Sequence<R> = mapNotNull { (first, second, third, fourth) ->
    when {
        first == null && second == null && third == null && fourth == null -> null
        else -> transform(first, second, third, fourth)
    }
}

/**
 * Returns a lazy sequence of non-null transform results, skipping penta elements where all values are null.
 */
inline fun <A, B, C, D, E, R> Sequence<Penta<A?, B?, C?, D?, E?>>.mapAnyNotNull(
    crossinline transform: (A?, B?, C?, D?, E?) -> R?
): Sequence<R> = mapNotNull { (first, second, third, fourth, fifth) ->
    when {
        first == null && second == null && third == null && fourth == null && fifth == null -> null
        else -> transform(first, second, third, fourth, fifth)
    }
}

/**
 * Returns a lazy sequence of non-null transform results, skipping hexa elements where all values are null.
 */
inline fun <A, B, C, D, E, F, R> Sequence<Hexa<A?, B?, C?, D?, E?, F?>>.mapAnyNotNull(
    crossinline transform: (A?, B?, C?, D?, E?, F?) -> R?
): Sequence<R> = mapNotNull { (first, second, third, fourth, fifth, sixth) ->
    when {
        first == null && second == null && third == null && fourth == null && fifth == null && sixth == null -> null
        else -> transform(first, second, third, fourth, fifth, sixth)
    }
}

/**
 * Returns a lazy sequence of non-null transform results, skipping hepta elements where all values are null.
 */
inline fun <A, B, C, D, E, F, G, R> Sequence<Hepta<A?, B?, C?, D?, E?, F?, G?>>.mapAnyNotNull(
    crossinline transform: (A?, B?, C?, D?, E?, F?, G?) -> R?
): Sequence<R> = mapNotNull { (first, second, third, fourth, fifth, sixth, seventh) ->
    when {
        first == null && second == null && third == null && fourth == null && fifth == null && sixth == null && seventh == null -> null
        else -> transform(first, second, third, fourth, fifth, sixth, seventh)
    }
}

/**
 * Returns a lazy sequence containing transformed pair elements whose values are both non-null.
 */
inline fun <A, B, R> Sequence<Pair<A?, B?>>.mapCheckNull(
    crossinline transform: (A, B) -> R
): Sequence<R> = mapNotNull { (first, second) ->
    if (first == null || second == null) null else transform(first, second)
}

/**
 * Returns a lazy sequence containing transformed triple elements whose values are all non-null.
 */
inline fun <A, B, C, R> Sequence<Triple<A?, B?, C?>>.mapCheckNull(
    crossinline transform: (A, B, C) -> R
): Sequence<R> = mapNotNull { (first, second, third) ->
    if (first == null || second == null || third == null) null else transform(first, second, third)
}

/**
 * Returns a lazy sequence containing transformed quad elements whose values are all non-null.
 */
inline fun <A, B, C, D, R> Sequence<Quad<A?, B?, C?, D?>>.mapCheckNull(
    crossinline transform: (A, B, C, D) -> R
): Sequence<R> = mapNotNull { (first, second, third, fourth) ->
    if (first == null || second == null || third == null || fourth == null) null
    else transform(first, second, third, fourth)
}

/**
 * Returns a lazy sequence containing transformed penta elements whose values are all non-null.
 */
inline fun <A, B, C, D, E, R> Sequence<Penta<A?, B?, C?, D?, E?>>.mapCheckNull(
    crossinline transform: (A, B, C, D, E) -> R
): Sequence<R> = mapNotNull { (first, second, third, fourth, fifth) ->
    if (first == null || second == null || third == null || fourth == null || fifth == null) null
    else transform(first, second, third, fourth, fifth)
}

/**
 * Returns a lazy sequence containing transformed hexa elements whose values are all non-null.
 */
inline fun <A, B, C, D, E, F, R> Sequence<Hexa<A?, B?, C?, D?, E?, F?>>.mapCheckNull(
    crossinline transform: (A, B, C, D, E, F) -> R
): Sequence<R> = mapNotNull { (first, second, third, fourth, fifth, sixth) ->
    if (first == null || second == null || third == null || fourth == null || fifth == null || sixth == null) null
    else transform(first, second, third, fourth, fifth, sixth)
}

/**
 * Returns a lazy sequence containing transformed hepta elements whose values are all non-null.
 */
inline fun <A, B, C, D, E, F, G, R> Sequence<Hepta<A?, B?, C?, D?, E?, F?, G?>>.mapCheckNull(
    crossinline transform: (A, B, C, D, E, F, G) -> R
): Sequence<R> = mapNotNull { (first, second, third, fourth, fifth, sixth, seventh) ->
    if (
        first == null ||
        second == null ||
        third == null ||
        fourth == null ||
        fifth == null ||
        sixth == null ||
        seventh == null
    ) {
        null
    } else {
        transform(first, second, third, fourth, fifth, sixth, seventh)
    }
}
