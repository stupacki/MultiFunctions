@file:Suppress("UNCHECKED_CAST")

package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

inline infix fun <A, B, R> Pair<A?, B?>.letCheckNull(transform: (A, B) -> R): R? =
        when (null) {
            first, second -> null
            else -> transform(first as A, second as B)
        }

inline infix fun <A, B, C, R> Triple<A?, B?, C?>.letCheckNull(transform: (A, B, C) -> R): R? =
        when (null) {
            first, second, third -> null
            else -> transform(first as A, second as B, third as C)
        }

inline infix fun <A, B, C, D, R> Quad<A?, B?, C?, D?>.letCheckNull(transform: (A, B, C, D) -> R): R? =
        when (null) {
            first, second, third, fourth -> null
            else -> transform(first, second, third, fourth)
        }

inline infix fun <A, B, C, D, E, R> Penta<A?, B?, C?, D?, E?>.letCheckNull(transform: (A, B, C, D, E) -> R): R? =
        when (null) {
            first, second, third, fourth, fifth -> null
            else -> transform(first, second, third, fourth, fifth)
        }

inline infix fun <A, B, C, D, E, F, R> Hexa<A?, B?, C?, D?, E?, F?>.letCheckNull(transform: (A, B, C, D, E, F) -> R): R? =
        when (null) {
            first, second, third, fourth, fifth, sixth -> null
            else -> transform(first, second, third, fourth, fifth, sixth)
        }

inline infix fun <A, B, C, D, E, F, G, R> Hepta<A?, B?, C?, D?, E?, F?, G?>.letCheckNull(transform: (A, B, C, D, E, F, G) -> R): R? =
        when (null) {
            first, second, third, fourth, fifth, sixth, seventh -> null
            else -> transform(first, second, third, fourth, fifth, sixth, seventh)
        }