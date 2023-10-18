package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Calls the specified function [block] with [first] and [second] value as its arguments and returns its result when no element is [null].
 */
fun <A, B, R> notNull(first: A?, second: B?, block: (A, B) -> R) =
        when (null) {
            first, second -> null
            else -> block(first as A, second as B)
        }

/**
 * Calls the specified function [block] with [first], [second] and [third] value as its arguments and returns its result when no element is [null].
 */
fun <A, B, C, R> notNull(first: A?, second: B?, third: C?, block: (A, B, C) -> R) =
        when (null) {
            first, second, third -> null
            else -> block(first as A, second as B, third as C)
        }

/**
 * Calls the specified function [block] with [first], [second], [third] and [fourth] value as its arguments and returns its result when no element is [null].
 */
fun <A, B, C, D, R> notNull(first: A?, second: B?, third: C?, fourth: D?, block: (A, B, C, D) -> R) =
        when (null) {
            first, second, third, fourth -> null
            else -> block(first as A, second as B, third as C, fourth as D)
        }

/**
 * Calls the specified function [block] with [first], [second], [third], [fourth] and [fifth] value as its arguments and returns its result when no element is [null].
 */
fun <A, B, C, D, E, R> notNull(first: A?, second: B?, third: C?, fourth: D?, fifth: E?, block: (A, B, C, D, E) -> R) =
        when (null) {
            first, second, third, fourth, fifth -> null
            else -> block(first as A, second as B, third as C, fourth as D, fifth as E)
        }

/**
 * Calls the specified function [block] with [first], [second], [third], [fourth], [fifth] and [sixth] value as its arguments and returns its result when no element is [null].
 */
fun <A, B, C, D, E, F, R> notNull(first: A?, second: B?, third: C?, fourth: D?, fifth: E?, sixth: F?, block: (A, B, C, D, E, F) -> R) =
        when (null) {
            first, second, third, fourth, fifth, sixth -> null
            else -> block(first as A, second as B, third as C, fourth as D, fifth as E, sixth as F)
        }

/**
 * Calls the specified function [block] with [first], [second], [third], [fourth], [fifth], [sixth] and [seventh] value as its arguments and returns its result when no element is [null].
 */
fun <A, B, C, D, E, F, G, R> notNull(first: A?, second: B?, third: C?, fourth: D?, fifth: E?, sixth: F?, seventh: G?, block: (A, B, C, D, E, F, G) -> R) =
        when (null) {
            first, second, third, fourth, fifth, sixth, seventh -> null
            else -> block(first as A, second as B, third as C, fourth as D, fifth as E, sixth as F, seventh as G)
        }
