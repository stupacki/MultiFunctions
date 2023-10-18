package io.multifunctions

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

internal class NotNullSpec : WordSpec() {

    init {

        "NotNull with two values" should {

            "give access to the block when no value is null" {

                var firstResult: String? = null
                var secondResult: String? = null

                notNull(FIRST_VALUE, SECOND_VALUE) { first, second ->
                    firstResult = first
                    secondResult = second
                }

                firstResult shouldBe FIRST_VALUE
                secondResult shouldBe SECOND_VALUE
            }

            "prevent access to the block when a value is null" {

                var firstResult: String? = null
                var secondResult: String? = null

                notNull<String?, String?, Unit>(FIRST_VALUE, null) { first, second ->
                    firstResult = first
                    secondResult = second
                }

                firstResult shouldBe null
                secondResult shouldBe null
            }
        }

        "NotNull with three values" should {

            "give access to the block when no value is null" {

                var firstResult: String? = null
                var secondResult: String? = null
                var thirdResult: String? = null

                notNull(FIRST_VALUE, SECOND_VALUE, THIRD_VALUE) { first, second, third ->
                    firstResult = first
                    secondResult = second
                    thirdResult = third
                }

                firstResult shouldBe FIRST_VALUE
                secondResult shouldBe SECOND_VALUE
                thirdResult shouldBe THIRD_VALUE
            }

            "prevent access to the block when a value is null" {

                var firstResult: String? = null
                var secondResult: String? = null
                var thirdResult: String? = null

                notNull<String?, String?, String?, Unit>(FIRST_VALUE, SECOND_VALUE, null) { first, second, third ->
                    firstResult = first
                    secondResult = second
                    thirdResult = third
                }

                firstResult shouldBe null
                secondResult shouldBe null
                thirdResult shouldBe null
            }
        }

        "NotNull with four values" should {

            "give access to the block when no value is null" {

                var firstResult: String? = null
                var secondResult: String? = null
                var thirdResult: String? = null
                var fourthResult: String? = null

                notNull(
                        FIRST_VALUE,
                        SECOND_VALUE,
                        THIRD_VALUE,
                        FOURTH_VALUE,
                ) { first, second, third, fourth ->
                    firstResult = first
                    secondResult = second
                    thirdResult = third
                    fourthResult = fourth
                }

                firstResult shouldBe FIRST_VALUE
                secondResult shouldBe SECOND_VALUE
                thirdResult shouldBe THIRD_VALUE
                fourthResult shouldBe FOURTH_VALUE
            }

            "prevent access to the block when a value is null" {

                var firstResult: String? = null
                var secondResult: String? = null
                var thirdResult: String? = null
                var fourthResult: String? = null

                notNull<String?, String?, String?, String?, Unit>(
                        FIRST_VALUE,
                        SECOND_VALUE,
                        THIRD_VALUE,
                        null,
                ) { first, second, third, fourth ->
                    firstResult = first
                    secondResult = second
                    thirdResult = third
                    fourthResult = fourth
                }

                firstResult shouldBe null
                secondResult shouldBe null
                thirdResult shouldBe null
                fourthResult shouldBe null
            }
        }

        "NotNull with five values" should {

            "give access to the block when no value is null" {

                var firstResult: String? = null
                var secondResult: String? = null
                var thirdResult: String? = null
                var fourthResult: String? = null
                var fifthResult: String? = null

                notNull(
                        FIRST_VALUE,
                        SECOND_VALUE,
                        THIRD_VALUE,
                        FOURTH_VALUE,
                        FIFTH_VALUE,
                ) { first, second, third, fourth, fifth ->
                    firstResult = first
                    secondResult = second
                    thirdResult = third
                    fourthResult = fourth
                    fifthResult = fifth
                }

                firstResult shouldBe FIRST_VALUE
                secondResult shouldBe SECOND_VALUE
                thirdResult shouldBe THIRD_VALUE
                fourthResult shouldBe FOURTH_VALUE
                fifthResult shouldBe FIFTH_VALUE
            }

            "prevent access to the block when a value is null" {

                var firstResult: String? = null
                var secondResult: String? = null
                var thirdResult: String? = null
                var fourthResult: String? = null
                var fifthResult: String? = null

                notNull<String?, String?, String?, String?, String?, Unit>(
                        FIRST_VALUE,
                        SECOND_VALUE,
                        THIRD_VALUE,
                        FOURTH_VALUE,
                        null,
                ) { first, second, third, fourth, fifth ->
                    firstResult = first
                    secondResult = second
                    thirdResult = third
                    fourthResult = fourth
                    fifthResult = fifth
                }

                firstResult shouldBe null
                secondResult shouldBe null
                thirdResult shouldBe null
                fourthResult shouldBe null
                fifthResult shouldBe null
            }
        }

        "NotNull with six values" should {

            "give access to the block when no value is null" {

                var firstResult: String? = null
                var secondResult: String? = null
                var thirdResult: String? = null
                var fourthResult: String? = null
                var fifthResult: String? = null
                var sixthResult: String? = null

                notNull(
                        FIRST_VALUE,
                        SECOND_VALUE,
                        THIRD_VALUE,
                        FOURTH_VALUE,
                        FIFTH_VALUE,
                        SIXTH_VALUE,
                ) { first, second, third, fourth, fifth, sixth ->
                    firstResult = first
                    secondResult = second
                    thirdResult = third
                    fourthResult = fourth
                    fifthResult = fifth
                    sixthResult = sixth
                }

                firstResult shouldBe FIRST_VALUE
                secondResult shouldBe SECOND_VALUE
                thirdResult shouldBe THIRD_VALUE
                fourthResult shouldBe FOURTH_VALUE
                fifthResult shouldBe FIFTH_VALUE
                sixthResult shouldBe SIXTH_VALUE
            }

            "prevent access to the block when a value is null" {

                var firstResult: String? = null
                var secondResult: String? = null
                var thirdResult: String? = null
                var fourthResult: String? = null
                var fifthResult: String? = null
                var sixthResult: String? = null

                notNull<String?, String?, String?, String?, String?, String?, Unit>(
                        FIRST_VALUE,
                        SECOND_VALUE,
                        THIRD_VALUE,
                        FOURTH_VALUE,
                        FIFTH_VALUE,
                        null,
                ) { first, second, third, fourth, fifth, sixth ->
                    firstResult = first
                    secondResult = second
                    thirdResult = third
                    fourthResult = fourth
                    fifthResult = fifth
                    sixthResult = sixth
                }

                firstResult shouldBe null
                secondResult shouldBe null
                thirdResult shouldBe null
                fourthResult shouldBe null
                fifthResult shouldBe null
                sixthResult shouldBe null
            }
        }

        "NotNull with seven values" should {

            "give access to the block when no value is null" {

                var firstResult: String? = null
                var secondResult: String? = null
                var thirdResult: String? = null
                var fourthResult: String? = null
                var fifthResult: String? = null
                var sixthResult: String? = null
                var seventhResult: String? = null

                notNull(
                        FIRST_VALUE,
                        SECOND_VALUE,
                        THIRD_VALUE,
                        FOURTH_VALUE,
                        FIFTH_VALUE,
                        SIXTH_VALUE,
                        SEVENTH_VALUE,
                ) { first, second, third, fourth, fifth, sixth, seventh ->
                    firstResult = first
                    secondResult = second
                    thirdResult = third
                    fourthResult = fourth
                    fifthResult = fifth
                    sixthResult = sixth
                    seventhResult = seventh
                }

                firstResult shouldBe FIRST_VALUE
                secondResult shouldBe SECOND_VALUE
                thirdResult shouldBe THIRD_VALUE
                fourthResult shouldBe FOURTH_VALUE
                fifthResult shouldBe FIFTH_VALUE
                sixthResult shouldBe SIXTH_VALUE
                seventhResult shouldBe SEVENTH_VALUE
            }

            "prevent access to the block when a value is null" {

                var firstResult: String? = null
                var secondResult: String? = null
                var thirdResult: String? = null
                var fourthResult: String? = null
                var fifthResult: String? = null
                var sixthResult: String? = null
                var seventhResult: String? = null

                notNull<String?, String?, String?, String?, String?, String?, String?, Unit>(
                        FIRST_VALUE,
                        SECOND_VALUE,
                        THIRD_VALUE,
                        FOURTH_VALUE,
                        FIFTH_VALUE,
                        SIXTH_VALUE,
                        null,
                ) { first, second, third, fourth, fifth, sixth, seventh ->
                    firstResult = first
                    secondResult = second
                    thirdResult = third
                    fourthResult = fourth
                    fifthResult = fifth
                    sixthResult = sixth
                    seventhResult = seventh
                }

                firstResult shouldBe null
                secondResult shouldBe null
                thirdResult shouldBe null
                fourthResult shouldBe null
                fifthResult shouldBe null
                sixthResult shouldBe null
                seventhResult shouldBe null
            }
        }
    }

    private companion object {

        const val FIRST_VALUE = "first"
        const val SECOND_VALUE = "second"
        const val THIRD_VALUE = "third"
        const val FOURTH_VALUE = "fourth"
        const val FIFTH_VALUE = "fifth"
        const val SIXTH_VALUE = "sixth"
        const val SEVENTH_VALUE = "seventh"
    }
}
