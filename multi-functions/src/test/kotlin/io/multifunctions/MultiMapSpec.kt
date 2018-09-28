package io.multifunctions

import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.models.*

class MultiMapSpec : WordSpec() {

    init {

        "MultiMap" should {

            "produce a correct mapping from Pair" {

                listOf(Pair("one", "two")).map { one, two ->
                    one shouldBe "one"
                    two shouldBe "two"

                    Pair(one, two)
                } shouldBe listOf(Pair("one", "two"))
            }

            "produce a correct mapping from Triple" {

                listOf(Triple("one", "two", "three")).map { one, two, three ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Triple(one, two, three)
                } shouldBe listOf(Triple("one", "two", "three"))
            }

            "produce a correct mapping from Quad" {

                listOf(Quad("one", "two", "three", "four")).map { one, two, three, four ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Quad(one, two, three, four)
                } shouldBe listOf(Quad("one", "two", "three", "four"))
            }

            "produce a correct mapping from Penta" {

                listOf(Penta("one", "two", "three", "four", "five")).map { one, two, three, four, five ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    Penta(one, two, three, four, five)
                } shouldBe listOf(Penta("one", "two", "three", "four", "five"))
            }

            "produce a correct mapping from Hexa" {

                listOf(Hexa("one", "two", "three", "four", "five", "six")).map { one, two, three, four, five, six ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    Hexa(one, two, three, four, five, six)
                } shouldBe listOf(Hexa("one", "two", "three", "four", "five", "six"))
            }

            "produce a correct mapping from Hepta" {

                listOf(Hepta("one", "two", "three", "four", "five", "six", "seven")).map { one, two, three, four, five, six, seven ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"
                    seven shouldBe "seven"

                    Hepta(one, two, three, four, five, six, seven)
                } shouldBe listOf(Hepta("one", "two", "three", "four", "five", "six", "seven"))
            }

            "handle null values" {

                listOf(Pair<String?, String?>("one", null)).map { one, two ->
                    one shouldBe "one"
                    two shouldBe null

                    Pair(one, two)
                } shouldBe listOf(Pair("one", null))
            }

            "not effect kotlin map" {

                listOf("something").map { someThingToMap ->
                    "$someThingToMap to map"
                } shouldBe listOf("something to map")
            }
        }
    }
}