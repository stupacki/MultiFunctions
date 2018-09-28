package io.multifunctions

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.models.*

class MultiLetCheckNullSpec : WordSpec(){

    init {

        "MultiLetNotNull" should {

            "produce a correct binding from Pair" {

                Pair("one", "two").letCheckNull { one, two ->
                    one shouldBe "one"
                    two shouldBe "two"

                    Pair(one, two)
                } shouldBe Pair("one", "two")
            }

            "produce a correct binding from Triple" {

                Triple("one", "two", "three").letCheckNull { one, two, three ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Triple(one, two, three)
                } shouldBe Triple("one", "two", "three")
            }

            "produce a correct binding from Quad" {

                Quad("one", "two", "three", "four").letCheckNull { one, two, three, four ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Quad(one, two, three, four)
                } shouldBe Quad("one", "two", "three", "four")
            }

            "produce a correct binding from Penta" {

                Penta("one", "two", "three", "four", "five").letCheckNull { one, two, three, four, five ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    Penta(one, two, three, four, five)
                } shouldBe Penta("one", "two", "three", "four", "five")
            }

            "produce a correct binding from Hexa" {

                Hexa("one", "two", "three", "four", "five", "six").letCheckNull { one, two, three, four, five, six ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    Hexa(one, two, three, four, five, six)
                } shouldBe Hexa("one", "two", "three", "four", "five", "six")
            }

            "produce a correct binding from Hepta" {

                Hepta("one", "two", "three", "four", "five", "six", "seven").letCheckNull { one, two, three, four, five, six, seven ->
                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"
                    seven shouldBe "seven"

                    Hepta(one, two, three, four, five, six, seven)
                } shouldBe Hepta("one", "two", "three", "four", "five", "six", "seven")
            }

            "handle null values" {

                Pair<String?, String?>("one", null).letCheckNull { one, two ->
                    one shouldBe "one"
                    two shouldBe null

                    Pair(one, two)
                } shouldBe null
            }
        }
    }
}