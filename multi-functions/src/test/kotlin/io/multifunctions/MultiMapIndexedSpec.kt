package io.multifunctions

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.models.*

class MultiMapIndexedSpec : WordSpec() {

    init {

        "MultiMapIndexed" should {

            "produce a correct mapping from Pair" {

                listOf(Pair("one", "two")).mapIndexed { index, one, two ->
                    one shouldBe "one"
                    two shouldBe "two"

                    Triple(index, one, two)
                } shouldBe listOf(Triple(0, "one", "two"))
            }

            "produce a correct mapping from Triple" {

                listOf(Triple("one", "two", "three")).mapIndexed { index, one, two, three ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Quad(index, one, two, three)
                } shouldBe listOf(Quad(0, "one", "two", "three"))
            }

            "produce a correct mapping from Quad" {

                listOf(Quad("one", "two", "three", "four")).mapIndexed { index, one, two, three, four ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Penta(index, one, two, three, four)
                } shouldBe listOf(Penta(0, "one", "two", "three", "four"))
            }

            "produce a correct mapping from Penta" {

                listOf(Penta("one", "two", "three", "four", "five")).mapIndexed { index, one, two, three, four, five ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    Hexa(index, one, two, three, four, five)
                } shouldBe listOf(Hexa(0, "one", "two", "three", "four", "five"))
            }

            "produce a correct mapping from Hexa" {

                listOf(Hexa("one", "two", "three", "four", "five", "six")).mapIndexed { index, one, two, three, four, five, six ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    Hepta(index, one, two, three, four, five, six)
                } shouldBe listOf(Hepta(0, "one", "two", "three", "four", "five", "six"))
            }

            "handle null values" {

                listOf(Pair<String?, String?>("one", null)).mapIndexed { index, one, two ->
                    one shouldBe "one"
                    two shouldBe null

                    Triple(index, one, two)
                } shouldBe listOf(Triple(0, "one", null))

            }

            "not effect kotlin mapIndexed" {

                listOf("something").mapIndexed { index, someThingToIndexedMap ->
                    Pair(index, "$someThingToIndexedMap to indexed map")
                } shouldBe listOf(Pair(0, "something to indexed map"))
            }
        }
    }
}