package com.examplehub.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/self-dividing-numbers/ */
public class SelfDividingNumbers {
  public static List<Integer> solution1(int left, int right) {
    List<Integer> nums = new ArrayList<>();
    for (int i = left; i <= right; ++i) {
      int copyNumber = i;
      while (copyNumber != 0) {
        int remainder = copyNumber % 10;
        if (remainder == 0 || i % remainder != 0) {
          break;
        }
        copyNumber /= 10;
      }
      if (copyNumber == 0) {
        nums.add(i);
      }
    }
    return nums;
  }
}
