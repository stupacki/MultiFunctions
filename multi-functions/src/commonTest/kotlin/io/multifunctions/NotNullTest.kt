package io.multifunctions

import kotlin.test.Test
import kotlin.test.assertEquals

internal class NotNullTest {

    @Test
    fun `NotNull with two values - give access to the block when no value is null`() {
        var firstResult: String? = null
        var secondResult: String? = null

        notNull(FIRST_VALUE, SECOND_VALUE) { first, second ->
            firstResult = first
            secondResult = second
        }

        assertEquals(FIRST_VALUE, firstResult)
        assertEquals(SECOND_VALUE, secondResult)
    }

    @Test
    fun `NotNull with two values - prevent access to the block when a value is null`() {
        var firstResult: String? = null
        var secondResult: String? = null

        notNull<String?, String?, Unit>(FIRST_VALUE, null) { first, second ->
            firstResult = first
            secondResult = second
        }

        assertEquals(null, firstResult)
        assertEquals(null, secondResult)
    }

    @Test
    fun `NotNull with three values - give access to the block when no value is null`() {
        var firstResult: String? = null
        var secondResult: String? = null
        var thirdResult: String? = null

        notNull(FIRST_VALUE, SECOND_VALUE, THIRD_VALUE) { first, second, third ->
            firstResult = first
            secondResult = second
            thirdResult = third
        }

        assertEquals(FIRST_VALUE, firstResult)
        assertEquals(SECOND_VALUE, secondResult)
        assertEquals(THIRD_VALUE, thirdResult)
    }

    @Test
    fun `NotNull with three values - prevent access to the block when a value is null`() {
        var firstResult: String? = null
        var secondResult: String? = null
        var thirdResult: String? = null

        notNull<String?, String?, String?, Unit>(FIRST_VALUE, SECOND_VALUE, null) { first, second, third ->
            firstResult = first
            secondResult = second
            thirdResult = third
        }

        assertEquals(null, firstResult)
        assertEquals(null, secondResult)
        assertEquals(null, thirdResult)
    }

    @Test
    fun `NotNull with four values - give access to the block when no value is null`() {
        var firstResult: String? = null
        var secondResult: String? = null
        var thirdResult: String? = null
        var fourthResult: String? = null

        notNull(FIRST_VALUE, SECOND_VALUE, THIRD_VALUE, FOURTH_VALUE) { first, second, third, fourth ->
            firstResult = first
            secondResult = second
            thirdResult = third
            fourthResult = fourth
        }

        assertEquals(FIRST_VALUE, firstResult)
        assertEquals(SECOND_VALUE, secondResult)
        assertEquals(THIRD_VALUE, thirdResult)
        assertEquals(FOURTH_VALUE, fourthResult)
    }

    @Test
    fun `NotNull with four values - prevent access to the block when a value is null`() {
        var firstResult: String? = null
        var secondResult: String? = null
        var thirdResult: String? = null
        var fourthResult: String? = null

        notNull<String?, String?, String?, String?, Unit>(FIRST_VALUE, SECOND_VALUE, THIRD_VALUE, null) { first, second, third, fourth ->
            firstResult = first
            secondResult = second
            thirdResult = third
            fourthResult = fourth
        }

        assertEquals(null, firstResult)
        assertEquals(null, secondResult)
        assertEquals(null, thirdResult)
        assertEquals(null, fourthResult)
    }

    @Test
    fun `NotNull with five values - give access to the block when no value is null`() {
        var firstResult: String? = null
        var secondResult: String? = null
        var thirdResult: String? = null
        var fourthResult: String? = null
        var fifthResult: String? = null

        notNull(FIRST_VALUE, SECOND_VALUE, THIRD_VALUE, FOURTH_VALUE, FIFTH_VALUE) { first, second, third, fourth, fifth ->
            firstResult = first
            secondResult = second
            thirdResult = third
            fourthResult = fourth
            fifthResult = fifth
        }

        assertEquals(FIRST_VALUE, firstResult)
        assertEquals(SECOND_VALUE, secondResult)
        assertEquals(THIRD_VALUE, thirdResult)
        assertEquals(FOURTH_VALUE, fourthResult)
        assertEquals(FIFTH_VALUE, fifthResult)
    }

