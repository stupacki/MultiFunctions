package io.multifunctions.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec

class HeptaSpec : WordSpec() {

    init {

        "Hepta" should {

            "be initialized" {
                val testData = Hepta("one", "two", "three", "four", "five", "six", "seven")

                testData.let { hepta ->
                    hepta.first shouldBe "one"
                    hepta.second shouldBe "two"
                    hepta.third shouldBe "three"
                    hepta.fourth shouldBe "four"
                    hepta.fifth shouldBe "five"
                    hepta.sixth shouldBe "six"
                    hepta.seventh shouldBe "seven"

                    Hepta(hepta.first, hepta.second, hepta.third, hepta.fourth, hepta.fifth, hepta.sixth, hepta.seventh)
                } shouldBe testData
            }

            "handle null values" {
                val testData = Hepta<String?, String?, String?, String?, String?, String?, String?>(null, null, null, null, null, null, null)

                testData.let { hepta ->
                    hepta.first shouldBe null
                    hepta.second shouldBe null
                    hepta.third shouldBe null
                    hepta.fourth shouldBe null
                    hepta.fifth shouldBe null
                    hepta.sixth shouldBe null

                    Hepta(hepta.first, hepta.second, hepta.third, hepta.fourth, hepta.fifth, hepta.sixth, hepta.seventh)
                } shouldBe testData
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
}