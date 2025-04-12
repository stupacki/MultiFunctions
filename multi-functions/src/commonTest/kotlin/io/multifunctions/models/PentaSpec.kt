package io.multifunctions.models

import kotlin.test.Test
import kotlin.test.assertEquals

internal class PentaTest {

    @Test
    fun `Penta should be initialized`() {
        val testData = Penta("one", "two", "three", "four", "five")
        verifyPenta(testData, "one", "two", "three", "four", "five")
    }

    @Test
    fun `Penta should handle null values`() {
        val testData = Penta<String?, String?, String?, String?, String?>(
            null, null, null, null, null
        )
        verifyPenta(testData, null, null, null, null, null)
    }

    @Test
    fun `Penta should handle toString`() {
        val actual = Penta("one", "two", "three", "four", "five")
        val expected = "Penta(first=one, second=two, third=three, fourth=four, fifth=five)"
        assertEquals(expected, actual.toString())
    }

    @Test
    fun `Penta should handle copy`() {
        val actual = Penta("one", "two", "three", "four", "five")
        assertEquals(actual, actual.copy())
    }

    @Test
    fun `Penta should handle toList`() {
        val actual = Penta("one", "two", "three", "four", "fife")
        val expected = listOf("one", "two", "three", "four", "fife")
        assertEquals(expected, actual.toList())
    }

    private fun <T> verifyPenta(
        penta: Penta<T, T, T, T, T>,
        first: T?, second: T?, third: T?, fourth: T?, fifth: T?
    ) {
        assertEquals(first, penta.first)
        assertEquals(second, penta.second)
        assertEquals(third, penta.third)
        assertEquals(fourth, penta.fourth)
        assertEquals(fifth, penta.fifth)
        assertEquals(penta, Penta(penta.first, penta.second, penta.third, penta.fourth, penta.fifth))
    }
}