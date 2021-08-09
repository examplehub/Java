package com.examplehub.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/third-maximum-number/
 */
public class ThirdMaximumNumber {
    public static int solution1(int...nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int i = 0;
        for (int num : set) {
            nums[i++] = num;
        }
        Arrays.sort(nums, 0, i);
        return i < 3 ? nums[i - 1] : nums[i - 3];
    }
}
