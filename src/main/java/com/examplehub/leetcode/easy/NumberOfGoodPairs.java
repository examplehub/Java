package com.examplehub.leetcode.easy;

/** https://leetcode.com/problems/number-of-good-pairs/ */
public class NumberOfGoodPairs {
  public static int solution1(int[] nums) {
    int goodPairs = 0;
    for (int i = 0; i < nums.length; ++i) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          goodPairs++;
        }
      }
    }
    return goodPairs;
  }
}
