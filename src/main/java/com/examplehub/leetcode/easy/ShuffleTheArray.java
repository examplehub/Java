package com.examplehub.leetcode.easy;

/** https://leetcode.com/problems/shuffle-the-array/ */
public class ShuffleTheArray {
  public static int[] solution1(int[] nums, int n) {
    int[] result = new int[nums.length];
    int index = 0;
    for (int i = 0, j = n; i < n; i++, j++) {
      result[index++] = nums[i];
      result[index++] = nums[j];
    }
    System.arraycopy(result, 0, nums, 0, result.length);
    return nums;
  }
}
