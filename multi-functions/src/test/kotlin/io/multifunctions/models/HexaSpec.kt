package io.multifunctions.models

import io.kotlintest.specs.WordSpec
import io.multifunctions.MultiFunctions

class HexaSpec : WordSpec(), MultiFunctions {

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

        }

    }

}