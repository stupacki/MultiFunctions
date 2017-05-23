package io.multifunctions.models

import java.io.Serializable

data class Quad<out A, out B, out C, out D>(val first: A,
                                            val second: B,
                                            val third: C,
                                            val fourth: D): Serializable {

    override fun toString(): String = "Quad(first=$first, second=$second, third=$third, fourth=$fourth)"
}

fun <T> Quad<T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth)
