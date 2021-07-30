package com.examplehub.leetcode.easy;

public class ContainsDuplicateII {
  public static boolean solution1(int[] nums, int k) {
    for (int i = 0; i < nums.length; ++i) {
      for (int j = i + 1; j < nums.length; ++j) {
        if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
          return true;
        }
      }
    }
    return false;
  }
}
