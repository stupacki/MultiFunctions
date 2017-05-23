package io.multifunctions

import io.multifunctions.models.*

fun <A, B, R> Iterable<Pair<A?, B?>>.flatMap(transform: (A?, B?) -> Iterable<R>): List<R?> =
        this.flatMap { elem -> transform(elem.first, elem.second) }

fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.flatMap(transform: (A?, B?, C?) -> Iterable<R>): List<R?> =
        this.flatMap { elem -> transform(elem.first, elem.second, elem.third) }

fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.flatMap(transform: (A?, B?, C?, D?) -> Iterable<R>): List<R?> =
        this.flatMap { elem -> transform(elem.first, elem.second, elem.third, elem.fourth) }

fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.flatMap(transform: (A?, B?, C?, D?, E?) -> Iterable<R>): List<R?> =
        this.flatMap { elem -> transform(elem.first, elem.second, elem.third, elem.fourth, elem.fifth) }

fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.flatMap(transform: (A?, B?, C?, D?, E?, F?) -> Iterable<R>): List<R?> =
        this.flatMap { elem -> transform(elem.first, elem.second, elem.third, elem.fourth, elem.fifth, elem.sixth) }