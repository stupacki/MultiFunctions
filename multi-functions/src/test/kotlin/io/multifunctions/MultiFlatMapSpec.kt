package io.multifunctions

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

internal class MultiFlatMapSpec : WordSpec() {

    init {

        "MultiFlatMap" should {

            "produce a correct mapping from Pair" {

                val testData = listOf(Pair("one", "two"))

                testData.flatMap { one, two ->
                    one shouldBe "one"
                    two shouldBe "two"

                    listOf(Pair(one, two))
                } shouldBe testData
            }

            "produce a correct mapping from Triple" {

                val tesData = listOf(Triple("one", "two", "three"))

                tesData.flatMap { one, two, three ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    listOf(Triple(one, two, three))
                } shouldBe tesData
            }

            "produce a correct mapping from Quad" {

                val tesData = listOf(Quad("one", "two", "three", "four"))

                tesData.flatMap { one, two, three, four ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    listOf(Quad(one, two, three, four))
                } shouldBe tesData
            }

            "produce a correct mapping from Penta" {

                val testData = listOf(Penta("one", "two", "three", "four", "five"))

                testData.flatMap { one, two, three, four, five ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    listOf(Penta(one, two, three, four, five))
                } shouldBe testData
            }

            "produce a correct mapping from Hexa" {

                val testData = listOf(Hexa("one", "two", "three", "four", "five", "six"))

                testData.flatMap { one, two, three, four, five, six ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    listOf(Hexa(one, two, three, four, five, six))
                } shouldBe testData
            }

            "produce a correct mapping from Hepta" {

                val testData = listOf(Hepta("one", "two", "three", "four", "five", "six", "seven"))

                testData.flatMap { one, two, three, four, five, six, seven ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"
                    seven shouldBe "seven"

                    listOf(Hepta(one, two, three, four, five, six, seven))
                } shouldBe testData
            }

            "handle null values" {

                val testData = listOf(Pair("one", null))
                val expected = listOf(Pair("one", null))

                testData.flatMap { one, two ->
                    one shouldBe "one"
                    two shouldBe null

                    listOf(Pair(one, two))
                } shouldBe expected
            }
        }
    }
}
