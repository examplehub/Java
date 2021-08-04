package com.examplehub.leetcode.easy;

/**
 * https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {
    public static int solution1(int... nums) {
        int majorityIndex = 0;
        int majorityTimes = 0;
        for (int i = 0; i < nums.length; ++i) {
            int countTimes = 0;
            for (int num : nums) {
                if (num == nums[i]) {
                    countTimes++;
                }
            }
            if (countTimes > majorityTimes) {
                majorityTimes = countTimes;
                majorityIndex = i;
            }
        }
        return nums[majorityIndex];
    }
}