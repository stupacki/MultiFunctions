package io.multifunctions

import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

interface MultiForEachIndexed {
        fun <A, B> Iterable<Pair<A?, B?>>.forEachIndexed(action: (Int, A?, B?) -> Unit): Unit =
                this.forEachIndexed { index, elem -> action(index, elem.first, elem.second) }

        fun <A, B, C> Iterable<Triple<A?, B?, C?>>.forEachIndexed(action: (Int, A?, B?, C?) -> Unit): Unit =
                this.forEachIndexed { index, elem -> action(index, elem.first, elem.second, elem.third) }

        fun <A, B, C, D> Iterable<Quad<A?, B?, C?, D?>>.forEachIndexed(action: (Int, A?, B?, C?, D?) -> Unit): Unit =
                this.forEachIndexed { index, elem -> action(index, elem.first, elem.second, elem.third, elem.fourth) }

        fun <A, B, C, D, E> Iterable<Penta<A?, B?, C?, D?, E?>>.forEachIndexed(action: (Int, A?, B?, C?, D?, E?) -> Unit): Unit =
                this.forEachIndexed { index, elem -> action(index, elem.first, elem.second, elem.third, elem.fourth, elem.fifth) }

        fun <A, B, C, D, E, F> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.forEachIndexed(action: (Int, A?, B?, C?, D?, E?, F?) -> Unit): Unit =
                this.forEachIndexed { index, elem -> action(index, elem.first, elem.second, elem.third, elem.fourth, elem.fifth, elem.sixth) }
    }