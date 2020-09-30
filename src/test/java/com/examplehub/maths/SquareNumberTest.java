package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareNumberTest {
    @Test
    void testSquareNumber() {
        int[] squareNumbers = {0, 1, 4, 9, 16, 81, 100, 841, 1600};
        for (int number : squareNumbers) {
            assertTrue(SquareNumber.isSquareNumber(number));
        }
    }
}