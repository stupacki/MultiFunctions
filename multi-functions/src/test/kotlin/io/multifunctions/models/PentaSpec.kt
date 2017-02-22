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
                }

            }

            "handle null values" {

                Penta(null, null, null, null, null).let { penta ->
                    penta.first shouldBe null
                    penta.second shouldBe null
                    penta.third shouldBe null
                    penta.fourth shouldBe null
                    penta.fifth shouldBe null
                }

            }

        }

    }

}