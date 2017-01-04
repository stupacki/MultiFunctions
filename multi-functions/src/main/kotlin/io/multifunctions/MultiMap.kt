package io.multifunctions

import io.multifunctions.models.*

interface MultiMap {
    fun <A, B, R> Iterable<Pair<A?, B?>>.map(transform: (A?, B?) -> R): List<R?> =
            this.map { elem -> transform(elem.first, elem.second) }

    fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.map(transform: (A?, B?, C?) -> R): List<R?> =
            this.map { elem -> transform(elem.first, elem.second, elem.third) }

    fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.map(transform: (A?, B?, C?, D?) -> R): List<R?> =
            this.map { elem -> transform(elem.first, elem.second, elem.third, elem.fourth) }

    fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.map(transform: (A?, B?, C?, D?, E?) -> R): List<R?> =
            this.map { elem -> transform(elem.first, elem.second, elem.third, elem.fourth, elem.fifth) }

    fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.map(transform: (A?, B?, C?, D?, E?, F?) -> R): List<R?> =
            this.map { elem -> transform(elem.first, elem.second, elem.third, elem.fourth, elem.fifth, elem.sixth) }
}