package com.examplehub.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/contains-duplicate
 */
public class ContainsDuplicate {
    public static boolean solution1(int... nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean solution2(int... nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static boolean solution3(int... nums) {
        return IntStream.of(nums).distinct().count() != nums.length;
    }
}
