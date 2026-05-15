package io.multifunctions.models

import kotlin.test.Test
import kotlin.test.assertEquals

internal class HexaTest {

    @Test
    fun `Hexa should be initialized`() {
        val testData = Hexa("one", "two", "three", "four", "five", "six")
        verifyHexa(testData, "one", "two", "three", "four", "five", "six")
    }

    @Test
    fun `Hexa should handle null values`() {
        val testData = Hexa<String?, String?, String?, String?, String?, String?>(
            null, null, null, null, null, null
        )
        verifyHexa(testData, null, null, null, null, null, null)
    }

    @Test
    fun `Hexa should handle toString`() {
        val actual = Hexa("one", "two", "three", "four", "five", "six")
        val expected = "Hexa(first=one, second=two, third=three, fourth=four, fifth=five, sixth=six)"
        assertEquals(expected, actual.toString())
    }

    @Test
    fun `Hexa should handle copy`() {
        val actual = Hexa("one", "two", "three", "four", "five", "six")
        assertEquals(actual, actual.copy())
    }

    @Test
    fun `Hexa should handle toList`() {
        val actual = Hexa("one", "two", "three", "four", "fife", "six")
        val expected = listOf("one", "two", "three", "four", "fife", "six")
        assertEquals(expected, actual.toList())
    }

    private fun <T> verifyHexa(
        hexa: Hexa<T, T, T, T, T, T>,
        first: T?, second: T?, third: T?, fourth: T?, fifth: T?, sixth: T?
    ) {
        assertEquals(first, hexa.first)
        assertEquals(second, hexa.second)
        assertEquals(third, hexa.third)
        assertEquals(fourth, hexa.fourth)
        assertEquals(fifth, hexa.fifth)
        assertEquals(sixth, hexa.sixth)
        assertEquals(hexa, Hexa(hexa.first, hexa.second, hexa.third, hexa.fourth, hexa.fifth, hexa.sixth))
    }
}