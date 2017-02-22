package io.multifunctions.models

import io.kotlintest.specs.WordSpec

class QuadSpec : WordSpec() {

    init {

        "Quad" should {

            "be initialized" {

                Quad("one", "two", "three", "four").let { quad ->
                    quad.first shouldBe "one"
                    quad.second shouldBe "two"
                    quad.third shouldBe "three"
                    quad.fourth shouldBe "four"
                }

            }

            "handle null values" {

                Quad(null, null, null, null).let { quad ->
                    quad.first shouldBe null
                    quad.second shouldBe null
                    quad.third shouldBe null
                    quad.fourth shouldBe null
                }

            }

        }

    }

}