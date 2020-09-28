package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {
    private int[][] testNumbers = {{-123, 6}, {-10, 1}, {0, 0}, {123, 6}, {100, 1}, {123456, 21}};

    @Test
    void sumOfDigits() {
        for (int[] test : testNumbers) {
            assertEquals(SumOfDigits.sumOfDigits(test[0]), test[1]);
        }
    }

    @Test
    void sumOfDigitsSecond() {
        for (int[] test : testNumbers) {
            assertEquals(SumOfDigits.sumOfDigitsSecond(test[0]), test[1]);
        }
    }

    @Test
    void sumOfDigitsRecursion() {
        for (int[] test : testNumbers) {
            assertEquals(SumOfDigits.sumOfDigitsRecursion(test[0]), test[1]);
        }
    }
}