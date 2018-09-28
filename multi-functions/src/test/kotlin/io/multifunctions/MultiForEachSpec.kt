package io.multifunctions

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.models.*

class MultiForEachSpec : WordSpec() {

    init {

        "MultiForEach" should {

            "produce a correct mapping from Pair" {

                listOf(Pair("one", "two")).forEach { one, two ->
                    one shouldBe "one"
                    two shouldBe "two"

                    Pair(one, two)
                } shouldBe Unit
            }

            "produce a correct mapping from Triple" {

                listOf(Triple("one", "two", "three")).forEach { one, two, three ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Triple(one, two, three)
                } shouldBe Unit
            }

            "produce a correct mapping from Quad" {

                listOf(Quad("one", "two", "three", "four")).forEach { one, two, three, four ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Quad(one, two, three, four)
                } shouldBe Unit
            }

            "produce a correct mapping from Penta" {

                listOf(Penta("one", "two", "three", "four", "five")).forEach { one, two, three, four, five ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    Penta(one, two, three, four, five)
                } shouldBe Unit
            }

            "produce a correct mapping from Hexa" {

                listOf(Hexa("one", "two", "three", "four", "five", "six")).forEach { one, two, three, four, five, six ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    Hexa(one, two, three, four, five, six)
                } shouldBe Unit
            }

            "produce a correct mapping from Hepta" {

                listOf(Hepta("one", "two", "three", "four", "five", "six", "seven")).forEach { one, two, three, four, five, six, seven ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"
                    seven shouldBe "seven"

                    Hepta(one, two, three, four, five, six, seven)
                } shouldBe Unit
            }

            "handle null values" {

                listOf(Pair<String?, String?>("one", null)).forEach { one, two ->
                    one shouldBe "one"
                    two shouldBe null

                    Pair(one, two)
                } shouldBe Unit
            }

            "not effect kotlin forEach" {

                listOf("something").forEach { someThingToMap ->
                    println("$someThingToMap to map")
                } shouldBe Unit
            }
        }
    }
}