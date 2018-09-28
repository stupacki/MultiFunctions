package io.multifunctions

import io.multifunctions.models.*

inline fun <A, B, R : Any> Iterable<Pair<A?, B?>>.mapIndexedNotNull(transform: (Int, A, B) -> R): List<R> =
        this.mapIndexedNotNull { index, (first, second) ->
            when (null) {
                first, second -> null
                else -> transform(index, first, second)
            }
        }

inline fun <A, B, C, R : Any> Iterable<Triple<A?, B?, C?>>.mapIndexedNotNull(transform: (Int, A, B, C) -> R): List<R> =
        this.mapIndexedNotNull { index, (first, second, third) ->
            when (null) {
                first, second, third -> null
                else -> transform(index, first, second, third)
            }
        }

inline fun <A, B, C, D, R : Any> Iterable<Quad<A?, B?, C?, D?>>.mapIndexedNotNull(transform: (Int, A, B, C, D) -> R): List<R> =
        this.mapIndexedNotNull { index, (first, second, third, fourth) ->
            when (null) {
                first, second, third, fourth -> null
                else -> transform(index, first, second, third, fourth)
            }
        }

inline fun <A, B, C, D, E, R : Any> Iterable<Penta<A?, B?, C?, D?, E?>>.mapIndexedNotNull(transform: (Int, A, B, C, D, E) -> R): List<R> =
        this.mapIndexedNotNull { index, (first, second, third, fourth, fifth) ->
            when (null) {
                first, second, third, fourth, fifth -> null
                else -> transform(index, first, second, third, fourth, fifth)
            }
        }

inline fun <A, B, C, D, E, F, R : Any> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapIndexedNotNull(transform: (Int, A, B, C, D, E, F) -> R): List<R> =
        this.mapIndexedNotNull { index, (first, second, third, fourth, fifth, sixth) ->
            when (null) {
                first, second, third, fourth, fifth, sixth -> null
                else -> transform(index, first, second, third, fourth, fifth, sixth)
            }
        }

inline fun <A, B, C, D, E, F, G, R : Any> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.mapIndexedNotNull(transform: (Int, A, B, C, D, E, F, G) -> R): List<R> =
        this.mapIndexedNotNull { index, (first, second, third, fourth, fifth, sixth, seventh) ->
            when (null) {
                first, second, third, fourth, fifth, sixth, seventh -> null
                else -> transform(index, first, second, third, fourth, fifth, sixth, seventh)
            }
        }