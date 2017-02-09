package io.multifunctions

import io.kotlintest.specs.WordSpec
import io.multifunctions.MultiFunctions.letNotNull
import io.multifunctions.models.*

class MultiLetNotNullSpec : WordSpec(){

    init {

        "MultiLetNotNull" should {

            "produce a correct binding from Pair" {

                Pair("one", "two").letNotNull { one, two ->
                    one shouldBe "one"
                    two shouldBe "two"

                    Pair(one, two)
                } shouldBe Pair("one", "two")

            }

            "produce a correct binding from Triple" {

                Triple("one", "two", "three").letNotNull { one, two, three ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Triple(one, two, three)
                } shouldBe Triple("one", "two", "three")

            }

            "produce a correct binding from Quad" {

                Quad("one", "two", "three", "four").letNotNull { one, two, three, four ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Quad(one, two, three, four)
                } shouldBe Quad("one", "two", "three", "four")

            }

            "produce a correct binding from Penta" {

                Penta("one", "two", "three", "four", "five").letNotNull { one, two, three, four, five ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    Penta(one, two, three, four, five)
                } shouldBe Penta("one", "two", "three", "four", "five")

            }

            "produce a correct binding from Hexa" {

                Hexa("one", "two", "three", "four", "five", "six").letNotNull { one, two, three, four, five, six ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    Hexa(one, two, three, four, five, six)
                } shouldBe Hexa("one", "two", "three", "four", "five", "six")

            }

            "handle null values" {

                Pair("one", null).letNotNull { one, two ->
                    one shouldBe "one"
                    two shouldBe null

                    Pair(one, two)
                } shouldBe null

            }

        }

    }

}