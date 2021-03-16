package com.examplehub.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/sort-array-by-parity/ */
public class SortArrayByParity {
  public static int[] solution1(int[] nums) {
    List<Integer> evenNums = new ArrayList<>();
    List<Integer> oddNums = new ArrayList<>();
    for (int num : nums) {
      if (num % 2 == 0) {
        evenNums.add(num);
      } else {
        oddNums.add(num);
      }
    }
    evenNums.addAll(oddNums);
    return evenNums.stream().mapToInt(i -> i).toArray();
  }
}
