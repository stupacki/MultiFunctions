package io.multifunctions

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.MultiFunctions.flatMap
import io.multifunctions.models.*

class MultiFlatMapSpec : WordSpec() {

    init {

        "MultiFlatMap" should {

            "produce a correct mapping from Pair" {

                listOf(Pair("one", "two")).flatMap { one, two ->
                    one shouldBe "one"
                    two shouldBe "two"

                    listOf(Pair(one, two))
                } shouldBe listOf(Pair("one", "two"))

            }

            "produce a correct mapping from Triple" {

                listOf(Triple("one", "two", "three")).flatMap { one, two, three ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    listOf(Triple(one, two, three))
                } shouldBe listOf(Triple("one", "two", "three"))

            }

            "produce a correct mapping from Quad" {

                listOf(Quad("one", "two", "three", "four")).flatMap { one, two, three, four ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    listOf(Quad(one, two, three, four))
                } shouldBe listOf(Quad("one", "two", "three", "four"))

            }

            "produce a correct mapping from Penta" {

                listOf(Penta("one", "two", "three", "four", "five")).flatMap { one, two, three, four, five ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    listOf(Penta(one, two, three, four, five))
                } shouldBe listOf(Penta("one", "two", "three", "four", "five"))

            }

            "produce a correct mapping from Hexa" {

                listOf(Hexa("one", "two", "three", "four", "five", "six")).flatMap { one, two, three, four, five, six ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    listOf(Hexa(one, two, three, four, five, six))
                } shouldBe listOf(Hexa("one", "two", "three", "four", "five", "six"))

            }

            "handle null values" {

                listOf(Pair<String?, String?>("one", null)).flatMap { one, two ->
                    one shouldBe "one"
                    two shouldBe null

                    listOf(Pair(one, two))
                } shouldBe listOf(Pair("one", null))

            }

            "not effect kotlin flatMap" {

                listOf("something").flatMap { someThingToFlatMap ->
                    listOf("$someThingToFlatMap to flatMap")
                } shouldBe listOf("something to flatMap")

            }

        }

    }

}