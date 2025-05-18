package io.multifunctions

import kotlin.test.Test
import kotlin.test.assertEquals
import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

internal class MultiFlatMapTest {

    @Test
    fun `produce a correct mapping from Pair`() {
        val testData = listOf(Pair("one", "two"))

        val result = testData.flatMap { one, two ->
            assertEquals("one", one)
            assertEquals("two", two)

            listOf(Pair(one, two))
        }

        assertEquals(testData, result)
    }

    @Test
    fun `produce a correct mapping from Triple`() {
        val testData = listOf(Triple("one", "two", "three"))

        val result = testData.flatMap { one, two, three ->
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)

            listOf(Triple(one, two, three))
        }

        assertEquals(testData, result)
    }

    @Test
    fun `produce a correct mapping from Quad`() {
        val testData = listOf(Quad("one", "two", "three", "four"))

        val result = testData.flatMap { one, two, three, four ->
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            assertEquals("four", four)

            listOf(Quad(one, two, three, four))
        }

        assertEquals(testData, result)
    }

    @Test
    fun `produce a correct mapping from Penta`() {
        val testData = listOf(Penta("one", "two", "three", "four", "five"))

        val result = testData.flatMap { one, two, three, four, five ->
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            assertEquals("four", four)
            assertEquals("five", five)

            listOf(Penta(one, two, three, four, five))
        }

        assertEquals(testData, result)
    }

    @Test
    fun `produce a correct mapping from Hexa`() {
        val testData = listOf(Hexa("one", "two", "three", "four", "five", "six"))

        val result = testData.flatMap { one, two, three, four, five, six ->
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            assertEquals("four", four)
            assertEquals("five", five)
            assertEquals("six", six)

            listOf(Hexa(one, two, three, four, five, six))
        }

        assertEquals(testData, result)
    }

    @Test
    fun `produce a correct mapping from Hepta`() {
        val testData = listOf(Hepta("one", "two", "three", "four", "five", "six", "seven"))

        val result = testData.flatMap { one, two, three, four, five, six, seven ->
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            assertEquals("four", four)
            assertEquals("five", five)
            assertEquals("six", six)
            assertEquals("seven", seven)

            listOf(Hepta(one, two, three, four, five, six, seven))
        }

        assertEquals(testData, result)
    }

    @Test
    fun `handle null values`() {
        val testData = listOf(Pair("one", null))
        val expected = listOf(Pair("one", null))

        val result = testData.flatMap { one, two ->
            assertEquals("one", one)
            assertEquals(null, two)

            listOf(Pair(one, two))
        }

        assertEquals(expected, result)
    }
}
