package io.multifunctions.models

/**
 * Represents a generic hexa of six values.
 *
 * There is no meaning attached to values in this class, it can be used for any purpose.
 * Hexa exhibits value semantics, i.e. two hexas are equal if all components are equal.
 *
 * @param A type of the first value.
 * @param B type of the second value.
 * @param C type of the second value.
 * @param D type of the second value.
 * @param E type of the second value.
 * @param F type of the second value.
 * @property first First value.
 * @property second Second value.
 * @property third Third value.
 * @property fourth Fourth value.
 * @property fifth Fifth value.
 * @property sixth Sixth value.
 * @constructor Creates a new instance of Hexa.
 */
public data class Hexa<out A, out B, out C, out D, out E, out F>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F
) {

    /**
     * Returns string representation of the [Hexa] including its [first], [second], [third], [fourth], [fifth] and [sixth] values.
     */
    override fun toString(): String =
        "Hexa(first=$first, second=$second, third=$third, fourth=$fourth, fifth=$fifth, sixth=$sixth)"
}

/**
 * Converts this hexa into a list.
 */
public fun <T> Hexa<T, T, T, T, T, T>.toList(): List<T> =
    listOf(first, second, third, fourth, fifth, sixth)
