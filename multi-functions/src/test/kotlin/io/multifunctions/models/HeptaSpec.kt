package io.multifunctions.models

import io.kotlintest.specs.WordSpec
import io.multifunctions.MultiFunctions

class HeptaSpec : WordSpec(), MultiFunctions {

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

        }

    }

}