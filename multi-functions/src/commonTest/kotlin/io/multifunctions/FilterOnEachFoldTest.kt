package io.multifunctions

import io.multifunctions.models.Hepta
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame

internal class FilterOnEachFoldTest {

    @Test
    fun `filter unpacks pair values`() {
        val testData = listOf(
            Pair("one", 1),
            Pair("two", null),
            Pair(null, 3)
        )

        val result = testData.filter { first, second ->
            first != null && second != null
        }

        assertEquals(listOf(Pair("one", 1)), result)
    }

    @Test
    fun `filter supports hepta values`() {
        val testData = listOf(
            Hepta(1, 2, 3, 4, 5, 6, 7),
            Hepta(1, 2, 3, 4, 5, 6, null)
        )

        val result = testData.filter { first, second, third, fourth, fifth, sixth, seventh ->
            listOf(first, second, third, fourth, fifth, sixth, seventh).all { it != null }
        }

        assertEquals(listOf(Hepta(1, 2, 3, 4, 5, 6, 7)), result)
    }

    @Test
    fun `onEach unpacks pair values and returns the same iterable`() {
        val testData = listOf(Pair("one", 1), Pair("two", 2))
        val seen = mutableListOf<String>()

        val result = testData.onEach { first, second ->
            seen += "$first:$second"
        }

        assertSame(testData, result)
        assertEquals(listOf("one:1", "two:2"), seen)
    }

    @Test
    fun `onEach supports hepta values`() {
        val testData = listOf(Hepta("a", "b", "c", "d", "e", "f", "g"))
        val seen = mutableListOf<String?>()

        testData.onEach { first, second, third, fourth, fifth, sixth, seventh ->
            seen += listOf(first, second, third, fourth, fifth, sixth, seventh)
        }

        assertEquals(listOf<String?>("a", "b", "c", "d", "e", "f", "g"), seen)
    }

    @Test
    fun `fold unpacks pair values`() {
        val testData = listOf(Pair(1, 2), Pair(3, 4))

        val result = testData.fold(0) { acc, first, second ->
            acc + first!! + second!!
        }

        assertEquals(10, result)
    }

    @Test
    fun `fold supports hepta values`() {
        val testData = listOf(Hepta(1, 2, 3, 4, 5, 6, 7))

        val result = testData.fold(0) { acc, first, second, third, fourth, fifth, sixth, seventh ->
            acc + first!! + second!! + third!! + fourth!! + fifth!! + sixth!! + seventh!!
        }

        assertEquals(28, result)
    }
}
