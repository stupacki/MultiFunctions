package io.multifunctions.models

import io.kotlintest.specs.WordSpec

class PentaSpec : WordSpec() {

    init {

        "Penta" should {

            "be initialized" {

                Penta("one", "two", "three", "four", "five").let { penta ->
                    penta.first shouldBe "one"
                    penta.second shouldBe "two"
                    penta.third shouldBe "three"
                    penta.fourth shouldBe "four"
                    penta.fifth shouldBe "five"

                    Penta(penta.first, penta.second, penta.third, penta.fourth, penta.fifth)
                } shouldBe Penta("one", "two", "three", "four", "five")

            }

            "handle null values" {

                Penta(null, null, null, null, null).let { penta ->
                    penta.first shouldBe null
                    penta.second shouldBe null
                    penta.third shouldBe null
                    penta.fourth shouldBe null
                    penta.fifth shouldBe null

                    Penta(penta.first, penta.second, penta.third, penta.fourth, penta.fifth)
                } shouldBe Penta(null, null, null, null, null)

            }

            "handle toString" {

                Penta("one", "two", "three", "four", "five").toString() shouldBe "Penta(first=one, second=two, third=three, fourth=four, fifth=five)"

            }

            "handle copy()" {

                val penta = Penta("one", "two", "three", "four", "five")

                penta.copy() shouldBe Penta("one", "two", "three", "four", "five")

            }

        }

    }

}