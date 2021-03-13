package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumOf1dArrayTest {
    @Test
    void testSolution1() {
        int[] nums = {1, 2, 3, 4};
        RunningSumOf1dArray.solution1(nums);
        assertEquals(Arrays.toString(nums), Arrays.toString(new int[]{1, 3, 6, 10}));

        nums = new int[]{1, 1, 1, 1, 1};
        RunningSumOf1dArray.solution1(nums);
        assertEquals(Arrays.toString(nums), Arrays.toString(new int[]{1, 2, 3, 4, 5}));

        nums = new int[]{3,1,2,10,1};
        RunningSumOf1dArray.solution1(nums);
        assertEquals(Arrays.toString(nums), Arrays.toString(new int[]{3,4,6,16,17}));
    }
}