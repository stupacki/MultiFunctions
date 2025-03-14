package io.multifunctions.models

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

internal class PentaSpec : WordSpec() {

    init {

        "Penta" should {

            "be initialized" {
                val testData = Penta("one", "two", "three", "four", "five")
                verifyPenta(testData, "one", "two", "three", "four", "five")
            }

            "handle null values" {
                val testData = Penta<String?, String?, String?, String?, String?>(
                    null, null, null, null, null
                )
                verifyPenta(testData, null, null, null, null, null)
            }

            "handle toString" {
                val actual = Penta("one", "two", "three", "four", "five")
                val expected = "Penta(first=one, second=two, third=three, fourth=four, fifth=five)"
                actual.toString() shouldBe expected
            }

            "handle copy()" {
                val actual = Penta("one", "two", "three", "four", "five")
                actual.copy() shouldBe actual
            }

            "handle toList" {
                val actual = Penta("one", "two", "three", "four", "fife")
                val expected = listOf("one", "two", "three", "four", "fife")
                actual.toList() shouldBe expected
            }
        }
    }

    private fun <T> verifyPenta(
        penta: Penta<T, T, T, T, T>,
        first: T?, second: T?, third: T?, fourth: T?, fifth: T?
    ) {
        penta.first shouldBe first
        penta.second shouldBe second
        penta.third shouldBe third
        penta.fourth shouldBe fourth
        penta.fifth shouldBe fifth
        Penta(penta.first, penta.second, penta.third, penta.fourth, penta.fifth) shouldBe penta
    }
}
