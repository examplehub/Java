package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDigitsTest {

    @Test
    void testCountDigits() {
        assertEquals(3, CountDigits.countDigits(-123));
        assertEquals(1, CountDigits.countDigits(-1));
        assertEquals(1, CountDigits.countDigits(0));
        assertEquals(3, CountDigits.countDigits(123));
        assertEquals(6, CountDigits.countDigits(123456));
    }
}