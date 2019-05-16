package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

inline infix fun <A, B, R : Any> Iterable<Pair<A?, B?>>.mapIndexedNotNull(transform: (Int, A?, B?) -> R?): List<R> =
        mapIndexedNotNull { index, (first, second) ->
            when (Pair(first, second)) {
                Pair(null, null) -> null
                else -> transform(index, first, second)
            }
        }

inline infix fun <A, B, C, R : Any> Iterable<Triple<A?, B?, C?>>.mapIndexedNotNull(transform: (Int, A?, B?, C?) -> R?): List<R> =
        mapIndexedNotNull { index, (first, second, third) ->
            when (Triple(first, second, third)) {
                Triple(null, null, null) -> null
                else -> transform(index, first, second, third)
            }
        }

inline infix fun <A, B, C, D, R : Any> Iterable<Quad<A?, B?, C?, D?>>.mapIndexedNotNull(transform: (Int, A?, B?, C?, D?) -> R?): List<R> =
        mapIndexedNotNull { index, (first, second, third, fourth) ->
            when (Quad(first, second, third, fourth)) {
                Quad(null, null, null, null) -> null
                else -> transform(index, first, second, third, fourth)
            }
        }

inline infix fun <A, B, C, D, E, R : Any> Iterable<Penta<A?, B?, C?, D?, E?>>.mapIndexedNotNull(transform: (Int, A?, B?, C?, D?, E?) -> R?): List<R> =
        mapIndexedNotNull { index, (first, second, third, fourth, fifth) ->
            when (Penta(first, second, third, fourth, fifth)) {
                Penta(null, null, null, null, null) -> null
                else -> transform(index, first, second, third, fourth, fifth)
            }
        }

inline infix fun <A, B, C, D, E, F, R : Any> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapIndexedNotNull(transform: (Int, A?, B?, C?, D?, E?, F?) -> R?): List<R> =
        mapIndexedNotNull { index, (first, second, third, fourth, fifth, sixth) ->
            when (Hexa(first, second, third, fourth, fifth, sixth)) {
                Hexa(null, null, null, null, null, null) -> null
                else -> transform(index, first, second, third, fourth, fifth, sixth)
            }
        }

inline infix fun <A, B, C, D, E, F, G, R : Any> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.mapIndexedNotNull(transform: (Int, A?, B?, C?, D?, E?, F?, G?) -> R?): List<R> =
        mapIndexedNotNull { index, (first, second, third, fourth, fifth, sixth, seventh) ->
            when (Hepta(first, second, third, fourth, fifth, sixth, seventh)) {
                Hepta(null, null, null, null, null, null, null) -> null
                else -> transform(index, first, second, third, fourth, fifth, sixth, seventh)
            }
        }
