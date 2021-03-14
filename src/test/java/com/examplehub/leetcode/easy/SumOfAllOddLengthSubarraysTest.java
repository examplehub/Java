package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfAllOddLengthSubarraysTest {
    @Test
    void testSolution1() {
        int[] arr = {1, 4, 2, 5, 3};
        assertEquals(58, SumOfAllOddLengthSubarrays.solution1(arr));

        arr = new int[]{1, 2};
        assertEquals(3, SumOfAllOddLengthSubarrays.solution1(arr));

        arr = new int[]{10, 11, 12};
        assertEquals(66, SumOfAllOddLengthSubarrays.solution1(arr));
    }
}