package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Performs the given [action] on each [Pair] element.
 */
public inline fun <A, B> Iterable<Pair<A, B>>.forEach(
    action: (A, B) -> Unit,
) =
    forEach { (first, second) ->
        action(first, second)
    }

/**
 * Performs the given [action] on each [Triple] element.
 */
public inline fun <A, B, C> Iterable<Triple<A, B, C>>.forEach(
    action: (A, B, C) -> Unit,
) =
    forEach { (first, second, third) ->
        action(first, second, third)
    }

/**
 * Performs the given [action] on each [Quad] element.
 */
public inline fun <A, B, C, D> Iterable<Quad<A, B, C, D>>.forEach(
    action: (A, B, C, D) -> Unit,
) =
    forEach { (first, second, third, fourth) ->
        action(first, second, third, fourth)
    }

/**
 * Performs the given [action] on each [Penta] element.
 */
public inline fun <A, B, C, D, E> Iterable<Penta<A, B, C, D, E>>.forEach(
    action: (A, B, C, D, E) -> Unit,
) =
    forEach { (first, second, third, fourth, fifth) ->
        action(first, second, third, fourth, fifth)
    }

/**
 * Performs the given [action] on each [Hexa] element.
 */
public inline fun <A, B, C, D, E, F> Iterable<Hexa<A, B, C, D, E, F>>.forEach(
    action: (A, B, C, D, E, F) -> Unit,
) =
    forEach { (first, second, third, fourth, fifth, sixth) ->
        action(first, second, third, fourth, fifth, sixth)
    }

/**
 * Performs the given [action] on each [Hepta] element.
 */
public inline fun <A, B, C, D, E, F, G> Iterable<Hepta<A, B, C, D, E, F, G>>.forEach(
    action: (A, B, C, D, E, F, G) -> Unit,
) =
    forEach { (first, second, third, fourth, fifth, sixth, seventh) ->
        action(first, second, third, fourth, fifth, sixth, seventh)
    }
