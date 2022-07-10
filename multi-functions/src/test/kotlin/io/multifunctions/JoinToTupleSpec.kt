package io.multifunctions

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

internal class JoinToTupleSpec : WordSpec() {


    init {

        "joinToTuple" should {

            "join values into a [Pair]" {

                joinToTuple("A", "B") shouldBe Pair("A", "B")
            }

            "join values into a [Triple]" {

                joinToTuple("A", "B", "C") shouldBe Triple("A", "B", "C")
            }

            "join values into a [Quad]" {

                joinToTuple("A", "B", "C", "D") shouldBe Quad("A", "B", "C", "D")
            }

            "join values into a [Penta]" {

                joinToTuple("A", "B", "C", "D", "E") shouldBe Penta("A", "B", "C", "D", "E")
            }

            "join values into a [Hexa]" {

                joinToTuple("A", "B", "C", "D", "E", "F") shouldBe Hexa(
                    "A",
                    "B",
                    "C",
                    "D",
                    "E",
                    "F"
                )
            }

            "join values into a [Hepta]" {

                joinToTuple("A", "B", "C", "D", "E", "F", "G") shouldBe Hepta(
                    "A",
                    "B",
                    "C",
                    "D",
                    "E",
                    "F",
                    "G"
                )
            }
        }
    }
}
