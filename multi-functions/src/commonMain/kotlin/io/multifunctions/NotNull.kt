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
inline fun <A, B, R> notNull(first: A?, second: B?, block: (A, B) -> R): R? =
    if (first == null || second == null) null else block(first, second)

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
inline fun <A, B, C, R> notNull(
    first: A?,
    second: B?,
    third: C?,
    block: (A, B, C) -> R
): R? =
    if (first == null || second == null || third == null) null else block(first, second, third)

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
inline fun <A, B, C, D, R> notNull(
    first: A?,
    second: B?,
    third: C?,
    fourth: D?,
    block: (A, B, C, D) -> R
): R? =
    if (first == null || second == null || third == null || fourth == null) null
    else block(first, second, third, fourth)

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
inline fun <A, B, C, D, E, R> notNull(
    first: A?,
    second: B?,
    third: C?,
    fourth: D?,
    fifth: E?,
    block: (A, B, C, D, E) -> R
): R? =
    if (first == null || second == null || third == null || fourth == null || fifth == null) null
    else block(first, second, third, fourth, fifth)

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
inline fun <A, B, C, D, E, F, R> notNull(
    first: A?,
    second: B?,
    third: C?,
    fourth: D?,
    fifth: E?,
    sixth: F?,
    block: (A, B, C, D, E, F) -> R
): R? =
    if (first == null || second == null || third == null || fourth == null || fifth == null || sixth == null) null
    else block(first, second, third, fourth, fifth, sixth)

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
inline fun <A, B, C, D, E, F, G, R> notNull(
    first: A?,
    second: B?,
    third: C?,
    fourth: D?,
    fifth: E?,
    sixth: F?,
    seventh: G?,
    block: (A, B, C, D, E, F, G) -> R
): R? =
    if (
        first == null ||
        second == null ||
        third == null ||
        fourth == null ||
        fifth == null ||
        sixth == null ||
        seventh == null
    ) {
        null
    } else {
        block(first, second, third, fourth, fifth, sixth, seventh)
    }
