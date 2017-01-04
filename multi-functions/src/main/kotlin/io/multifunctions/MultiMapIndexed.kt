package io.multifunctions

import io.multifunctions.models.*

interface MultiMapIndexed {

    fun <A, B, R> Iterable<Pair<A?, B?>>.mapIndexed(transform: (Int, A?, B?) -> R): List<R?> =
            this.mapIndexed { index, elem -> transform(index, elem.first, elem.second) }

    fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.mapIndexed(transform: (Int, A?, B?, C?) -> R): List<R?> =
            this.mapIndexed { index, elem -> transform(index, elem.first, elem.second, elem.third) }

    fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.mapIndexed(transform: (Int, A?, B?, C?, D?) -> R): List<R?> =
            this.mapIndexed { index, elem -> transform(index, elem.first, elem.second, elem.third, elem.fourth) }

    fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.mapIndexed(transform: (Int, A?, B?, C?, D?, E?) -> R): List<R?> =
            this.mapIndexed { index, elem -> transform(index, elem.first, elem.second, elem.third, elem.fourth, elem.fifth) }

    fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapIndexed(transform: (Int, A?, B?, C?, D?, E?, F?) -> R): List<R?> =
            this.mapIndexed { index, elem -> transform(index, elem.first, elem.second, elem.third, elem.fourth, elem.fifth, elem.sixth) }

}
