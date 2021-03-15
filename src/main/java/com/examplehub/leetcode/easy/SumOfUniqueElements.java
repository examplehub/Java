package com.examplehub.leetcode.easy;

/**
 * https://leetcode.com/problems/sum-of-unique-elements/
 */
public class SumOfUniqueElements {
    public static int solution1(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            boolean isUnique = true;
            for (int j = 0; j < nums.length; ++j) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
