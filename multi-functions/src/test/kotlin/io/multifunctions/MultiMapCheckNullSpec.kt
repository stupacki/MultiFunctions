package io.multifunctions

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

internal class MultiMapCheckNullSpec : WordSpec() {

    init {

        "MultiMapCheckNull" should {

            "produce a correct mapping from Pair" {

                val testData = listOf(Pair("one", "two"))

                testData mapCheckNull { one, two ->
                    one shouldBe "one"
                    two shouldBe "two"

                    Pair(one, two)
                } shouldBe testData
            }

            "produce a correct mapping from Triple" {

                val testData = listOf(Triple("one", "two", "three"))

                testData mapCheckNull { one, two, three ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Triple(one, two, three)
                } shouldBe testData
            }

            "produce a correct mapping from Quad" {

                val testData = listOf(Quad("one", "two", "three", "four"))

                testData mapCheckNull { one, two, three, four ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Quad(one, two, three, four)
                } shouldBe testData
            }

            "produce a correct mapping from Penta" {

                val testData = listOf(Penta("one", "two", "three", "four", "five"))

                testData mapCheckNull { one, two, three, four, five ->
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

                testData mapCheckNull { one, two, three, four, five, six ->
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

                testData mapCheckNull { one, two, three, four, five, six, seven ->
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

                val actual = listOf(Pair<String?, String?>("one", null), Pair("one", "two"))
                val expected = listOf(Pair("one", "two"))

                actual mapCheckNull { one, two -> Pair(one, two) } shouldBe expected
            }
        }
    }
}
