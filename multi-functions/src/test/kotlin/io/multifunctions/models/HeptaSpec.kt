package io.multifunctions.models

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

internal class HeptaSpec : WordSpec() {

    init {

        "Hepta" should {

            "be initialized" {
                val testData = Hepta("one", "two", "three", "four", "five", "six", "seven")
                verifyHepta(testData, "one", "two", "three", "four", "five", "six", "seven")
            }

            "handle null values" {
                val testData = Hepta<String?, String?, String?, String?, String?, String?, String?>(
                    null, null, null, null, null, null, null
                )
                verifyHepta(testData, null, null, null, null, null, null, null)
            }

            "handle toString" {
                val actual = Hepta("one", "two", "three", "four", "five", "six", "seven")
                val expected = "Hepta(first=one, second=two, third=three, fourth=four, fifth=five, sixth=six, seventh=seven)"
                actual.toString() shouldBe expected
            }

            "handle copy()" {
                val actual = Hepta("one", "two", "three", "four", "five", "six", "seven")
                actual.copy() shouldBe actual
            }

            "handle toList" {
                val actual = Hepta("one", "two", "three", "four", "fife", "six", "seven")
                val expected = listOf("one", "two", "three", "four", "fife", "six", "seven")
                actual.toList() shouldBe expected
            }
        }
    }

    private fun <T> verifyHepta(
        hepta: Hepta<T, T, T, T, T, T, T>,
        first: T?, second: T?, third: T?, fourth: T?, fifth: T?, sixth: T?, seventh: T?
    ) {
        hepta.first shouldBe first
        hepta.second shouldBe second
        hepta.third shouldBe third
        hepta.fourth shouldBe fourth
        hepta.fifth shouldBe fifth
        hepta.sixth shouldBe sixth
        hepta.seventh shouldBe seventh
        Hepta(hepta.first, hepta.second, hepta.third, hepta.fourth, hepta.fifth, hepta.sixth, hepta.seventh) shouldBe hepta
    }
}
