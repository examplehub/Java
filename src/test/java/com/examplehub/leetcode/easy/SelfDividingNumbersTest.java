package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SelfDividingNumbersTest {
    @Test
    void testSolution1() {
        assertEquals(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22),
                SelfDividingNumbers.solution1(1, 22)
        );
    }
}