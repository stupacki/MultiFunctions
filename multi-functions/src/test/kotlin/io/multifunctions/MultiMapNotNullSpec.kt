package io.multifunctions

import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.models.*

class MultiMapNotNullSpec : WordSpec() {

    init {

        "MultiMapNotNull" should {

            "produce a correct mapping from Pair" {
                val testData = listOf(Pair("one", "two"))

                testData.mapNotNull { one, two ->
                    one shouldBe "one"
                    two shouldBe "two"

                    Pair(one, two)
                } shouldBe testData
            }

            "produce a correct mapping from Triple" {
                val testData = listOf(Triple("one", "two", "three"))

                testData.mapNotNull { one, two, three ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Triple(one, two, three)
                } shouldBe testData
            }

            "produce a correct mapping from Quad" {
                val testData = listOf(Quad("one", "two", "three", "four"))

                testData.mapNotNull { one, two, three, four ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Quad(one, two, three, four)
                } shouldBe testData
            }

            "produce a correct mapping from Penta" {
                val testData = listOf(Penta("one", "two", "three", "four", "five"))

                testData.mapNotNull { one, two, three, four, five ->
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

                testData.mapNotNull { one, two, three, four, five, six ->
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

                testData.mapNotNull { one, two, three, four, five, six, seven ->
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

            "sort out null elements" {
                listOf(Pair(null, null),
                       Pair("one", "two"),
                       Pair("one", null),
                       Pair(null, "two")).mapNotNull { one, two ->
                    Pair(one, two)
                } shouldBe listOf(Pair("one", "two"),
                                  Pair("one", null),
                                  Pair(null, "two"))
            }

            "handle null values" {

                listOf(Pair<String?, String?>("one", null), Pair("one", "two")).mapNotNull { one, two ->
                    Pair(one, two)
                } shouldBe listOf(Pair("one", null),
                                  Pair("one", "two"))
            }

            "not effect kotlin mapNotNull" {

                listOf(null, "something", null).mapNotNull { elem ->
                    when (null) {
                        elem -> null
                        else -> "$elem non null to indexed map"
                    }
                } shouldBe listOf("something non null to indexed map")
            }
        }
    }
}