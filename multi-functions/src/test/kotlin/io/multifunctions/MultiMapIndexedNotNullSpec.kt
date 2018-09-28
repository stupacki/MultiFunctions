package io.multifunctions

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.models.*

class MultiMapIndexedNotNullSpec : WordSpec() {

    init {

        "MapIndexedNotNull" should {

            "produce a correct mapping from Pair" {

                listOf(Pair("one", "two")).mapIndexedNotNull { index, one, two ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"

                    Pair(one, two)
                } shouldBe listOf(Pair("one", "two"))
            }

            "produce a correct mapping from Triple" {

                listOf(Triple("one", "two", "three")).mapIndexedNotNull { index, one, two, three ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Triple(one, two, three)
                } shouldBe listOf(Triple("one", "two", "three"))
            }

            "produce a correct mapping from Quad" {

                listOf(Quad("one", "two", "three", "four")).mapIndexedNotNull { index, one, two, three, four ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Quad(one, two, three, four)
                } shouldBe listOf(Quad("one", "two", "three", "four"))
            }

            "produce a correct mapping from Penta" {

                listOf(Penta("one", "two", "three", "four", "five")).mapIndexedNotNull { index, one, two, three, four, five ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    Penta(one, two, three, four, five)
                } shouldBe listOf(Penta("one", "two", "three", "four", "five"))
            }

            "produce a correct mapping from Hexa" {

                listOf(Hexa("one", "two", "three", "four", "five", "six")).mapIndexedNotNull { index, one, two, three, four, five, six ->
                    index shouldBe 0

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

                listOf(Hepta("one", "two", "three", "four", "five", "six", "seven")).mapIndexedNotNull { index, one, two, three, four, five, six, seven ->
                    index shouldBe 0

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

                listOf(Pair("one", null), Pair("one", "two")).mapIndexedNotNull { index, one, two ->
                    Triple(index, one, two)
                } shouldBe listOf(Triple(1, "one", "two"))
            }

            "not effect kotlin mapIndexedNotNull" {

                listOf(null, "something", null).mapIndexedNotNull { index, elem ->
                    when (null) {
                        elem -> null
                        else -> Pair(index, "$elem non null to indexed map")
                    }
                } shouldBe listOf(Pair(1, "something non null to indexed map"))
            }
        }
    }
}