package io.multifunctions.models

import io.kotlintest.matchers.shouldBe
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

                    Hepta(hepta.first, hepta.second, hepta.third, hepta.fourth, hepta.fifth, hepta.sixth, hepta.seventh)
                } shouldBe Hepta("one", "two", "three", "four", "five", "six", "seven")

            }

            "handle null values" {

                Hepta<String?, String?, String?, String?, String?, String?, String?>(null, null, null, null, null, null, null).let { hepta ->
                    hepta.first shouldBe null
                    hepta.second shouldBe null
                    hepta.third shouldBe null
                    hepta.fourth shouldBe null
                    hepta.fifth shouldBe null
                    hepta.sixth shouldBe null

                    Hepta(hepta.first, hepta.second, hepta.third, hepta.fourth, hepta.fifth, hepta.sixth, hepta.seventh)
                } shouldBe Hepta(null, null, null, null, null, null, null)

            }

            "handle toString" {

                Hepta("one", "two", "three", "four", "five", "six", "seven").toString() shouldBe "Hepta(first=one, second=two, third=three, fourth=four, fifth=five, sixth=six, seventh=seven)"

            }

            "handle copy()" {

                val hepta = Hepta("one", "two", "three", "four", "five", "six", "seven")

                hepta.copy() shouldBe Hepta("one", "two", "three", "four", "five", "six", "seven")

            }

        }

    }

}