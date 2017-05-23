package io.multifunctions

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.MultiFunctions.mapIndexedNotNull
import io.multifunctions.models.*

class MultiMapIndexedNotNullSpec : WordSpec(){

    init {

        "MapIndexedNotNull" should {

            "produce a correct mapping from Pair" {

                listOf(Pair("one", "two")).mapIndexedNotNull { index, one, two ->
                    one shouldBe "one"
                    two shouldBe "two"

                    Triple(index, one, two)
                } shouldBe listOf(Triple(0, "one", "two"))

            }

            "produce a correct mapping from Triple" {

                listOf(Triple("one", "two", "three")).mapIndexedNotNull { index, one, two, three ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Quad(index, one, two, three)
                } shouldBe listOf(Quad(0, "one", "two", "three"))

            }

            "produce a correct mapping from Quad" {

                listOf(Quad("one", "two", "three", "four")).mapIndexedNotNull { index, one, two, three, four ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Penta(index, one, two, three, four)
                } shouldBe listOf(Penta(0, "one", "two", "three", "four"))

            }

            "produce a correct mapping from Penta" {

                listOf(Penta("one", "two", "three", "four", "five")).mapIndexedNotNull { index, one, two, three, four, five ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    Hexa(index, one, two, three, four, five)
                } shouldBe listOf(Hexa(0, "one", "two", "three", "four", "five"))

            }

            "produce a correct mapping from Hexa" {

                listOf(Hexa("one", "two", "three", "four", "five", "six")).mapIndexedNotNull { index, one, two, three, four, five, six ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    Hepta(index, one, two, three, four, five, six)
                } shouldBe listOf(Hepta(0, "one", "two", "three", "four", "five", "six"))

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