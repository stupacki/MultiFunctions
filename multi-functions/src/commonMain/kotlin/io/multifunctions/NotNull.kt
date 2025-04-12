package io.multifunctions

/**
 * Calls the specified function [block] with [first] and [second] value as its arguments and returns its result when no element is [null].
 *
 * @param A the type of the first value
 * @param B the type of the second value
 * @param R the type of the result
 * @param first the first value
 * @param second the second value
 * @param block the function to apply to the values
 * @return the result of the function or null if any value is null
 */
inline fun <reified A, reified B, R> notNull(first: A?, second: B?, block: (A, B) -> R): R? = when (null) {
    first, second -> null
    else -> block(first as A, second as B)
}

/**
 * Calls the specified function [block] with [first], [second] and [third] value as its arguments and returns its result when no element is [null].
 *
 * @param A the type of the first value
 * @param B the type of the second value
 * @param C the type of the third value
 * @param R the type of the result
 * @param first the first value
 * @param second the second value
 * @param third the third value
 * @param block the function to apply to the values
 * @return the result of the function or null if any value is null
 */
inline fun <reified A, reified B, reified C, R> notNull(
    first: A?,
    second: B?,
    third: C?,
    block: (A, B, C) -> R
): R? = when (null) {
    first, second, third -> null
    else -> block(first as A, second as B, third as C)
}

/**
 * Calls the specified function [block] with [first], [second], [third] and [fourth] value as its arguments and returns its result when no element is [null].
 *
 * @param A the type of the first value
 * @param B the type of the second value
 * @param C the type of the third value
 * @param D the type of the fourth value
 * @param R the type of the result
 * @param first the first value
 * @param second the second value
 * @param third the third value
 * @param fourth the fourth value
 * @param block the function to apply to the values
 * @return the result of the function or null if any value is null
 */
inline fun <reified A, reified B, reified C, reified D, R> notNull(
    first: A?,
    second: B?,
    third: C?,
    fourth: D?,
    block: (A, B, C, D) -> R
): R? = when (null) {
    first, second, third, fourth -> null
    else -> block(first as A, second as B, third as C, fourth as D)
}

/**
 * Calls the specified function [block] with [first], [second], [third], [fourth] and [fifth] value as its arguments and returns its result when no element is [null].
 *
 * @param A the type of the first value
 * @param B the type of the second value
 * @param C the type of the third value
 * @param D the type of the fourth value
 * @param E the type of the fifth value
 * @param R the type of the result
 * @param first the first value
 * @param second the second value
 * @param third the third value
 * @param fourth the fourth value
 * @param fifth the fifth value
 * @param block the function to apply to the values
 * @return the result of the function or null if any value is null
 */
inline fun <reified A, reified B, reified C, reified D, reified E, R> notNull(
    first: A?,
    second: B?,
    third: C?,
    fourth: D?,
    fifth: E?,
    block: (A, B, C, D, E) -> R
): R? = when (null) {
    first, second, third, fourth, fifth -> null
    else -> block(first as A, second as B, third as C, fourth as D, fifth as E)
}

/**
 * Calls the specified function [block] with [first], [second], [third], [fourth], [fifth] and [sixth] value as its arguments and returns its result when no element is [null].
 *
 * @param A the type of the first value
 * @param B the type of the second value
 * @param C the type of the third value
 * @param D the type of the fourth value
 * @param E the type of the fifth value
 * @param F the type of the sixth value
 * @param R the type of the result
 * @param first the first value
 * @param second the second value
 * @param third the third value
 * @param fourth the fourth value
 * @param fifth the fifth value
 * @param sixth the sixth value
 * @param block the function to apply to the values
 * @return the result of the function or null if any value is null
 */
inline fun <reified A, reified B, reified C, reified D, reified E, reified F, R> notNull(
    first: A?,
    second: B?,
    third: C?,
    fourth: D?,
    fifth: E?,
    sixth: F?,
    block: (A, B, C, D, E, F) -> R
): R? = when (null) {
    first, second, third, fourth, fifth, sixth -> null
    else -> block(first as A, second as B, third as C, fourth as D, fifth as E, sixth as F)
}

/**
 * Calls the specified function [block] with [first], [second], [third], [fourth], [fifth], [sixth] and [seventh] value as its arguments and returns its result when no element is [null].
 *
 * @param A the type of the first value
 * @param B the type of the second value
 * @param C the type of the third value
 * @param D the type of the fourth value
 * @param E the type of the fifth value
 * @param F the type of the sixth value
 * @param G the type of the seventh value
 * @param R the type of the result
 * @param first the first value
 * @param second the second value
 * @param third the third value
 * @param fourth the fourth value
 * @param fifth the fifth value
 * @param sixth the sixth value
 * @param seventh the seventh value
 * @param block the function to apply to the values
 * @return the result of the function or null if any value is null
 */
inline fun <reified A, reified B, reified C, reified D, reified E, reified F, reified G, R> notNull(
    first: A?,
    second: B?,
    third: C?,
    fourth: D?,
    fifth: E?,
    sixth: F?,
    seventh: G?,
    block: (A, B, C, D, E, F, G) -> R
): R? = when (null) {
    first, second, third, fourth, fifth, sixth, seventh -> null
    else -> block(first as A, second as B, third as C, fourth as D, fifth as E, sixth as F, seventh as G)
}