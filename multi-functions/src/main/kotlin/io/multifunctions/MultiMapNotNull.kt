package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

inline infix fun <A, B, R : Any> Iterable<Pair<A?, B?>>.mapNotNull(transform: (A?, B?) -> R?): List<R> =
    mapNotNull { (first, second) ->
        when {
            first == null && second == null -> null
            else -> transform(first, second)
        }
    }

inline infix fun <A, B, C, R : Any> Iterable<Triple<A?, B?, C?>>.mapNotNull(transform: (A?, B?, C?) -> R?): List<R> =
    mapNotNull { (first, second, third) ->
        when {
            first == null && second == null && third == null -> null
            else -> transform(first, second, third)
        }
    }

inline infix fun <A, B, C, D, R : Any> Iterable<Quad<A?, B?, C?, D?>>.mapNotNull(transform: (A?, B?, C?, D?) -> R?): List<R> =
    mapNotNull { (first, second, third, fourth) ->
        when {
            first == null && second == null && third == null && fourth == null -> null
            else -> transform(first, second, third, fourth)
        }
    }

inline infix fun <A, B, C, D, E, R : Any> Iterable<Penta<A?, B?, C?, D?, E?>>.mapNotNull(transform: (A?, B?, C?, D?, E?) -> R?): List<R> =
    mapNotNull { (first, second, third, fourth, fifth) ->
        when {
            first == null && second == null && third == null && fourth == null && fifth == null -> null
            else -> transform(first, second, third, fourth, fifth)
        }
    }

inline infix fun <A, B, C, D, E, F, R : Any> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapNotNull(transform: (A?, B?, C?, D?, E?, F?) -> R?): List<R> =
    mapNotNull { (first, second, third, fourth, fifth, sixth) ->
        when {
            first == null && second == null && third == null && fourth == null && fifth == null && sixth == null -> null
            else -> transform(first, second, third, fourth, fifth, sixth)
        }
    }

inline infix fun <A, B, C, D, E, F, G, R : Any> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.mapNotNull(transform: (A?, B?, C?, D?, E?, F?, G?) -> R?): List<R> =
    mapNotNull { (first, second, third, fourth, fifth, sixth, seventh) ->
        when {
            first == null && second == null && third == null && fourth == null && fifth == null && sixth == null && seventh == null -> null
            else -> transform(first, second, third, fourth, fifth, sixth, seventh)
        }
    }
