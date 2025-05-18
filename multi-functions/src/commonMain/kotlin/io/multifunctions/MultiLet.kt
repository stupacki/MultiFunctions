package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result.
 *
 * @param A the type of the first value in the pair
 * @param B the type of the second value in the pair
 * @param R the type of the result
 * @param block the function to call with the pair values
 * @return the result of the function call
 */
inline fun <A, B, R> Pair<A?, B?>.let(
    block: (A?, B?) -> R
): R? = block(first, second)

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result.
 *
 * @param A the type of the first value in the triple
 * @param B the type of the second value in the triple
 * @param C the type of the third value in the triple
 * @param R the type of the result
 * @param block the function to call with the triple values
 * @return the result of the function call
 */
inline fun <A, B, C, R> Triple<A?, B?, C?>.let(
    block: (A?, B?, C?) -> R
): R? = block(first, second, third)

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result.
 *
 * @param A the type of the first value in the quad
 * @param B the type of the second value in the quad
 * @param C the type of the third value in the quad
 * @param D the type of the fourth value in the quad
 * @param R the type of the result
 * @param block the function to call with the quad values
 * @return the result of the function call
 */
inline fun <A, B, C, D, R> Quad<A?, B?, C?, D?>.let(
    block: (A?, B?, C?, D?) -> R
): R? = block(first, second, third, fourth)

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result.
 *
 * @param A the type of the first value in the penta
 * @param B the type of the second value in the penta
 * @param C the type of the third value in the penta
 * @param D the type of the fourth value in the penta
 * @param E the type of the fifth value in the penta
 * @param R the type of the result
 * @param block the function to call with the penta values
 * @return the result of the function call
 */
inline fun <A, B, C, D, E, R> Penta<A?, B?, C?, D?, E?>.let(
    block: (A?, B?, C?, D?, E?) -> R
): R? = block(first, second, third, fourth, fifth)

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result.
 *
 * @param A the type of the first value in the hexa
 * @param B the type of the second value in the hexa
 * @param C the type of the third value in the hexa
 * @param D the type of the fourth value in the hexa
 * @param E the type of the fifth value in the hexa
 * @param F the type of the sixth value in the hexa
 * @param R the type of the result
 * @param block the function to call with the hexa values
 * @return the result of the function call
 */
inline fun <A, B, C, D, E, F, R> Hexa<A?, B?, C?, D?, E?, F?>.let(
    block: (A?, B?, C?, D?, E?, F?) -> R
): R? = block(first, second, third, fourth, fifth, sixth)

/**
 * Calls the specified function [block] with `this` value as its arguments and returns its result.
 *
 * @param A the type of the first value in the hepta
 * @param B the type of the second value in the hepta
 * @param C the type of the third value in the hepta
 * @param D the type of the fourth value in the hepta
 * @param E the type of the fifth value in the hepta
 * @param F the type of the sixth value in the hepta
 * @param G the type of the seventh value in the hepta
 * @param R the type of the result
 * @param block the function to call with the hepta values
 * @return the result of the function call
 */
inline fun <A, B, C, D, E, F, G, R> Hepta<A?, B?, C?, D?, E?, F?, G?>.let(
    block: (A?, B?, C?, D?, E?, F?, G?) -> R
): R? = block(first, second, third, fourth, fifth, sixth, seventh)
