package io.multifunctions.models

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

internal class HexaSpec : WordSpec() {

    init {

        "Hexa" should {

            "be initialized" {

                val testData = Hexa("one", "two", "three", "four", "five", "six")

                testData.let { hexa ->
                    hexa.first shouldBe "one"
                    hexa.second shouldBe "two"
                    hexa.third shouldBe "three"
                    hexa.fourth shouldBe "four"
                    hexa.fifth shouldBe "five"
                    hexa.sixth shouldBe "six"

                    Hexa(hexa.first, hexa.second, hexa.third, hexa.fourth, hexa.fifth, hexa.sixth)
                } shouldBe testData
            }

            "handle null values" {

                val testData = Hexa<String?, String?, String?, String?, String?, String?>(
                    null,
                    null,
                    null,
                    null,
                    null,
                    null
                )

                testData.let { hexa ->
                    hexa.first shouldBe null
                    hexa.second shouldBe null
                    hexa.third shouldBe null
                    hexa.fourth shouldBe null
                    hexa.fifth shouldBe null
                    hexa.sixth shouldBe null

                    Hexa(hexa.first, hexa.second, hexa.third, hexa.fourth, hexa.fifth, hexa.sixth)
                } shouldBe testData
            }

            "handle toString" {

                val actual = Hexa("one", "two", "three", "four", "five", "six")
                val expected =
                    "Hexa(first=one, second=two, third=three, fourth=four, fifth=five, sixth=six)"

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
}
