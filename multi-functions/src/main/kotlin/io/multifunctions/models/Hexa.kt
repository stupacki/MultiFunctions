package io.multifunctions.models

import java.io.Serializable

data class Hexa<out A, out B, out C, out D, out E, out F>(val first: A,
                                                          val second: B,
                                                          val third: C,
                                                          val fourth: D,
                                                          val fifth: E,
                                                          val sixth: F): Serializable {

    override fun toString(): String = "Hexa(first=$first, second=$second, third=$third, fourth=$fourth, fifth=$fifth, sixth=$sixth)"
}

fun <T> Hexa<T, T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth, sixth)