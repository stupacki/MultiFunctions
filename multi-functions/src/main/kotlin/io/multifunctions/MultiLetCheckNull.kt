@file:Suppress("UNCHECKED_CAST")

package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result when no element is [null].
 */
public inline fun <A, B, R> Pair<A, B>.letCheckNull(
    block: (A, B) -> R,
): R? =
    when (null) {
        first, second -> null
        else -> block(first, second)
    }

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result when no element is [null].
 */
public inline fun <A, B, C, R> Triple<A, B, C>.letCheckNull(
    block: (A, B, C) -> R,
): R? =
    when (null) {
        first, second, third -> null
        else -> block(first, second, third)
    }

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result when no element is [null].
 */
public inline fun <A, B, C, D, R> Quad<A, B, C, D>.letCheckNull(
    block: (A, B, C, D) -> R,
): R? =
    when (null) {
        first, second, third, fourth -> null
        else -> block(first, second, third, fourth)
    }

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result when no element is [null].
 */
public inline fun <A, B, C, D, E, R> Penta<A, B, C, D, E>.letCheckNull(
    block: (A, B, C, D, E) -> R,
): R? =
    when (null) {
        first, second, third, fourth, fifth -> null
        else -> block(first, second, third, fourth, fifth)
    }

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result when no element is [null].
 */
public inline fun <A, B, C, D, E, F, R> Hexa<A, B, C, D, E, F>.letCheckNull(
    block: (A, B, C, D, E, F) -> R,
): R? =
    when (null) {
        first, second, third, fourth, fifth, sixth -> null
        else -> block(first, second, third, fourth, fifth, sixth)
    }

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result when no element is [null].
 */
public inline fun <A, B, C, D, E, F, G, R> Hepta<A, B, C, D, E, F, G>.letCheckNull(
    block: (A, B, C, D, E, F, G) -> R,
): R? =
    when (null) {
        first, second, third, fourth, fifth, sixth, seventh -> null
        else -> block(first, second, third, fourth, fifth, sixth, seventh)
    }
