package mirlan

import org.junit.Assert.assertEquals
import org.junit.Test

class DronesKT {
    private fun findUniqueDeliveryId(deliveryIds: IntArray): Int {
        return deliveryIds.reduce { n, id -> n.xor(id) }
    }

    // tests
    @Test
    fun oneDroneTest() {
        val expected = 1
        val actual = findUniqueDeliveryId(intArrayOf(1))
        assertEquals(expected.toLong(), actual.toLong())
    }

    @Test
    fun uniqueIdComesFirstTest() {
        val expected = 3
        val actual = findUniqueDeliveryId(intArrayOf(3, 2, 2, 1, 1))
        assertEquals(expected.toLong(), actual.toLong())
    }

    @Test
    fun uniqueIdComesLastTest() {
        val expected = 5
        val actual = findUniqueDeliveryId(intArrayOf(1, 2, 1, 2, 5))
        assertEquals(expected.toLong(), actual.toLong())
    }

    @Test
    fun uniqueIdInTheMiddleTest() {
        val expected = 1
        val actual = findUniqueDeliveryId(intArrayOf(3, 2, 1, 2, 3))
        assertEquals(expected.toLong(), actual.toLong())
    }

    @Test
    fun manyDronesTest() {
        val expected = 8
        val actual = findUniqueDeliveryId(intArrayOf(2, 5, 4, 8, 6, 3, 1, 4, 2, 3, 6, 5, 1))
        assertEquals(expected.toLong(), actual.toLong())
    }
}