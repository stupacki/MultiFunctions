package io.multifunctions

import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.models.*

class MultiMapIndexedNotNullSpec : WordSpec() {

    init {

        "mapIndexedNotNull" should {

            "produce a correct mapping from Pair" {
                val testData = listOf(Pair("one", "two"))

                testData.mapIndexedNotNull { index, one, two ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"

                    Pair(one, two)
                } shouldBe testData
            }

            "produce a correct mapping from Triple" {
                val testData = listOf(Triple("one", "two", "three"))

                testData.mapIndexedNotNull { index, one, two, three ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Triple(one, two, three)
                } shouldBe testData
            }

            "produce a correct mapping from Quad" {
                val testData = listOf(Quad("one", "two", "three", "four"))

                testData.mapIndexedNotNull { index, one, two, three, four ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Quad(one, two, three, four)
                } shouldBe testData
            }

            "produce a correct mapping from Penta" {
                val testData = listOf(Penta("one", "two", "three", "four", "five"))

                testData.mapIndexedNotNull { index, one, two, three, four, five ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    Penta(one, two, three, four, five)
                } shouldBe testData
            }

            "produce a correct mapping from Hexa" {
                val testData = listOf(Hexa("one", "two", "three", "four", "five", "six"))

                testData.mapIndexedNotNull { index, one, two, three, four, five, six ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    Hexa(one, two, three, four, five, six)
                } shouldBe testData
            }

            "produce a correct mapping from Hepta" {
                val testData = listOf(Hepta("one", "two", "three", "four", "five", "six", "seven"))

                testData.mapIndexedNotNull { index, one, two, three, four, five, six, seven ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"
                    seven shouldBe "seven"

                    Hepta(one, two, three, four, five, six, seven)
                } shouldBe testData
            }

            "handle null values" {

                val actual = listOf(Pair("one", null),
                                    Pair(null, "two"),
                                    Pair("one", "two"),
                                    Pair(null, null))

                val expected = listOf(Pair(0, Pair("one", null)),
                                      Pair(1, Pair(null, "two")),
                                      Pair(2, Pair("one", "two")))

                actual.mapIndexedNotNull { index, one, two -> Pair(index, Pair(one, two)) } shouldBe expected
            }

            "not effect kotlin mapIndexedNotNull" {
                val actual = listOf(null, 2, null)
                val expected = listOf(3)

                actual.mapIndexedNotNull { index, elem -> elem?.let { it + index } } shouldBe expected
            }
        }
    }
}