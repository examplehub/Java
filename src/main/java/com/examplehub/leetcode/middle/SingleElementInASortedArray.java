package com.examplehub.leetcode.middle;

import java.util.HashSet;
import java.util.Iterator;

/** https://leetcode.com/problems/single-element-in-a-sorted-array/ */
public class SingleElementInASortedArray {
  public static int solution1(int[] nums) {
    for (int i = 0; i < nums.length - 1; i += 2) {
      if (nums[i] != nums[i + 1]) {
        return nums[i];
      }
    }
    return nums[nums.length - 1];
  }

  public static int solution2(int[] nums) {
    HashSet<Integer> hashSet = new HashSet<>();
    for (int num : nums) {
      if (hashSet.contains(num)) {
        hashSet.remove(num);
      } else {
        hashSet.add(num);
      }
    }
    Iterator<Integer> iterator = hashSet.iterator();
    return iterator.next();
  }
}
