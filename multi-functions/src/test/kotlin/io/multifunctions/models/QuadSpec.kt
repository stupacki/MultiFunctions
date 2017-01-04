package io.multifunctions.models

import io.kotlintest.specs.WordSpec
import io.multifunctions.MultiFunctions

class QuadSpec : WordSpec(), MultiFunctions {

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

        }

    }

}