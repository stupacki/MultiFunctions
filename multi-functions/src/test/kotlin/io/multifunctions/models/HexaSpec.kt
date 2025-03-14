package io.multifunctions.models

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

internal class HexaSpec : WordSpec() {

    init {

        "Hexa" should {

            "be initialized" {
                val testData = Hexa("one", "two", "three", "four", "five", "six")
                verifyHexa(testData, "one", "two", "three", "four", "five", "six")
            }

            "handle null values" {
                val testData = Hexa<String?, String?, String?, String?, String?, String?>(
                    null, null, null, null, null, null
                )
                verifyHexa(testData, null, null, null, null, null, null)
            }

            "handle toString" {
                val actual = Hexa("one", "two", "three", "four", "five", "six")
                val expected = "Hexa(first=one, second=two, third=three, fourth=four, fifth=five, sixth=six)"
                actual.toString() shouldBe expected
            }

            "handle copy()" {
                val actual = Hexa("one", "two", "three", "four", "five", "six")
                actual.copy() shouldBe actual
            }

            "handle toList" {
                val actual = Hexa("one", "two", "three", "four", "fife", "six")
                val expected = listOf("one", "two", "three", "four", "fife", "six")
                actual.toList() shouldBe expected
            }
        }
    }

    private fun <T> verifyHexa(
        hexa: Hexa<T, T, T, T, T, T>,
        first: T?, second: T?, third: T?, fourth: T?, fifth: T?, sixth: T?
    ) {
        hexa.first shouldBe first
        hexa.second shouldBe second
        hexa.third shouldBe third
        hexa.fourth shouldBe fourth
        hexa.fifth shouldBe fifth
        hexa.sixth shouldBe sixth
        Hexa(hexa.first, hexa.second, hexa.third, hexa.fourth, hexa.fifth, hexa.sixth) shouldBe hexa
    }
}