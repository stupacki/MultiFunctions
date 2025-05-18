package io.multifunctions

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import io.multifunctions.models.*

internal class MultiLetCheckNullTest {

    @Test
    fun `produce a correct binding from Pair`() {
        val testData = Pair("one", "two")

        val result = testData.letCheckNull { one, two ->
            assertEquals("one", one)
            assertEquals("two", two)
            Pair(one, two)
        }

        assertEquals(testData, result)
    }

    @Test
    fun `produce a correct binding from Triple`() {
        val testData = Triple("one", "two", "three")

        val result = testData.letCheckNull { one, two, three ->
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            Triple(one, two, three)
        }

        assertEquals(testData, result)
    }

    @Test
    fun `produce a correct binding from Quad`() {
        val testData = Quad("one", "two", "three", "four")

        val result = testData.letCheckNull { one, two, three, four ->
            assertEquals("one", one)
            assertEquals("two", two)
            assertEquals("three", three)
            assertEquals("four", four)
            Quad(one, two, three, four)
        }

        assertEquals(testData, result)
    }

    @Test
    fun `produce a correct binding from Penta`() {
        val testData = Penta("one", "two", "three", "four", "five")

        val result = testData.letCheckNull { one, two, three, four, five ->
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
    fun `produce a correct binding from Hexa`() {
        val testData = Hexa("one", "two", "three", "four", "five", "six")

        val result = testData.letCheckNull { one, two, three, four, five, six ->
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
    fun `produce a correct binding from Hepta`() {
        val testData = Hepta("one", "two", "three", "four", "five", "six", "seven")

        val result = testData.letCheckNull { one, two, three, four, five, six, seven ->
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
        val testData = Pair<String?, String?>("one", null)

        val result = testData.letCheckNull { one, two ->
            assertEquals("one", one)
            assertNull(two)
            Pair(one, two)
        }

        assertNull(result)
    }
}