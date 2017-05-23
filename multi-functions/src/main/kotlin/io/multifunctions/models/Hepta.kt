package io.multifunctions.models

import java.io.Serializable

data class Hepta<out A, out B, out C, out D, out E, out F, out G>(val first: A,
                                                                  val second: B,
                                                                  val third: C,
                                                                  val fourth: D,
                                                                  val fifth: E,
                                                                  val sixth: F,
                                                                  val seventh: G): Serializable {

    override fun toString(): String = "Hepta(first=$first, second=$second, third=$third, fourth=$fourth, fifth=$fifth, sixth=$sixth, seventh=$seventh)"
}

fun <T> Hepta<T, T, T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth, sixth, seventh)