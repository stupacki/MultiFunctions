package io.multifunctions

import io.multifunctions.models.Hepta
import kotlin.test.Test
import kotlin.test.assertEquals

internal class SequenceFilterOnEachFoldTest {

    @Test
    fun `filter sequence unpacks pair values lazily`() {
        val source = sequenceOf(Pair("one", 1), Pair("two", null))
        var calls = 0

        val result = source.filter { _, second ->
            calls += 1
            second != null
        }

        assertEquals(0, calls)
        assertEquals(listOf(Pair("one", 1)), result.toList())
        assertEquals(2, calls)
    }

    @Test
    fun `filter sequence supports hepta values`() {
        val source = sequenceOf(
            Hepta(1, 2, 3, 4, 5, 6, 7),
            Hepta(1, 2, 3, 4, 5, 6, null)
        )

        val result = source.filter { first, second, third, fourth, fifth, sixth, seventh ->
            listOf(first, second, third, fourth, fifth, sixth, seventh).all { it != null }
        }

        assertEquals(listOf(Hepta(1, 2, 3, 4, 5, 6, 7)), result.toList())
    }

    @Test
    fun `onEach sequence unpacks pair values lazily`() {
        val seen = mutableListOf<String>()

        val result = sequenceOf(Pair("one", 1), Pair("two", 2)).onEach { first, second ->
            seen += "$first:$second"
        }

        assertEquals(emptyList(), seen)
        assertEquals(listOf(Pair("one", 1), Pair("two", 2)), result.toList())
        assertEquals(listOf("one:1", "two:2"), seen)
    }

    @Test
    fun `onEach sequence supports hepta values`() {
        val seen = mutableListOf<String?>()

        sequenceOf(Hepta("a", "b", "c", "d", "e", "f", "g"))
            .onEach { first, second, third, fourth, fifth, sixth, seventh ->
                seen += listOf(first, second, third, fourth, fifth, sixth, seventh)
            }
            .toList()

        assertEquals(listOf<String?>("a", "b", "c", "d", "e", "f", "g"), seen)
    }

    @Test
    fun `fold sequence unpacks pair values`() {
        val result = sequenceOf(Pair(1, 2), Pair(3, 4)).fold(0) { acc, first, second ->
            acc + first!! + second!!
        }

        assertEquals(10, result)
    }

    @Test
    fun `fold sequence supports hepta values`() {
        val result = sequenceOf(Hepta(1, 2, 3, 4, 5, 6, 7))
            .fold(0) { acc, first, second, third, fourth, fifth, sixth, seventh ->
                acc + first!! + second!! + third!! + fourth!! + fifth!! + sixth!! + seventh!!
            }

        assertEquals(28, result)
    }
}
