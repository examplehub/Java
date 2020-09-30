package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    @Test
    void testPerfectNumber() {
        int[] perfectNumbers = {6, 28, 496, 8128};
        for (int number : perfectNumbers) {
            assertTrue(PerfectNumber.isPerfectNumber(number));
        }

        int[] notPerfectNumbers = {0, 1, 2, 3, 4, 5, 7, 8, 8, 27};
        for (int number : notPerfectNumbers) {
            assertFalse(PerfectNumber.isPerfectNumber(number));
        }
    }
}