package io.multifunctions.models

import io.kotlintest.specs.WordSpec

class HeptaSpec : WordSpec() {

    init {

        "Hepta" should {

            "be initialized" {

                Hepta("one", "two", "three", "four", "five", "six", "seven").let { hepta ->
                    hepta.first shouldBe "one"
                    hepta.second shouldBe "two"
                    hepta.third shouldBe "three"
                    hepta.fourth shouldBe "four"
                    hepta.fifth shouldBe "five"
                    hepta.sixth shouldBe "six"
                    hepta.seventh shouldBe "seven"
                }

            }

            "handle null values" {

                Hepta(null, null, null, null, null, null, null).let { hepta ->
                    hepta.first shouldBe null
                    hepta.second shouldBe null
                    hepta.third shouldBe null
                    hepta.fourth shouldBe null
                    hepta.fifth shouldBe null
                    hepta.sixth shouldBe null
                }

            }

        }

    }

}