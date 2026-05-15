package io.multifunctions.models

import kotlin.test.Test
import kotlin.test.assertEquals

internal class QuadTest {

    @Test
    fun `Quad should be initialized with Strings`() {
        val testData = Quad("one", "two", "three", "four")
        verifyQuad(testData, "one", "two", "three", "four")
    }

    @Test
    fun `Quad should handle null values`() {
        val testData = Quad<String?, String?, String?, String?>(null, null, null, null)
        verifyQuad(testData, null, null, null, null)
    }

    @Test
    fun `Quad should handle toString`() {
        val actual = Quad("one", "two", "three", "four")
        val expected = "Quad(first=one, second=two, third=three, fourth=four)"
        assertEquals(expected, actual.toString())
    }

    @Test
    fun `Quad should handle copy`() {
        val actual = Quad("one", "two", "three", "four")
        assertEquals(actual, actual.copy())
    }

    @Test
    fun `Quad should handle toList`() {
        val actual = Quad("one", "two", "three", "four")
        val expected = listOf("one", "two", "three", "four")
        assertEquals(expected, actual.toList())
    }

    private fun <T> verifyQuad(
        quad: Quad<T, T, T, T>,
        first: T?, second: T?, third: T?, fourth: T?
    ) {
        assertEquals(first, quad.first)
        assertEquals(second, quad.second)
        assertEquals(third, quad.third)
        assertEquals(fourth, quad.fourth)
        assertEquals(quad, Quad(quad.first, quad.second, quad.third, quad.fourth))
    }
}