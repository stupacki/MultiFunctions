package io.multifunctions.models

data class Penta<out A, out B, out C, out D, out E>(val first: A,
                                                    val second: B,
                                                    val third: C,
                                                    val fourth: D,
                                                    val fifth: E)
