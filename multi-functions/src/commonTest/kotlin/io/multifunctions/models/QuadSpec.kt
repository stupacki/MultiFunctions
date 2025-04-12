package io.multifunctions.models

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

internal class QuadSpec : WordSpec() {

    init {

        "Quad" should {

            "be initialized with Strings" {
                val testData = Quad("one", "two", "three", "four")
                verifyQuad(testData, "one", "two", "three", "four")
            }

            "handle null values" {
                val testData = Quad<String?, String?, String?, String?>(null, null, null, null)
                verifyQuad(testData, null, null, null, null)
            }

            "handle toString" {
                val actual = Quad("one", "two", "three", "four")
                val expected = "Quad(first=one, second=two, third=three, fourth=four)"
                actual.toString() shouldBe expected
            }

            "handle copy()" {
                val actual = Quad("one", "two", "three", "four")
                actual.copy() shouldBe actual
            }

            "handle toList" {
                val actual = Quad("one", "two", "three", "four")
                val expected = listOf("one", "two", "three", "four")
                actual.toList() shouldBe expected
            }
        }
    }

    private fun <T> verifyQuad(
        quad: Quad<T, T, T, T>,
        first: T?, second: T?, third: T?, fourth: T?
    ) {
        quad.first shouldBe first
        quad.second shouldBe second
        quad.third shouldBe third
        quad.fourth shouldBe fourth
        Quad(quad.first, quad.second, quad.third, quad.fourth) shouldBe quad
    }
}
