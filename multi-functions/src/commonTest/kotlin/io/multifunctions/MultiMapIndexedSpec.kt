package io.multifunctions

import kotlin.test.Test
import kotlin.test.assertEquals
import io.multifunctions.models.*

internal class MultiMapIndexedTest {

    @Test
    fun `produce a correct mapping from Pair`() {
        val testData = listOf(Pair("one", "two"))

        val result = testData.mapIndexed { index, (one, two) ->
            assertEquals(0, index)
            assertEquals("one", one)
            assertEquals("two", two)
            Pair(one, two)
        }

        assertEquals(testData, result)
    }

    @Test
    fun `produce a correct mapping from Triple`() {
        val testData = listOf(Triple("one", "two", "three"))

        val result = testData.mapIndexed { index, (one, two, three) ->
            assertEquals(0, index)
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            Triple(one, two, three)
        }

        assertEquals(testData, result)
    }

    @Test
    fun `produce a correct mapping from Quad`() {
        val testData = listOf(Quad("one", "two", "three", "four"))

        val result = testData.mapIndexed { index, (one, two, three, four) ->
            assertEquals(0, index)
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            assertEquals("four", four)
            Quad(one, two, three, four)
        }

        assertEquals(testData, result)
    }

    @Test
    fun `produce a correct mapping from Penta`() {
        val testData = listOf(Penta("one", "two", "three", "four", "five"))

        val result = testData.mapIndexed { index, (one, two, three, four, five) ->
            assertEquals(0, index)
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            assertEquals("four", four)
            assertEquals("five", five)
            Penta(one, two, three, four, five)
        }

        assertEquals(testData, result)
    }

    @Test
    fun `produce a correct mapping from Hexa`() {
        val testData = listOf(Hexa("one", "two", "three", "four", "five", "six"))

        val result = testData.mapIndexed { index, (one, two, three, four, five, six) ->
            assertEquals(0, index)
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            assertEquals("four", four)
            assertEquals("five", five)
            assertEquals("six", six)
            Hexa(one, two, three, four, five, six)
        }

        assertEquals(testData, result)
    }

    @Test
    fun `produce a correct mapping from Hepta`() {
        val testData = listOf(Hepta("one", "two", "three", "four", "five", "six", "seven"))

        val result = testData.mapIndexed { index, (one, two, three, four, five, six, seven) ->
            assertEquals(0, index)
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            assertEquals("four", four)
            assertEquals("five", five)
            assertEquals("six", six)
            assertEquals("seven", seven)
            Hepta(one, two, three, four, five, six, seven)
        }

        assertEquals(testData, result)
    }

    @Test
    fun `handle null values`() {
        val testData = listOf(Pair<String?, String?>("one", null))
        val expected = listOf(Triple(0, "one", null))

        val result = testData.mapIndexed { index, (one, two) ->
            assertEquals("one", one)
            assertEquals(null, two)
            Triple(index, one, two)
        }

        assertEquals(expected, result)
    }
}