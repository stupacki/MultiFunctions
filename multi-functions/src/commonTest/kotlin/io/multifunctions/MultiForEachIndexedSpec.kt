package io.multifunctions

import kotlin.test.Test
import kotlin.test.assertEquals
import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

internal class MultiForEachIndexedTest {

    @Test
    fun `produce a correct mapping from Pair`() {
        val testData = listOf(Pair("one", "two"))

        testData.forEachIndexed { index, (one, two) ->
            assertEquals(0, index)
            assertEquals("one", one)
            assertEquals("two", two)
        }
    }

    @Test
    fun `produce a correct mapping from Triple`() {
        val testData = listOf(Triple("one", "two", "three"))

        testData.forEachIndexed { index, (one, two, three) ->
            assertEquals(0, index)
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
        }
    }

    @Test
    fun `produce a correct mapping from Quad`() {
        val testData = listOf(Quad("one", "two", "three", "four"))

        testData.forEachIndexed { index, (one, two, three, four) ->
            assertEquals(0, index)
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            assertEquals("four", four)
        }
    }

    @Test
    fun `produce a correct mapping from Penta`() {
        val testData = listOf(Penta("one", "two", "three", "four", "five"))

        testData.forEachIndexed { index, (one, two, three, four, five) ->
            assertEquals(0, index)
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

        testData.forEachIndexed { index, (one, two, three, four, five, six) ->
            assertEquals(0, index)
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

        testData.forEachIndexed { index, (one, two, three, four, five, six, seven) ->
            assertEquals(0, index)
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

        testData.forEachIndexed { _, (one, two) ->
            assertEquals("one", one)
            assertEquals(null, two)
        }
    }
}
