package com.examplehub.leetcode.middle;

import java.util.Arrays;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
public class FindTheDuplicateNumber {
    public static int solution1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i + 1] == nums[i]) {
                return nums[i];
            }
        }
        return -1; /* won't execute */
    }

    public static int solution2(int[] nums) {
        HashSet<Integer> sets = new HashSet<>();
        for (int num : nums) {
            if (!sets.add(num)) {
                return num;
            }
        }
        return -1; /* won't execute */
    }
}
