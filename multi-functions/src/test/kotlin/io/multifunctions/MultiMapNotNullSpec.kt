package io.multifunctions

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.models.*

class MultiMapNotNullSpec : WordSpec() {

    init {

        "MultiMapNotNull" should {

            "produce a correct mapping from Pair" {

                listOf(Pair("one", "two")).mapNotNull { one, two ->
                    one shouldBe "one"
                    two shouldBe "two"

                    Pair(one, two)
                } shouldBe listOf(Pair("one", "two"))
            }

            "produce a correct mapping from Triple" {

                listOf(Triple("one", "two", "three")).mapNotNull { one, two, three ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Triple(one, two, three)
                } shouldBe listOf(Triple("one", "two", "three"))
            }

            "produce a correct mapping from Quad" {

                listOf(Quad("one", "two", "three", "four")).mapNotNull { one, two, three, four ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Quad(one, two, three, four)
                } shouldBe listOf(Quad("one", "two", "three", "four"))
            }

            "produce a correct mapping from Penta" {

                listOf(Penta("one", "two", "three", "four", "five")).mapNotNull { one, two, three, four, five ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    Penta(one, two, three, four, five)
                } shouldBe listOf(Penta("one", "two", "three", "four", "five"))
            }

            "produce a correct mapping from Hexa" {

                listOf(Hexa("one", "two", "three", "four", "five", "six")).mapNotNull { one, two, three, four, five, six ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    Hexa(one, two, three, four, five, six)
                } shouldBe listOf(Hexa("one", "two", "three", "four", "five", "six"))
            }

            "produce a correct mapping from Hexa" {

                listOf(Hepta("one", "two", "three", "four", "five", "six", "seven")).mapNotNull { one, two, three, four, five, six, seven ->
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