package com.examplehub.basics.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsExampleTest {
    @Test
    void testAbs() {
       assertEquals(100, Math.abs(-100));
       assertEquals(100, Math.abs(100));
       assertEquals(7.8, Math.abs(-7.8));
    }

    @Test
    void testMax() {
        assertEquals(3, Math.max(1, 3));
        assertEquals(-1, Math.max(-1, -3));
        assertEquals(-1.5, Math.max(-1.5, -3.27));
    }

    @Test
    void testMin() {
        assertEquals(1, Math.min(1, 3));
        assertEquals(-3, Math.min(-1, -3));
        assertEquals(-3.27, Math.min(-1.5, -3.27));
    }

    @Test
    void testPower() {
        assertEquals(1024, Math.pow(2, 10));
        assertEquals(512, Math.pow(2, 9));
    }

    @Test
    void testSqrt() {
        assertEquals(2, Math.sqrt(4));
        assertEquals(1.4142135623730951, Math.sqrt(2));
    }

    @Test
    void testRandom() {
        double randomNumber = Math.random();
        assertTrue(randomNumber >= 0 && randomNumber < 1);
    }
}