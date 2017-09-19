package io.multifunctions

import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

inline fun <A, B> Iterable<Pair<A?, B?>>.forEachIndexed(action: (Int, A?, B?) -> Unit) =
        this.forEachIndexed { index, (first, second) -> action(index, first, second) }

inline fun <A, B, C> Iterable<Triple<A?, B?, C?>>.forEachIndexed(action: (Int, A?, B?, C?) -> Unit) =
        this.forEachIndexed { index, (first, second, third) -> action(index, first, second, third) }

inline fun <A, B, C, D> Iterable<Quad<A?, B?, C?, D?>>.forEachIndexed(action: (Int, A?, B?, C?, D?) -> Unit) =
        this.forEachIndexed { index, (first, second, third, fourth) -> action(index, first, second, third, fourth) }

inline fun <A, B, C, D, E> Iterable<Penta<A?, B?, C?, D?, E?>>.forEachIndexed(action: (Int, A?, B?, C?, D?, E?) -> Unit) =
        this.forEachIndexed { index, (first, second, third, fourth, fifth) -> action(index, first, second, third, fourth, fifth) }

inline fun <A, B, C, D, E, F> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.forEachIndexed(action: (Int, A?, B?, C?, D?, E?, F?) -> Unit) =
        this.forEachIndexed { index, (first, second, third, fourth, fifth, sixth) -> action(index, first, second, third, fourth, fifth, sixth) }