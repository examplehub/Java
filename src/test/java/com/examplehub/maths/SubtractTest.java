package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractTest {

    @Test
    void testSubtract() {
        assertEquals(0, Subtract.subtract(-2, -2));
        assertEquals(6, Subtract.subtract(4, -2));
        assertEquals(10, Subtract.subtract(20, 10));

        assertEquals(0.0, Subtract.subtract(2.0, 2.0));
        assertTrue(Math.abs(Subtract.subtract(3.14, 3.0) - 0.14) <= 0.000001);
        assertEquals(50.25, Subtract.subtract(100.75, 50.50));
    }
}