package io.multifunctions

import io.multifunctions.models.*

inline infix fun <A, B, R> Iterable<Pair<A?, B?>>.withIndex(transform: (A?, B?) -> R): Iterable<IndexedValue<R?>> =
        this.mapIndexed { index, (first, second) -> IndexedValue(index, transform(first, second)) }

inline infix fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.withIndex(transform: (A?, B?, C?) -> R): Iterable<IndexedValue<R?>> =
        this.mapIndexed { index, (first, second, third) -> IndexedValue(index, transform(first, second, third)) }

inline infix fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.withIndex(transform: (A?, B?, C?, D?) -> R): Iterable<IndexedValue<R?>> =
        this.mapIndexed { index, (first, second, third, fourth) -> IndexedValue(index, transform(first, second, third, fourth)) }

inline infix fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.withIndex(transform: (A?, B?, C?, D?, E?) -> R): Iterable<IndexedValue<R?>> =
        this.mapIndexed { index, (first, second, third, fourth, fifth) -> IndexedValue(index, transform(first, second, third, fourth, fifth)) }

inline infix fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.withIndex(transform: (A?, B?, C?, D?, E?, F?) -> R): Iterable<IndexedValue<R?>> =
        this.mapIndexed { index, (first, second, third, fourth, fifth, sixth) -> IndexedValue(index, transform(first, second, third, fourth, fifth, sixth)) }

inline infix fun <A, B, C, D, E, F, G, R> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.withIndex(transform: (A?, B?, C?, D?, E?, F?, G?) -> R): Iterable<IndexedValue<R?>> =
        this.mapIndexed { index, (first, second, third, fourth, fifth, sixth, seventh) -> IndexedValue(index, transform(first, second, third, fourth, fifth, sixth, seventh)) }