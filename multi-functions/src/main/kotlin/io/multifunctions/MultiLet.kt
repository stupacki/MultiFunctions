package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result.
 */
inline infix fun <A, B, R> Pair<A?, B?>.let(block: (A?, B?) -> R): R? =
        block(first, second)

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result.
 */
inline infix fun <A, B, C, R> Triple<A?, B?, C?>.let(block: (A?, B?, C?) -> R): R? =
        block(first, second, third)

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result.
 */
inline infix fun <A, B, C, D, R> Quad<A?, B?, C?, D?>.let(block: (A?, B?, C?, D?) -> R): R? =
        block(first, second, third, fourth)

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result.
 */
inline infix fun <A, B, C, D, E, R> Penta<A?, B?, C?, D?, E?>.let(block: (A?, B?, C?, D?, E?) -> R): R? =
        block(first, second, third, fourth, fifth)

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result.
 */
inline infix fun <A, B, C, D, E, F, R> Hexa<A?, B?, C?, D?, E?, F?>.let(block: (A?, B?, C?, D?, E?, F?) -> R): R? =
        block(first, second, third, fourth, fifth, sixth)

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result.
 */
inline infix fun <A, B, C, D, E, F, G, R> Hepta<A?, B?, C?, D?, E?, F?, G?>.let(block: (A?, B?, C?, D?, E?, F?, G?) -> R): R? =
        block(first, second, third, fourth, fifth, sixth, seventh)
