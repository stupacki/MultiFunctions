package io.multifunctions

import io.multifunctions.models.*

fun <A, B, R> Iterable<Pair<A?, B?>>.withIndex(transform: (A?, B?) -> R): Iterable<IndexedValue<R?>> =
        this.mapIndexed { index, elem -> IndexedValue(index, transform(elem.first, elem.second)) }

fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.withIndex(transform: (A?, B?, C?) -> R): Iterable<IndexedValue<R?>> =
        this.mapIndexed { index, elem -> IndexedValue(index, transform(elem.first, elem.second, elem.third)) }

fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.withIndex(transform: (A?, B?, C?, D?) -> R): Iterable<IndexedValue<R?>> =
        this.mapIndexed { index, elem -> IndexedValue(index, transform(elem.first, elem.second, elem.third, elem.fourth)) }

fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.withIndex(transform: (A?, B?, C?, D?, E?) -> R): Iterable<IndexedValue<R?>> =
        this.mapIndexed { index, elem -> IndexedValue(index, transform(elem.first, elem.second, elem.third, elem.fourth, elem.fifth)) }

fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.withIndex(transform: (A?, B?, C?, D?, E?, F?) -> R): Iterable<IndexedValue<R?>> =
        this.mapIndexed { index, elem -> IndexedValue(index, transform(elem.first, elem.second, elem.third, elem.fourth, elem.fifth, elem.sixth)) }