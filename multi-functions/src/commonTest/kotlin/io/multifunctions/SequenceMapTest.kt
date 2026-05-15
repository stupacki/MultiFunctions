package io.multifunctions

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SequenceMapTest {

    @Test
    fun `map tuple sequence lazily`() {
        val source = sequenceOf(Pair(1, 2), Pair(3, 4))
        var calls = 0

        val result = source.map { first, second ->
            calls += 1
            first!! + second!!
        }

        assertEquals(0, calls)
        assertEquals(listOf(3, 7), result.toList())
        assertEquals(2, calls)
    }

    @Test
    fun `mapNotNull tuple sequence filters null transform results`() {
        val source = sequenceOf(
            Pair<String?, String?>(null, null),
            Pair("one", "two")
        )

        val result = source.mapNotNull { first, second ->
            if (first == null && second == null) null else Pair(first, second)
        }

        assertEquals(listOf(Pair("one", "two")), result.toList())
    }

    @Test
    fun `mapAnyNotNull tuple sequence skips all-null tuples`() {
        val source = sequenceOf(
            Pair<String?, String?>(null, null),
            Pair("one", null),
            Pair(null, "two")
        )

        val result = source.mapAnyNotNull { first, second ->
            Pair(first, second)
        }

        assertEquals(listOf(Pair("one", null), Pair(null, "two")), result.toList())
    }

    @Test
    fun `mapCheckNull tuple sequence skips tuples with any null value`() {
        val source = sequenceOf(
            Pair("one", null),
            Pair("two", "three")
        )

        val result = source.mapCheckNull { first, second ->
            "$first-$second"
        }

        assertEquals(listOf("two-three"), result.toList())
    }
}
