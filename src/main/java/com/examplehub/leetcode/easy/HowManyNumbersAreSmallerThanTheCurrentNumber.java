package com.examplehub.leetcode.easy;

/**
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public static int[] solution1(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < nums.length; ++j) {
                if (i == j) {
                    continue;
                }
                if (nums[j] < nums[i]) {
                    result[i]++;
                }
            }
        }
        return result;
    }
}
