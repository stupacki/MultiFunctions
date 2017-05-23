package io.multifunctions

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.MultiFunctions.forEachIndexed
import io.multifunctions.models.*

class MultiForEachIndexedSpec : WordSpec() {

    init {

        "MultiForEachIndexed" should {

            "produce a correct mapping from Pair" {

                listOf(Pair("one", "two")).forEachIndexed { index, one, two ->
                    one shouldBe "one"
                    two shouldBe "two"

                    Triple(index, one, two)
                } shouldBe Unit

            }

            "produce a correct mapping from Triple" {

                listOf(Triple("one", "two", "three")).forEachIndexed { index, one, two, three ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Quad(index, one, two, three)
                } shouldBe Unit

            }

            "produce a correct mapping from Quad" {

                listOf(Quad("one", "two", "three", "four")).forEachIndexed { index, one, two, three, four ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Penta(index, one, two, three, four)
                } shouldBe Unit

            }

            "produce a correct mapping from Penta" {

                listOf(Penta("one", "two", "three", "four", "five")).forEachIndexed { index, one, two, three, four, five ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    Hexa(index, one, two, three, four, five)
                } shouldBe Unit

            }

            "produce a correct mapping from Hexa" {

                listOf(Hexa("one", "two", "three", "four", "five", "six")).forEachIndexed { index, one, two, three, four, five, six ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    Hepta(index, one, two, three, four, five, six)
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