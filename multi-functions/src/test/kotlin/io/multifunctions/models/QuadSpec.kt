package io.multifunctions.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec

class QuadSpec : WordSpec() {

    init {

        "Quad" should {

            "be initialized with Strings" {

                Quad("one", "two", "three", "four").let { quad ->
                    quad.first shouldBe "one"
                    quad.second shouldBe "two"
                    quad.third shouldBe "three"
                    quad.fourth shouldBe "four"

                    Quad(quad.first, quad.second, quad.third, quad.fourth)
                } shouldBe Quad("one", "two", "three", "four")
            }

            "handle null values" {

                Quad<String?, String?, String?, String?>(null, null, null, null).let { quad ->
                    quad.first shouldBe null
                    quad.second shouldBe null
                    quad.third shouldBe null
                    quad.fourth shouldBe null

                    Quad(quad.first, quad.second, quad.third, quad.fourth)
                } shouldBe Quad(null, null, null, null)
            }

            "handle toString" {

                Quad("one", "two", "three", "four").toString() shouldBe "Quad(first=one, second=two, third=three, fourth=four)"
            }

            "handle copy()" {

                val quad = Quad("one", "two", "three", "four")

                quad.copy() shouldBe Quad("one", "two", "three", "four")
            }

            "handle toList" {

                Quad("one", "two", "three", "four").toList() shouldBe listOf("one", "two", "three", "four")
            }
        }
    }
}