package io.multifunctions

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.models.*

class MultiForEachIndexedSpec : WordSpec() {

    init {

        "MultiForEachIndexed" should {

            "produce a correct mapping from Pair" {

                listOf(Pair("one", "two")).forEachIndexed { index, one, two ->
                    index shouldBe 1

                    one shouldBe "one"
                    two shouldBe "two"

                    Pair(one, two)
                } shouldBe Unit
            }

            "produce a correct mapping from Triple" {

                listOf(Triple("one", "two", "three")).forEachIndexed { index, one, two, three ->
                    index shouldBe 1

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Triple(one, two, three)
                } shouldBe Unit
            }

            "produce a correct mapping from Quad" {

                listOf(Quad("one", "two", "three", "four")).forEachIndexed { index, one, two, three, four ->
                    index shouldBe 1

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Quad(one, two, three, four)
                } shouldBe Unit
            }

            "produce a correct mapping from Penta" {

                listOf(Penta("one", "two", "three", "four", "five")).forEachIndexed { index, one, two, three, four, five ->
                    index shouldBe 1

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    Penta(one, two, three, four, five)
                } shouldBe Unit
            }

            "produce a correct mapping from Hexa" {

                listOf(Hexa("one", "two", "three", "four", "five", "six")).forEachIndexed { index, one, two, three, four, five, six ->
                    index shouldBe 1

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

                listOf(Hepta("one", "two", "three", "four", "five", "six", "seven")).forEachIndexed { index, one, two, three, four, five, six, seven ->
                    index shouldBe 1

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    Hepta(one, two, three, four, five, six, seven)
                } shouldBe Unit
            }

            "handle null values" {

                listOf(Pair<String?, String?>("one", null)).forEachIndexed { index, one, two ->
                    one shouldBe "one"
                    two shouldBe null

                    Triple(index, one, two)
                } shouldBe Unit
            }

            "not effect kotlin forEachIndexed" {

                listOf("something").forEachIndexed { index, someThingToIndexedMap ->
                    Pair(index, "$someThingToIndexedMap to indexed map")
                } shouldBe Unit
            }
        }
    }
}