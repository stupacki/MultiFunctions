package io.multifunctions

import kotlin.test.Test
import kotlin.test.assertEquals
import io.multifunctions.models.*

internal class MultiForEachTest {

    @Test
    fun `produce a correct mapping from Pair`() {
        val testData = listOf(Pair("one", "two"))

        testData.forEach { one, two ->
            assertEquals("one", one)
            assertEquals("two", two)
        }
    }

    @Test
    fun `produce a correct mapping from Triple`() {
        val testData = listOf(Triple("one", "two", "three"))

        testData.forEach { one, two, three ->
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
        }
    }

    @Test
    fun `produce a correct mapping from Quad`() {
        val testData = listOf(Quad("one", "two", "three", "four"))

        testData.forEach { one, two, three, four ->
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            assertEquals("four", four)
        }
    }

    @Test
    fun `produce a correct mapping from Penta`() {
        val testData = listOf(Penta("one", "two", "three", "four", "five"))

        testData.forEach { one, two, three, four, five ->
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            assertEquals("four", four)
            assertEquals("five", five)
        }
    }

    @Test
    fun `produce a correct mapping from Hexa`() {
        val testData = listOf(Hexa("one", "two", "three", "four", "five", "six"))

        testData.forEach { one, two, three, four, five, six ->
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            assertEquals("four", four)
            assertEquals("five", five)
            assertEquals("six", six)
        }
    }

    @Test
    fun `produce a correct mapping from Hepta`() {
        val testData = listOf(Hepta("one", "two", "three", "four", "five", "six", "seven"))

        testData.forEach { one, two, three, four, five, six, seven ->
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            assertEquals("four", four)
            assertEquals("five", five)
            assertEquals("six", six)
            assertEquals("seven", seven)
        }
    }

    @Test
    fun `handle null values`() {
        val testData = listOf(Pair("one", null))

        testData.forEach { one, two ->
            assertEquals("one", one)
            assertEquals(null, two)
        }
    }
}