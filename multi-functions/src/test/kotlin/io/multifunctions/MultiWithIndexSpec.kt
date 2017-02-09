package io.multifunctions

import io.kotlintest.specs.WordSpec
import io.multifunctions.MultiFunctions.withIndex
import io.multifunctions.models.*

class MultiWithIndexSpec : WordSpec() {

    init {

        "WithIndex" should {

            "produce a correct mapping from Pair" {

                listOf(Pair("one", "two")).withIndex { one, two ->
                    one shouldBe "one"
                    two shouldBe "two"

                    Pair(one, two)
                } shouldBe listOf(IndexedValue(0, Pair("one", "two")))

            }

            "produce a correct mapping from Triple" {

                listOf(Triple("one", "two", "three")).withIndex { one, two, three ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Triple(one, two, three)
                } shouldBe listOf(IndexedValue(0, Triple("one", "two", "three")))

            }

            "produce a correct mapping from Quad" {

                listOf(Quad("one", "two", "three", "four")).withIndex { one, two, three, four ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Quad(one, two, three, four)
                } shouldBe listOf(IndexedValue(0, Quad("one", "two", "three", "four")))

            }

            "produce a correct mapping from Penta" {

                listOf(Penta("one", "two", "three", "four", "five")).withIndex { one, two, three, four, five ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    Penta(one, two, three, four, five)
                } shouldBe listOf(IndexedValue(0, Penta("one", "two", "three", "four", "five")))

            }

            "produce a correct mapping from Hexa" {

                listOf(Hexa("one", "two", "three", "four", "five", "six")).withIndex { one, two, three, four, five, six ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    Hexa(one, two, three, four, five, six)
                } shouldBe listOf(IndexedValue(0, Hexa("one", "two", "three", "four", "five", "six")))

            }

            "handle null values" {

                listOf(Pair("one", null)).withIndex { one, two ->
                    one shouldBe "one"
                    two shouldBe null

                    Pair(one, two)
                } shouldBe listOf(IndexedValue(0, Pair("one", null)))

            }

            "not effect kotlin withIndex" {

                listOf("something").withIndex().map { elem ->
                    elem.index shouldBe 0
                    elem.value shouldBe "something"
                }

            }

        }

    }

}