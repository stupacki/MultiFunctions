package io.multifunctions.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec

class PentaSpec : WordSpec() {

    init {

        "Penta" should {

            "be initialized" {
                val testData = Penta("one", "two", "three", "four", "five")

                testData.let { penta ->
                    penta.first shouldBe "one"
                    penta.second shouldBe "two"
                    penta.third shouldBe "three"
                    penta.fourth shouldBe "four"
                    penta.fifth shouldBe "five"

                    Penta(penta.first, penta.second, penta.third, penta.fourth, penta.fifth)
                } shouldBe testData
            }

            "handle null values" {
                val testData = Penta<String?, String?, String?, String?, String?>(null, null, null, null, null)

                testData.let { penta ->
                    penta.first shouldBe null
                    penta.second shouldBe null
                    penta.third shouldBe null
                    penta.fourth shouldBe null
                    penta.fifth shouldBe null

                    Penta(penta.first, penta.second, penta.third, penta.fourth, penta.fifth)
                } shouldBe testData
            }

            "handle toString" {
                val actual = Penta("one", "two", "three", "four", "five")
                val expected = "Penta(first=one, second=two, third=three, fourth=four, fifth=five)"

                actual.toString() shouldBe expected
            }

            "handle copy()" {
                val actual = Penta("one", "two", "three", "four", "five")
                val expected = Penta("one", "two", "three", "four", "five")

                actual.copy() shouldBe expected
            }

            "handle toList" {
                val actual = Penta("one", "two", "three", "four", "fife")
                val expected = listOf("one", "two", "three", "four", "fife")

                actual.toList() shouldBe expected
            }
        }
    }
}