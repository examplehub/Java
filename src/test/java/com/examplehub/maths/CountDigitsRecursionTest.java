package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDigitsRecursionTest {

    @Test
    void testCountDigits() {
        assertEquals(3, CountDigitsRecursion.countDigits(-123));
        assertEquals(1, CountDigitsRecursion.countDigits(-1));
        assertEquals(1, CountDigitsRecursion.countDigits(0));
        assertEquals(3, CountDigitsRecursion.countDigits(123));
        assertEquals(6, CountDigitsRecursion.countDigits(123456));
    }
}