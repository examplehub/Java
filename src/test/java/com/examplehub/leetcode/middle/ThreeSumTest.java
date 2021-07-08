package com.examplehub.leetcode.middle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
    @Test
    void testSolution1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        assertEquals("[[-1,-1,2],[-1,0,1]]", ThreeSum.solution1(nums).toString());
    }
}