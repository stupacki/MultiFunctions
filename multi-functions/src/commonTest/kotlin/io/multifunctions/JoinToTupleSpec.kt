package io.multifunctions

import kotlin.test.Test
import kotlin.test.assertEquals
import io.multifunctions.models.Hepta
import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

internal class JoinToTupleTest {

    @Test
    fun `joinToTuple should join values into a Pair`() {
        assertEquals(Pair("A", "B"), joinToTuple("A", "B"))
    }

    @Test
    fun `joinToTuple should join values into a Triple`() {
        assertEquals(Triple("A", "B", "C"), joinToTuple("A", "B", "C"))
    }

    @Test
    fun `joinToTuple should join values into a Quad`() {
        assertEquals(Quad("A", "B", "C", "D"), joinToTuple("A", "B", "C", "D"))
    }

    @Test
    fun `joinToTuple should join values into a Penta`() {
        assertEquals(Penta("A", "B", "C", "D", "E"), joinToTuple("A", "B", "C", "D", "E"))
    }

    @Test
    fun `joinToTuple should join values into a Hexa`() {
        assertEquals(Hexa("A", "B", "C", "D", "E", "F"), joinToTuple("A", "B", "C", "D", "E", "F"))
    }

    @Test
    fun `joinToTuple should join values into a Hepta`() {
        assertEquals(Hepta("A", "B", "C", "D", "E", "F", "G"), joinToTuple("A", "B", "C", "D", "E", "F", "G"))
    }
}
