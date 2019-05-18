package io.multifunctions

import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.models.*

class MultiLetCheckNullSpec : WordSpec() {

    init {

        "MultiLetNotNull" should {

            "produce a correct binding from Pair" {
                val testData = Pair("one", "two")

                testData letCheckNull { one, two ->
                    one shouldBe "one"
                    two shouldBe "two"

                    Pair(one, two)
                } shouldBe testData
            }

            "produce a correct binding from Triple" {
                val testData = Triple("one", "two", "three")

                testData letCheckNull { one, two, three ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Triple(one, two, three)
                } shouldBe testData
            }

            "produce a correct binding from Quad" {
                val testData = Quad("one", "two", "three", "four")

                testData letCheckNull { one, two, three, four ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Quad(one, two, three, four)
                } shouldBe testData
            }

            "produce a correct binding from Penta" {
                val testData = Penta("one", "two", "three", "four", "five")

                testData letCheckNull { one, two, three, four, five ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    Penta(one, two, three, four, five)
                } shouldBe testData
            }

            "produce a correct binding from Hexa" {
                val testData = Hexa("one", "two", "three", "four", "five", "six")

                testData letCheckNull { one, two, three, four, five, six ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    Hexa(one, two, three, four, five, six)
                } shouldBe testData
            }

            "produce a correct binding from Hepta" {
                val testData = Hepta("one", "two", "three", "four", "five", "six", "seven")

                testData letCheckNull { one, two, three, four, five, six, seven ->
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
                val actual = Pair<String?, String?>("one", null)

                actual letCheckNull { one, two ->
                    one shouldBe "one"
                    two shouldBe null

                    Pair(one, two)
                } shouldBe null
            }
        }
    }
}
