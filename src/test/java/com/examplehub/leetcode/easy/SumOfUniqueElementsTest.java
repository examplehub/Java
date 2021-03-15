package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfUniqueElementsTest {
    @Test
    void testSolution1() {
        int[] nums = {1, 2, 3, 2};
        assertEquals(4, SumOfUniqueElements.solution1(nums));

        nums = new int[]{1, 1, 1, 1, 1};
        assertEquals(0, SumOfUniqueElements.solution1(nums));

        nums = new int[]{1, 2, 3, 4, 5};
        assertEquals(15, SumOfUniqueElements.solution1(nums));
    }
}