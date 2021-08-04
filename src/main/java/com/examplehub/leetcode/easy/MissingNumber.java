package com.examplehub.leetcode.easy;

import com.examplehub.maths.SumToNFormula;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {
    public static int solution1(int... nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public static int solution2(int... nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < nums.length; ++i) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return nums.length;
    }

    public static int solution3(int... nums) {
        int missingNumber = nums.length;
        for (int i = 0; i < nums.length; ++i) {
            missingNumber ^= nums[i] ^ i;
        }
        return missingNumber;
    }

    public static int solution4(int... nums) {
        int bigSum = SumToNFormula.sum(nums.length);
        int smallSum = 0;
        for (int num : nums) {
            smallSum += num;
        }
        return bigSum - smallSum;
    }
}
