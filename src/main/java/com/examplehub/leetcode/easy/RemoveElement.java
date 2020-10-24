package com.examplehub.leetcode.easy;

public class RemoveElement {
  public static int solution1(int[] nums, int val) {
    int length = nums.length;
    for (int i = 0; i < length; i++) {
      if (nums[i] == val) {
        //                for (int j = i; j < length - 1; j++) {
        //                    nums[j] = nums[j + 1];
        //                }
        if (length - 1 - i >= 0) System.arraycopy(nums, i + 1, nums, i, length - 1 - i);
        length--;
        i--;
      }
    }
    return length;
  }

  public static int solution2(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != val) {
        nums[i] = nums[j];
        i++;
      }
    }
    return i;
  }
}
