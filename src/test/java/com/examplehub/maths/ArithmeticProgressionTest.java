package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticProgressionTest {
    @Test
    void testGetNth() {
        assertEquals(10, ArithmeticProgression.getNth(1, 1, 10));
        assertEquals(19, ArithmeticProgression.getNth(1, 2, 10));
        assertEquals(90, ArithmeticProgression.getNth(100, -2, 6));
    }

    @Test
    void testSum() {
        assertEquals(55, ArithmeticProgression.sum(1, 1, 10));
        assertEquals(5050, ArithmeticProgression.sum(1, 1, 100));
        assertEquals(5050, ArithmeticProgression.sum(100, -1, 100));
    }
}