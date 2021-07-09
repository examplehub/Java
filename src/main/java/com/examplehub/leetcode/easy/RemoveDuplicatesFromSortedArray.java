package com.examplehub.leetcode.easy;

/** https://leetcode.com/problems/remove-duplicates-from-sorted-array/ */
public class RemoveDuplicatesFromSortedArray {

  public static int solution1(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int i = 0;
    for (int j = 1; j < nums.length; ++j) {
      if (nums[j] != nums[i]) {
        nums[++i] = nums[j];
      }
    }
    return i + 1;
  }
}
