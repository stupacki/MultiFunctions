package io.multifunctions.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec

class QuadSpec : WordSpec() {

    init {

        "Quad" should {

            "be initialized with Strings" {
                val testData = Quad("one", "two", "three", "four")

                testData.let { quad ->
                    quad.first shouldBe "one"
                    quad.second shouldBe "two"
                    quad.third shouldBe "three"
                    quad.fourth shouldBe "four"

                    Quad(quad.first, quad.second, quad.third, quad.fourth)
                } shouldBe testData
            }

            "handle null values" {
                val testData = Quad<String?, String?, String?, String?>(null, null, null, null)

                testData.let { quad ->
                    quad.first shouldBe null
                    quad.second shouldBe null
                    quad.third shouldBe null
                    quad.fourth shouldBe null

                    Quad(quad.first, quad.second, quad.third, quad.fourth)
                } shouldBe testData
            }

            "handle toString" {
                val actual = Quad("one", "two", "three", "four")
                val expected = "Quad(first=one, second=two, third=three, fourth=four)"

                actual.toString() shouldBe expected
            }

            "handle copy()" {
                val actual = Quad("one", "two", "three", "four")

                actual.copy() shouldBe actual
            }

            "handle toList" {
                val actual = Quad("one", "two", "three", "four")
                val expected = listOf("one", "two", "three", "four")

                actual.toList() shouldBe expected
            }
        }
    }
}