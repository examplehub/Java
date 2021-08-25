package com.examplehub.basics.floats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloatOperationTest {
    @Test
    void testCompare() {
        assertEquals(0.1, 1.0 / 10);
        assertTrue(0.1 > 1 - 9.0 / 10);
    }

    @Test
    void testDivide() {
        assertEquals(2.0, 10.0 / 5);
        assertEquals(Double.NaN, 0.0d / 0);
        assertEquals(Double.POSITIVE_INFINITY, 10.0D / 0);
        assertEquals(Double.NEGATIVE_INFINITY, -10.0 / 0);
    }

    @Test
    void testTypeConversion() {
        assertEquals(12, (int) 12.3);
        assertEquals(12, (int) 12.9);
        assertEquals(-12, (int) -12.3);
        assertEquals(-12, (int) -12.9);

        assertEquals(12, (int) (12.3 + 0.5));
        assertEquals(13, (int) (12.9 + 0.5));
        assertEquals(-12, (int) (-12.3 - 0.5));
        assertEquals(-13, (int) (-12.9 - 0.5));
    }
}