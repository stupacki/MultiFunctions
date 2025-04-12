package io.multifunctions

import kotlin.test.Test
import kotlin.test.assertEquals
import io.multifunctions.models.*

internal class MultiMapNotNullTest {

    @Test
    fun `produce a correct mapping from Pair`() {
        val testData = listOf(Pair("one", "two"))

        val result = testData.mapNotNull { one, two ->
            assertEquals("one", one)
            assertEquals("two", two)
            Pair(one, two)
        }

        assertEquals(testData, result)
    }

    @Test
    fun `produce a correct mapping from Triple`() {
        val testData = listOf(Triple("one", "two", "three"))

        val result = testData.mapNotNull { one, two, three ->
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

        val result = testData.mapNotNull { one, two, three, four ->
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

        val result = testData.mapNotNull { one, two, three, four, five ->
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

        val result = testData.mapNotNull { one, two, three, four, five, six ->
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

        val result = testData.mapNotNull { one, two, three, four, five, six, seven ->
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
    fun `sort out null elements`() {
        val testData = listOf(
            Pair(null, null),
            Pair("one", "two"),
            Pair("one", null),
            Pair(null, "two")
        )

        val result = testData.mapNotNull { one, two ->
            Pair(one, two)
        }

        assertEquals(
            listOf(
                Pair("one", "two"),
                Pair("one", null),
                Pair(null, "two")
            ),
            result
        )
    }

    @Test
    fun `handle null values`() {
        val testData = listOf(
            Pair("one", null),
            Pair("three", "four"),
            Pair("fife", "six"),
            Pair(null, null),
            Pair("ten", "eleven")
        )
        val expected = listOf(
            Pair("one", null),
            Pair("three", "four"),
            Pair("fife", "six"),
            Pair("ten", "eleven")
        )

        val result = testData.mapNotNull { one, two ->
            Pair(one, two)
        }

        assertEquals(expected, result)
    }
}