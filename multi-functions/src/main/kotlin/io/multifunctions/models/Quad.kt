package io.multifunctions.models

import java.io.Serializable

/**
 * Represents a generic quad of four values.
 *
 * There is no meaning attached to values in this class, it can be used for any purpose.
 * Quad exhibits value semantics, i.e. two quads are equal if all components are equal.
 *
 * @param A type of the first value.
 * @param B type of the second value.
 * @param C type of the second value.
 * @param D type of the second value.
 * @property first First value.
 * @property second Second value.
 * @property third Third value.
 * @property fourth Fourth value.
 * @constructor Creates a new instance of Quad.
 */
public data class Quad<out A, out B, out C, out D>(val first: A,
                                                   val second: B,
                                                   val third: C,
                                                   val fourth: D) : Serializable {

    /**
     * Returns string representation of the [Quad] including its [first], [second], [third] and [fourth] values.
     */
    override fun toString(): String = "Quad(first=$first, second=$second, third=$third, fourth=$fourth)"
}

/**
 * Converts this penta into a list.
 */
public fun <T> Quad<T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth)
