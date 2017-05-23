package io.multifunctions.models

import java.io.Serializable

data class Penta<out A, out B, out C, out D, out E>(val first: A,
                                                    val second: B,
                                                    val third: C,
                                                    val fourth: D,
                                                    val fifth: E): Serializable {

    override fun toString(): String = "Penta(first=$first, second=$second, third=$third, fourth=$fourth, fifth=$fifth)"
}

fun <T> Penta<T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth)
