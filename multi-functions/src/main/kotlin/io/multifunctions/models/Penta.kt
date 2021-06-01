package io.multifunctions.models

import java.io.Serializable

/**
 * Represents a generic penta of fife values.
 *
 * There is no meaning attached to values in this class, it can be used for any purpose.
 * Penta exhibits value semantics, i.e. two pentas are equal if all components are equal.
 *
 * @param A type of the first value.
 * @param B type of the second value.
 * @param C type of the second value.
 * @param D type of the second value.
 * @param E type of the second value.
 * @property first First value.
 * @property second Second value.
 * @property third Third value.
 * @property fourth Fourth value.
 * @property fifth Fifth value.
 * @constructor Creates a new instance of Penta.
 */
public data class Penta<out A, out B, out C, out D, out E>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E
) : Serializable {

    /**
     * Returns string representation of the [Penta] including its [first], [second], [third], [fourth] and [fifth] values.
     */
    override fun toString(): String =
        "Penta(first=$first, second=$second, third=$third, fourth=$fourth, fifth=$fifth)"
}

/**
 * Converts this penta into a list.
 */
public fun <T> Penta<T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth)
