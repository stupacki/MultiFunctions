package io.multifunctions.models

import java.io.Serializable

/**
 * Represents a generic hepta of seven values.
 *
 * There is no meaning attached to values in this class, it can be used for any purpose.
 * Hepta exhibits value semantics, i.e. two heptas are equal if all components are equal.
 *
 * @param A type of the first value.
 * @param B type of the second value.
 * @param C type of the second value.
 * @param D type of the second value.
 * @param E type of the second value.
 * @param F type of the second value.
 * @param G type of the second value.
 * @property first First value.
 * @property second Second value.
 * @property third Third value.
 * @property fourth Fourth value.
 * @property fifth Fifth value.
 * @property sixth Sixth value.
 * @property seventh Seventh value.
 * @constructor Creates a new instance of Hepta.
 */
public data class Hepta<out A, out B, out C, out D, out E, out F, out G>(val first: A,
                                                                         val second: B,
                                                                         val third: C,
                                                                         val fourth: D,
                                                                         val fifth: E,
                                                                         val sixth: F,
                                                                         val seventh: G) : Serializable {

    /**
     * Returns string representation of the [Hepta] including its [first], [second], [third], [fourth], [fifth], [sixth] and [seventh] values.
     */
    override fun toString(): String = "Hepta(first=$first, second=$second, third=$third, fourth=$fourth, fifth=$fifth, sixth=$sixth, seventh=$seventh)"
}

/**
 * Converts this hepta into a list.
 */
fun <T> Hepta<T, T, T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth, sixth, seventh)
