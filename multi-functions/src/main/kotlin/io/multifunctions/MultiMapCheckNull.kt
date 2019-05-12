package io.multifunctions

import io.multifunctions.models.*

inline infix fun <A, B, R : Any> Iterable<Pair<A?, B?>>.mapCheckNull(transform: (A, B) -> R): List<R> =
        this.mapNotNull { (first, second) ->
            when (null) {
                first, second -> null
                else -> transform(first, second)
            }
        }

inline infix fun <A, B, C, R : Any> Iterable<Triple<A?, B?, C?>>.mapCheckNull(transform: (A, B, C) -> R): List<R> =
        this.mapNotNull { (first, second, third) ->
            when (null) {
                first, second, third -> null
                else -> transform(first, second, third)
            }
        }

inline infix fun <A, B, C, D, R : Any> Iterable<Quad<A?, B?, C?, D?>>.mapCheckNull(transform: (A, B, C, D) -> R): List<R> =
        this.mapNotNull { (first, second, third, fourth) ->
            when (null) {
                first, second, third, fourth -> null
                else -> transform(first, second, third, fourth)
            }
        }

inline infix fun <A, B, C, D, E, R : Any> Iterable<Penta<A?, B?, C?, D?, E?>>.mapCheckNull(transform: (A, B, C, D, E) -> R): List<R> =
        this.mapNotNull { (first, second, third, fourth, fifth) ->
            when (null) {
                first, second, third, fourth, fifth -> null
                else -> transform(first, second, third, fourth, fifth)
            }
        }

inline infix fun <A, B, C, D, E, F, R : Any> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapCheckNull(transform: (A, B, C, D, E, F) -> R): List<R> =
        this.mapNotNull { (first, second, third, fourth, fifth, sixth) ->
            when (null) {
                first, second, third, fourth, fifth, sixth -> null
                else -> transform(first, second, third, fourth, fifth, sixth)
            }
        }

inline infix fun <A, B, C, D, E, F, G, R : Any> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.mapCheckNull(transform: (A, B, C, D, E, F, G) -> R): List<R> =
        this.mapNotNull { (first, second, third, fourth, fifth, sixth, seventh) ->
            when (null) {
                first, second, third, fourth, fifth, sixth, seventh -> null
                else -> transform(first, second, third, fourth, fifth, sixth, seventh)
            }
        }