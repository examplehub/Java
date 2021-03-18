package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLuckyIntegerInAnArrayTest {
    @Test
    void testSolution1() {
        int[] arr = {2, 2, 3, 4};
        assertEquals(2, FindLuckyIntegerInAnArray.solution1(arr));

        arr = new int[]{1, 2, 2, 3, 3, 3};
        assertEquals(3, FindLuckyIntegerInAnArray.solution1(arr));

        arr = new int[]{2, 2, 2, 3, 3};
        assertEquals(-1, FindLuckyIntegerInAnArray.solution1(arr));

        arr = new int[]{-1};
        assertEquals(-1, FindLuckyIntegerInAnArray.solution1(arr));
    }
}