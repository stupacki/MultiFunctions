package io.multifunctions

import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.models.*

class MultiWithIndexSpec : WordSpec() {

    init {

        "WithIndex" should {

            "produce a correct mapping from Pair" {
                val actual = listOf(Pair("one", "two"))
                val expected = listOf(IndexedValue(0, Pair("one", "two")))

                actual.withIndex { one, two ->
                    one shouldBe "one"
                    two shouldBe "two"

                    Pair(one, two)
                } shouldBe expected
            }

            "produce a correct mapping from Triple" {
                val actual = listOf(Triple("one", "two", "three"))
                val expected = listOf(IndexedValue(0, Triple("one", "two", "three")))

                actual.withIndex { one, two, three ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Triple(one, two, three)
                } shouldBe expected
            }

            "produce a correct mapping from Quad" {
                val actual = listOf(Quad("one", "two", "three", "four"))
                val expected = listOf(IndexedValue(0, Quad("one", "two", "three", "four")))

                actual.withIndex { one, two, three, four ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Quad(one, two, three, four)
                } shouldBe expected
            }

            "produce a correct mapping from Penta" {
                val actual = listOf(Penta("one", "two", "three", "four", "five"))
                val expected = listOf(IndexedValue(0, Penta("one", "two", "three", "four", "five")))

                actual.withIndex { one, two, three, four, five ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    Penta(one, two, three, four, five)
                } shouldBe expected
            }

            "produce a correct mapping from Hexa" {
                val actual = listOf(Hexa("one", "two", "three", "four", "five", "six"))
                val expected = listOf(IndexedValue(0, Hexa("one", "two", "three", "four", "five", "six")))

                actual.withIndex { one, two, three, four, five, six ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    Hexa(one, two, three, four, five, six)
                } shouldBe expected
            }

            "produce a correct mapping from Hepta" {
                val actual = listOf(Hepta("one", "two", "three", "four", "five", "six", "seven"))
                val expected = listOf(IndexedValue(0, Hepta("one", "two", "three", "four", "five", "six", "seven")))

                actual.withIndex { one, two, three, four, five, six, seven ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"
                    seven shouldBe "seven"

                    Hepta(one, two, three, four, five, six, seven)
                } shouldBe expected
            }

            "handle null values" {
                val actual = listOf(Pair<String?, String?>("one", null))
                val expected = listOf(IndexedValue(0, Pair("one", null)))

                actual.withIndex { one, two ->
                    one shouldBe "one"
                    two shouldBe null

                    Pair(one, two)
                } shouldBe expected
            }
        }
    }
}