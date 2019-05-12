package io.multifunctions

import io.multifunctions.models.*

inline infix fun <A, B, R> Iterable<Pair<A?, B?>>.flatMap(transform: (A?, B?) -> Iterable<R>): List<R?> =
        this.flatMap { (first, second) -> transform(first, second) }

inline infix fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.flatMap(transform: (A?, B?, C?) -> Iterable<R>): List<R?> =
        this.flatMap { (first, second, third) -> transform(first, second, third) }

inline infix fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.flatMap(transform: (A?, B?, C?, D?) -> Iterable<R>): List<R?> =
        this.flatMap { (first, second, third, fourth) -> transform(first, second, third, fourth) }

inline infix fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.flatMap(transform: (A?, B?, C?, D?, E?) -> Iterable<R>): List<R?> =
        this.flatMap { (first, second, third, fourth, fifth) -> transform(first, second, third, fourth, fifth) }

inline infix fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.flatMap(transform: (A?, B?, C?, D?, E?, F?) -> Iterable<R>): List<R?> =
        this.flatMap { (first, second, third, fourth, fifth, sixth) -> transform(first, second, third, fourth, fifth, sixth) }

inline infix fun <A, B, C, D, E, F, G, R> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.flatMap(transform: (A?, B?, C?, D?, E?, F?, G?) -> Iterable<R>): List<R?> =
        this.flatMap { (first, second, third, fourth, fifth, sixth, seventh) -> transform(first, second, third, fourth, fifth, sixth, seventh) }