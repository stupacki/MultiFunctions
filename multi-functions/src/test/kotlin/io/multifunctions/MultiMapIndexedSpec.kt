package io.multifunctions

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.models.*

class MultiMapIndexedSpec : WordSpec() {

    init {

        "MultiMapIndexed" should {

            "produce a correct mapping from Pair" {

                listOf(Pair("one", "two")).mapIndexed { index, one, two ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"

                    Pair(one, two)
                } shouldBe listOf(Pair("one", "two"))
            }

            "produce a correct mapping from Triple" {

                listOf(Triple("one", "two", "three")).mapIndexed { index, one, two, three ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Triple(one, two, three)
                } shouldBe listOf(Triple("one", "two", "three"))
            }

            "produce a correct mapping from Quad" {

                listOf(Quad("one", "two", "three", "four")).mapIndexed { index, one, two, three, four ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Quad(one, two, three, four)
                } shouldBe listOf(Quad("one", "two", "three", "four"))
            }

            "produce a correct mapping from Penta" {

                listOf(Penta("one", "two", "three", "four", "five")).mapIndexed { index, one, two, three, four, five ->
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

                listOf(Hexa("one", "two", "three", "four", "five", "six")).mapIndexed { index, one, two, three, four, five, six ->
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

                listOf(Hepta("one", "two", "three", "four", "five", "six", "seven")).mapIndexed { index, one, two, three, four, five, six, seven ->
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

                listOf(Pair<String?, String?>("one", null)).mapIndexed { index, one, two ->
                    one shouldBe "one"
                    two shouldBe null

                    Triple(index, one, two)
                } shouldBe listOf(Triple(0, "one", null))

            }

            "not effect kotlin mapIndexed" {

                listOf("something").mapIndexed { index, someThingToIndexedMap ->
                    Pair(index, "$someThingToIndexedMap to indexed map")
                } shouldBe listOf(Pair(0, "something to indexed map"))
            }
        }
    }
}