    @Test
    fun `NotNull with five values - prevent access to the block when a value is null`() {
        var firstResult: String? = null
        var secondResult: String? = null
        var thirdResult: String? = null
        var fourthResult: String? = null
        var fifthResult: String? = null

        notNull<String?, String?, String?, String?, String?, Unit>(FIRST_VALUE, SECOND_VALUE, THIRD_VALUE, FOURTH_VALUE, null) { first, second, third, fourth, fifth ->
            firstResult = first
            secondResult = second
            thirdResult = third
            fourthResult = fourth
            fifthResult = fifth
        }

        assertEquals(null, firstResult)
        assertEquals(null, secondResult)
        assertEquals(null, thirdResult)
        assertEquals(null, fourthResult)
        assertEquals(null, fifthResult)
    }

    @Test
    fun `NotNull with six values - give access to the block when no value is null`() {
        var firstResult: String? = null
        var secondResult: String? = null
        var thirdResult: String? = null
        var fourthResult: String? = null
        var fifthResult: String? = null
        var sixthResult: String? = null

        notNull(FIRST_VALUE, SECOND_VALUE, THIRD_VALUE, FOURTH_VALUE, FIFTH_VALUE, SIXTH_VALUE) { first, second, third, fourth, fifth, sixth ->
            firstResult = first
            secondResult = second
            thirdResult = third
            fourthResult = fourth
            fifthResult = fifth
            sixthResult = sixth
        }

        assertEquals(FIRST_VALUE, firstResult)
        assertEquals(SECOND_VALUE, secondResult)
        assertEquals(THIRD_VALUE, thirdResult)
        assertEquals(FOURTH_VALUE, fourthResult)
        assertEquals(FIFTH_VALUE, fifthResult)
        assertEquals(SIXTH_VALUE, sixthResult)
    }

    @Test
    fun `NotNull with six values - prevent access to the block when a value is null`() {
        var firstResult: String? = null
        var secondResult: String? = null
        var thirdResult: String? = null
        var fourthResult: String? = null
        var fifthResult: String? = null
        var sixthResult: String? = null

        notNull<String?, String?, String?, String?, String?, String?, Unit>(FIRST_VALUE, SECOND_VALUE, THIRD_VALUE, FOURTH_VALUE, FIFTH_VALUE, null) { first, second, third, fourth, fifth, sixth ->
            firstResult = first
            secondResult = second
            thirdResult = third
            fourthResult = fourth
            fifthResult = fifth
            sixthResult = sixth
        }

        assertEquals(null, firstResult)
        assertEquals(null, secondResult)
        assertEquals(null, thirdResult)
        assertEquals(null, fourthResult)
        assertEquals(null, fifthResult)
        assertEquals(null, sixthResult)
    }

    @Test
    fun `NotNull with seven values - give access to the block when no value is null`() {
        var firstResult: String? = null
        var secondResult: String? = null
        var thirdResult: String? = null
        var fourthResult: String? = null
        var fifthResult: String? = null
        var sixthResult: String? = null
        var seventhResult: String? = null

        notNull(FIRST_VALUE, SECOND_VALUE, THIRD_VALUE, FOURTH_VALUE, FIFTH_VALUE, SIXTH_VALUE, SEVENTH_VALUE) { first, second, third, fourth, fifth, sixth, seventh ->
            firstResult = first
            secondResult = second
            thirdResult = third
            fourthResult = fourth
            fifthResult = fifth
            sixthResult = sixth
            seventhResult = seventh
        }

        assertEquals(FIRST_VALUE, firstResult)
        assertEquals(SECOND_VALUE, secondResult)
        assertEquals(THIRD_VALUE, thirdResult)
        assertEquals(FOURTH_VALUE, fourthResult)
        assertEquals(FIFTH_VALUE, fifthResult)
        assertEquals(SIXTH_VALUE, sixthResult)
        assertEquals(SEVENTH_VALUE, seventhResult)
    }

    @Test
    fun `NotNull with seven values - prevent access to the block when a value is null`() {
        var firstResult: String? = null
        var secondResult: String? = null
        var thirdResult: String? = null
        var fourthResult: String? = null
        var fifthResult: String? = null
        var sixthResult: String? = null
        var seventhResult: String? = null

        notNull<String?, String?, String?, String?, String?, String?, String?, Unit>(FIRST_VALUE, SECOND_VALUE, THIRD_VALUE, FOURTH_VALUE, FIFTH_VALUE, SIXTH_VALUE, null) { first, second, third, fourth, fifth, sixth, seventh ->
            firstResult = first
            secondResult = second
            thirdResult = third
            fourthResult = fourth
            fifthResult = fifth
            sixthResult = sixth
            seventhResult = seventh
        }

        assertEquals(null, firstResult)
        assertEquals(null, secondResult)
        assertEquals(null, thirdResult)
        assertEquals(null, fourthResult)
        assertEquals(null, fifthResult)
        assertEquals(null, sixthResult)
        assertEquals(null, seventhResult)
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