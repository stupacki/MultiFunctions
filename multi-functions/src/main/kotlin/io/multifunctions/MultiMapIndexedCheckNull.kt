package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

inline infix fun <A, B, R : Any> Iterable<Pair<A?, B?>>.mapIndexedCheckNull(transform: (Int, A, B) -> R): List<R> =
        mapIndexedNotNull { index, (first, second) ->
            when (null) {
                first, second -> null
                else -> transform(index, first, second)
            }
        }

inline infix fun <A, B, C, R : Any> Iterable<Triple<A?, B?, C?>>.mapIndexedCheckNull(transform: (Int, A, B, C) -> R): List<R> =
        mapIndexedNotNull { index, (first, second, third) ->
            when (null) {
                first, second, third -> null
                else -> transform(index, first, second, third)
            }
        }

inline infix fun <A, B, C, D, R : Any> Iterable<Quad<A?, B?, C?, D?>>.mapIndexedCheckNull(transform: (Int, A, B, C, D) -> R): List<R> =
        mapIndexedNotNull { index, (first, second, third, fourth) ->
            when (null) {
                first, second, third, fourth -> null
                else -> transform(index, first, second, third, fourth)
            }
        }

inline infix fun <A, B, C, D, E, R : Any> Iterable<Penta<A?, B?, C?, D?, E?>>.mapIndexedCheckNull(transform: (Int, A, B, C, D, E) -> R): List<R> =
        mapIndexedNotNull { index, (first, second, third, fourth, fifth) ->
            when (null) {
                first, second, third, fourth, fifth -> null
                else -> transform(index, first, second, third, fourth, fifth)
            }
        }

inline infix fun <A, B, C, D, E, F, R : Any> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapIndexedCheckNull(transform: (Int, A, B, C, D, E, F) -> R): List<R> =
        mapIndexedNotNull { index, (first, second, third, fourth, fifth, sixth) ->
            when (null) {
                first, second, third, fourth, fifth, sixth -> null
                else -> transform(index, first, second, third, fourth, fifth, sixth)
            }
        }

inline infix fun <A, B, C, D, E, F, G, R : Any> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.mapIndexedCheckNull(transform: (Int, A, B, C, D, E, F, G) -> R): List<R> =
        mapIndexedNotNull { index, (first, second, third, fourth, fifth, sixth, seventh) ->
            when (null) {
                first, second, third, fourth, fifth, sixth, seventh -> null
                else -> transform(index, first, second, third, fourth, fifth, sixth, seventh)
            }
        }
