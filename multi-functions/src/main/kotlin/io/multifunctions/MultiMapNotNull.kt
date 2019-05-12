package io.multifunctions

import io.multifunctions.models.*

inline infix fun <A, B, R : Any> Iterable<Pair<A?, B?>>.mapNotNull(transform: (A?, B?) -> R?): List<R> =
        this.mapNotNull { (first, second) ->
            when (Pair(first, second)) {
                Pair(null, null) -> null
                else -> transform(first, second)
            }
        }

inline infix fun <A, B, C, R : Any> Iterable<Triple<A?, B?, C?>>.mapNotNull(transform: (A?, B?, C?) -> R?): List<R> =
        this.mapNotNull { (first, second, third) ->
            when (Triple(first, second, third)) {
                Triple(null, null, null) -> null
                else -> transform(first, second, third)
            }
        }

inline infix fun <A, B, C, D, R : Any> Iterable<Quad<A?, B?, C?, D?>>.mapNotNull(transform: (A?, B?, C?, D?) -> R?): List<R> =
        this.mapNotNull { (first, second, third, fourth) ->
            when (Quad(first, second, third, fourth)) {
                Quad(null, null, null, null) -> null
                else -> transform(first, second, third, fourth)
            }
        }

inline infix fun <A, B, C, D, E, R : Any> Iterable<Penta<A?, B?, C?, D?, E?>>.mapNotNull(transform: (A?, B?, C?, D?, E?) -> R?): List<R> =
        this.mapNotNull { (first, second, third, fourth, fifth) ->
            when (Penta(first, second, third, fourth, fifth)) {
                Quad(null, null, null, null) -> null
                else -> transform(first, second, third, fourth, fifth)
            }
        }

inline infix fun <A, B, C, D, E, F, R : Any> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapNotNull(transform: (A?, B?, C?, D?, E?, F?) -> R?): List<R> =
        this.mapNotNull { (first, second, third, fourth, fifth, sixth) ->
            when (Hexa(first, second, third, fourth, fifth, sixth)) {
                Hexa(null, null, null, null, null, null) -> null
                else -> transform(first, second, third, fourth, fifth, sixth)
            }
        }

inline infix fun <A, B, C, D, E, F, G, R : Any> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.mapNotNull(transform: (A?, B?, C?, D?, E?, F?, G?) -> R?): List<R> =
        this.mapNotNull { (first, second, third, fourth, fifth, sixth, seventh) ->
            when (Hepta(first, second, third, fourth, fifth, sixth, seventh)) {
                Hexa(null, null, null, null, null, null) -> null
                else -> transform(first, second, third, fourth, fifth, sixth, seventh)
            }
        }