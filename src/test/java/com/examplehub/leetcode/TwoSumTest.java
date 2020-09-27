package com.examplehub.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest {

    @Test
    void solution1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.solution1(nums, target);
        assert result != null;
        assertEquals(result[0], 0);
        assertEquals(result[1], 1);

        nums = new int[]{3, 2, 4};
        target = 6;
        result = TwoSum.solution1(nums, target);
        assert result != null;
        assertEquals(result[0], 1);
        assertEquals(result[1], 2);

        nums = new int[]{3, 3};
        target = 6;
        result = TwoSum.solution1(nums, target);
        assert result != null;
        assertEquals(result[0], 0);
        assertEquals(result[1], 1 );
    }

    @Test
    void solution2() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.solution2(nums, target);
        assert result != null;
        assertEquals(result[0], 0);
        assertEquals(result[1], 1);

        nums = new int[]{3, 2, 4};
        target = 6;
        result = TwoSum.solution2(nums, target);
        assert result != null;
        assertEquals(result[0], 1);
        assertEquals(result[1], 2);

        nums = new int[]{3, 3};
        target = 6;
        result = TwoSum.solution2(nums, target);
        assert result != null;
        assertEquals(result[0], 0);
        assertEquals(result[1], 1 );
    }
}