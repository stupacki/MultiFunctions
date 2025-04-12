package io.multifunctions.models

import kotlin.test.Test
import kotlin.test.assertEquals

internal class HeptaTest {

    @Test
    fun `Hepta should be initialized`() {
        val testData = Hepta("one", "two", "three", "four", "five", "six", "seven")
        verifyHepta(testData, "one", "two", "three", "four", "five", "six", "seven")
    }

    @Test
    fun `Hepta should handle null values`() {
        val testData = Hepta<String?, String?, String?, String?, String?, String?, String?>(
            null, null, null, null, null, null, null
        )
        verifyHepta(testData, null, null, null, null, null, null, null)
    }

    @Test
    fun `Hepta should handle toString`() {
        val actual = Hepta("one", "two", "three", "four", "five", "six", "seven")
        val expected = "Hepta(first=one, second=two, third=three, fourth=four, fifth=five, sixth=six, seventh=seven)"
        assertEquals(expected, actual.toString())
    }

    @Test
    fun `Hepta should handle copy`() {
        val actual = Hepta("one", "two", "three", "four", "five", "six", "seven")
        assertEquals(actual, actual.copy())
    }

    @Test
    fun `Hepta should handle toList`() {
        val actual = Hepta("one", "two", "three", "four", "fife", "six", "seven")
        val expected = listOf("one", "two", "three", "four", "fife", "six", "seven")
        assertEquals(expected, actual.toList())
    }

    private fun <T> verifyHepta(
        hepta: Hepta<T, T, T, T, T, T, T>,
        first: T?, second: T?, third: T?, fourth: T?, fifth: T?, sixth: T?, seventh: T?
    ) {
        assertEquals(first, hepta.first)
        assertEquals(second, hepta.second)
        assertEquals(third, hepta.third)
        assertEquals(fourth, hepta.fourth)
        assertEquals(fifth, hepta.fifth)
        assertEquals(sixth, hepta.sixth)
        assertEquals(seventh, hepta.seventh)
        assertEquals(hepta, Hepta(hepta.first, hepta.second, hepta.third, hepta.fourth, hepta.fifth, hepta.sixth, hepta.seventh))
    }
}