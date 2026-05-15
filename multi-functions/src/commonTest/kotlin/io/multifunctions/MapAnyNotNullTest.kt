package io.multifunctions

import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.fail

internal class MapAnyNotNullTest {

    @Test
    fun `produce a correct mapping from Pair`() {
        val testData = listOf(Pair("one", "two"))

        val result = testData.mapAnyNotNull { one, two ->
            assertEquals("one", one)
            assertEquals("two", two)
            Pair(one, two)
        }

        assertEquals(testData, result)
    }

    @Test
    fun `produce a correct mapping from Triple`() {
        val testData = listOf(Triple("one", "two", "three"))

        val result = testData.mapAnyNotNull { one, two, three ->
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

        val result = testData.mapAnyNotNull { one, two, three, four ->
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

        val result = testData.mapAnyNotNull { one, two, three, four, five ->
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

        val result = testData.mapAnyNotNull { one, two, three, four, five, six ->
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

        val result = testData.mapAnyNotNull { one, two, three, four, five, six, seven ->
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
    fun `skip tuples where all values are null`() {
        val testData = listOf(
            Pair(null, null),
            Pair("one", "two"),
            Pair("one", null),
            Pair(null, "two")
        )

        val result = testData.mapAnyNotNull { one, two ->
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
    fun `does not call transform for all-null Pair`() {
        val testData = listOf(Pair<String?, String?>(null, null))

        val result = testData.mapAnyNotNull { _, _ ->
            fail("Transform should not be called for an all-null tuple")
        }

        assertEquals(emptyList(), result)
    }

    @Test
    fun `does not call transform for all-null Hepta`() {
        val testData = listOf(Hepta<String?, String?, String?, String?, String?, String?, String?>(
            null,
            null,
            null,
            null,
            null,
            null,
            null
        ))

        val result = testData.mapAnyNotNull { _, _, _, _, _, _, _ ->
            fail("Transform should not be called for an all-null tuple")
        }

        assertEquals(emptyList(), result)
    }

    @Test
    fun `sort out null transform results`() {
        val testData = listOf(
            Pair("one", null),
            Pair("three", "four")
        )

        val result = testData.mapAnyNotNull { one, two ->
            if (two == null) null else Pair(one, two)
        }

        assertEquals(listOf(Pair("three", "four")), result)
    }
}
