@file:kotlin.jvm.JvmMultifileClass

package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Returns a single list of all elements yielded from results of [transform] function being invoked on each [Pair] element of original collection.
 */
public inline infix fun <A, B, R> Iterable<Pair<A?, B?>>.flatMap(transform: (A?, B?) -> Iterable<R>): List<R?> =
    flatMap { (first, second) ->
        transform(first, second)
    }

/**
 * Returns a single list of all elements yielded from results of [transform] function being invoked on each [Triple] element of original collection.
 */
public inline infix fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.flatMap(transform: (A?, B?, C?) -> Iterable<R>): List<R?> =
    flatMap { (first, second, third) ->
        transform(first, second, third)
    }

/**
 * Returns a single list of all elements yielded from results of [transform] function being invoked on each [Quad] element of original collection.
 */
public inline infix fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.flatMap(transform: (A?, B?, C?, D?) -> Iterable<R>): List<R?> =
    flatMap { (first, second, third, fourth) ->
        transform(first, second, third, fourth)
    }

/**
 * Returns a single list of all elements yielded from results of [transform] function being invoked on each [Penta] element of original collection.
 */
public inline infix fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.flatMap(transform: (A?, B?, C?, D?, E?) -> Iterable<R>): List<R?> =
    flatMap { (first, second, third, fourth, fifth) ->
        transform(first, second, third, fourth, fifth)
    }

/**
 * Returns a single list of all elements yielded from results of [transform] function being invoked on each [Hexa] element of original collection.
 */
public inline infix fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.flatMap(
    transform: (A?, B?, C?, D?, E?, F?) -> Iterable<R>
): List<R?> =
    flatMap { (first, second, third, fourth, fifth, sixth) ->
        transform(first, second, third, fourth, fifth, sixth)
    }

/**
 * Returns a single list of all elements yielded from results of [transform] function being invoked on each [Hepta] element of original collection.
 */
public inline infix fun <A, B, C, D, E, F, G, R> Iterable<Hepta<A?, B?, C?, D?, E?, F?, G?>>.flatMap(
    transform: (A?, B?, C?, D?, E?, F?, G?) -> Iterable<R>
): List<R?> =
    flatMap { (first, second, third, fourth, fifth, sixth, seventh) ->
        transform(first, second, third, fourth, fifth, sixth, seventh)
    }
