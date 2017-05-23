package io.multifunctions

import io.multifunctions.models.*

fun <A, B, R : Any> Iterable<Pair<A?, B?>>.mapIndexedNotNull(transform: (Int, A?, B?) -> R): List<R> =
        this.mapIndexedNotNull { index, elem ->
            when (null) {
                elem.first, elem.second -> null
                else -> transform(index, elem.first, elem.second)
            }
        }

fun <A, B, C, R : Any> Iterable<Triple<A?, B?, C?>>.mapIndexedNotNull(transform: (Int, A?, B?, C?) -> R): List<R> =
        this.mapIndexedNotNull { index, elem ->
            when (null) {
                elem.first, elem.second, elem.third -> null
                else -> transform(index, elem.first, elem.second, elem.third)
            }
        }

fun <A, B, C, D, R : Any> Iterable<Quad<A?, B?, C?, D?>>.mapIndexedNotNull(transform: (Int, A?, B?, C?, D?) -> R): List<R> =
        this.mapIndexedNotNull { index, elem ->
            when (null) {
                elem.first, elem.second, elem.third, elem.fourth -> null
                else -> transform(index, elem.first, elem.second, elem.third, elem.fourth)
            }
        }

fun <A, B, C, D, E, R : Any> Iterable<Penta<A?, B?, C?, D?, E?>>.mapIndexedNotNull(transform: (Int, A?, B?, C?, D?, E?) -> R): List<R> =
        this.mapIndexedNotNull { index, elem ->
            when (null) {
                elem.first, elem.second, elem.third, elem.fourth, elem.fifth -> null
                else -> transform(index, elem.first, elem.second, elem.third, elem.fourth, elem.fifth)
            }
        }

fun <A, B, C, D, E, F, R : Any> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapIndexedNotNull(transform: (Int, A?, B?, C?, D?, E?, F?) -> R): List<R> =
        this.mapIndexedNotNull { index, elem ->
            when (null) {
                elem.first, elem.second, elem.third, elem.fourth, elem.fifth, elem.sixth -> null
                else -> transform(index, elem.first, elem.second, elem.third, elem.fourth, elem.fifth, elem.sixth)
            }
        }