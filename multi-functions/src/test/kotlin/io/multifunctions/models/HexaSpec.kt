package io.multifunctions.models

import io.kotlintest.specs.WordSpec

class HexaSpec : WordSpec() {

    init {

        "Hexa" should {

            "be initialized" {

                Hexa("one", "two", "three", "four", "five", "six").let { hexa ->
                    hexa.first shouldBe "one"
                    hexa.second shouldBe "two"
                    hexa.third shouldBe "three"
                    hexa.fourth shouldBe "four"
                    hexa.fifth shouldBe "five"
                    hexa.sixth shouldBe "six"
                }

            }

            "handle null values" {

                Hexa(null, null, null, null, null, null).let { hexa ->
                    hexa.first shouldBe null
                    hexa.second shouldBe null
                    hexa.third shouldBe null
                    hexa.fourth shouldBe null
                    hexa.fifth shouldBe null
                    hexa.sixth shouldBe null
                }

            }

        }

    }

}