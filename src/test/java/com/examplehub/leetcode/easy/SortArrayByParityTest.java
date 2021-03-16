package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayByParityTest {
    @Test
    void testSolution1() {
        int[] nums = {3, 1, 2, 4};
        assertEquals(
                Arrays.toString(SortArrayByParity.solution1(nums)),
                Arrays.toString(new int[]{2, 4, 3, 1})
        );
    }
}