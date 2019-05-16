package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

inline infix fun <A, B, R> Iterable<Pair<A?, B?>>.mapIndexed(transform: (Int, A?, B?) -> R): List<R?> =
        mapIndexed { index, (first, second) ->
            transform(index, first, second)
        }

inline infix fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.mapIndexed(transform: (Int, A?, B?, C?) -> R): List<R?> =
        mapIndexed { index, (first, second, third) ->
            transform(index, first, second, third)
        }

inline infix fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.mapIndexed(transform: (Int, A?, B?, C?, D?) -> R): List<R?> =
        mapIndexed { index, (first, second, third, fourth) ->
            transform(index, first, second, third, fourth)
        }

inline infix fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.mapIndexed(transform: (Int, A?, B?, C?, D?, E?) -> R): List<R?> =
        mapIndexed { index, (first, second, third, fourth, fifth) ->
            transform(index, first, second, third, fourth, fifth)
        }

inline infix fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapIndexed(transform: (Int, A?, B?, C?, D?, E?, F?) -> R): List<R?> =
        mapIndexed { index, (first, second, third, fourth, fifth, sixth) ->
            transform(index, first, second, third, fourth, fifth, sixth)
        }

inline infix fun <A, B, C, D, E, F, G, R> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.mapIndexed(transform: (Int, A?, B?, C?, D?, E?, F?, G?) -> R): List<R?> =
        mapIndexed { index, (first, second, third, fourth, fifth, sixth, seventh) ->
            transform(index, first, second, third, fourth, fifth, sixth, seventh)
        }
