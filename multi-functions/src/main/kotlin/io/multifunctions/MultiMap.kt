package io.multifunctions

import io.multifunctions.models.*

inline fun <A, B, R> Iterable<Pair<A?, B?>>.map(transform: (A?, B?) -> R): List<R?> =
        this.map { (first, second) -> transform(first, second) }

inline fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.map(transform: (A?, B?, C?) -> R): List<R?> =
        this.map { (first, second, third) -> transform(first, second, third) }

inline fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.map(transform: (A?, B?, C?, D?) -> R): List<R?> =
        this.map { (first, second, third, fourth) -> transform(first, second, third, fourth) }

inline fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.map(transform: (A?, B?, C?, D?, E?) -> R): List<R?> =
        this.map { (first, second, third, fourth, fifth) -> transform(first, second, third, fourth, fifth) }

inline fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.map(transform: (A?, B?, C?, D?, E?, F?) -> R): List<R?> =
        this.map { (first, second, third, fourth, fifth, sixth) -> transform(first, second, third, fourth, fifth, sixth) }