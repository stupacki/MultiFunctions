package io.multifunctions

import io.multifunctions.models.*

inline fun <A, B, R> Iterable<Pair<A?, B?>>.mapIndexed(transform: (Int, A?, B?) -> R): List<R?> =
        this.mapIndexed { index, (first, second) -> transform(index, first, second) }

inline fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.mapIndexed(transform: (Int, A?, B?, C?) -> R): List<R?> =
        this.mapIndexed { index, (first, second, third) -> transform(index, first, second, third) }

inline fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.mapIndexed(transform: (Int, A?, B?, C?, D?) -> R): List<R?> =
        this.mapIndexed { index, (first, second, third, fourth) -> transform(index, first, second, third, fourth) }

inline fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.mapIndexed(transform: (Int, A?, B?, C?, D?, E?) -> R): List<R?> =
        this.mapIndexed { index, (first, second, third, fourth, fifth) -> transform(index, first, second, third, fourth, fifth) }

inline fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapIndexed(transform: (Int, A?, B?, C?, D?, E?, F?) -> R): List<R?> =
        this.mapIndexed { index, (first, second, third, fourth, fifth, sixth) -> transform(index, first, second, third, fourth, fifth, sixth) }