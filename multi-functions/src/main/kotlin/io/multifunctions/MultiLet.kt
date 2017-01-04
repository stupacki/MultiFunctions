package io.multifunctions

import io.multifunctions.models.*

interface MultiLet {
    fun <A, B, R> Pair<A?, B?>.let(transform: (A?, B?) -> R): R? =
            transform(first, second)

    fun <A, B, C, R> Triple<A?, B?, C?>.let(transform: (A?, B?, C?) -> R): R? =
            transform(first, second, third)

    fun <A, B, C, D, R> Quad<A, B, C, D>.let(transform: (A?, B?, C?, D?) -> R): R? =
            transform(first, second, third, fourth)


    fun <A, B, C, D, E, R> Penta<A, B, C, D, E>.let(transform: (A?, B?, C?, D?, E?) -> R): R? =
            transform(first, second, third, fourth, fifth)


    fun <A, B, C, D, E, F, R> Hexa<A, B, C, D, E, F>.let(transform: (A?, B?, C?, D?, E?, F?) -> R): R? =
            transform(first, second, third, fourth, fifth, sixth)
}
