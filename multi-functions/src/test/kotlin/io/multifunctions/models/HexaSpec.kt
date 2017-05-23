package io.multifunctions.models

import io.kotlintest.matchers.shouldBe
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

                    Hexa(hexa.first, hexa.second, hexa.third, hexa.fourth, hexa.fifth, hexa.sixth)
                } shouldBe Hexa("one", "two", "three", "four", "five", "six")

            }

            "handle null values" {

                Hexa<String?, String?, String?, String?,String?, String?>(null, null, null, null, null, null).let { hexa ->
                    hexa.first shouldBe null
                    hexa.second shouldBe null
                    hexa.third shouldBe null
                    hexa.fourth shouldBe null
                    hexa.fifth shouldBe null
                    hexa.sixth shouldBe null

                    Hexa(hexa.first, hexa.second, hexa.third, hexa.fourth, hexa.fifth, hexa.sixth)
                } shouldBe  Hexa(null, null, null, null, null, null)

            }

            "handle toString" {

                Hexa("one", "two", "three", "four", "five", "six").toString() shouldBe "Hexa(first=one, second=two, third=three, fourth=four, fifth=five, sixth=six)"

            }

            "handle copy()" {

                val hexa = Hexa("one", "two", "three", "four", "five", "six")

                hexa.copy() shouldBe Hexa("one", "two", "three", "four", "five", "six")

            }

            "handle toList" {

                Hexa("one", "two", "three", "four", "fife", "six").toList() shouldBe listOf("one", "two", "three", "four", "fife", "six")

            }
        }

    }

}