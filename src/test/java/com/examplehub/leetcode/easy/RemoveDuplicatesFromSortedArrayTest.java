package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {
    @Test
    void testSolution1() {
        int[] nums = {1, 1, 2};
        int[] expectedNums = {1, 2};
        int k = RemoveDuplicatesFromSortedArray.solution1(nums);
        assertEquals(2, k);
        for (int i = 0; i < k; ++i) {
            assertEquals(nums[i], expectedNums[i]);
        }

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        expectedNums = new int[]{0, 1, 2, 3, 4};
        k = RemoveDuplicatesFromSortedArray.solution1(nums);
        assertEquals(5, k);
        for (int i = 0; i < k; ++i) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }
}