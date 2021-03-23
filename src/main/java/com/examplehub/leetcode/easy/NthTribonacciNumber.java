package com.examplehub.leetcode.easy;

/** https://leetcode.com/problems/n-th-tribonacci-number/ */
public class NthTribonacciNumber {
  public static int solution1(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else if (n == 2) {
      return 1;
    } else {
      return solution1(n - 1) + solution1(n - 2) + solution1(n - 3);
    }
  }

  public static int solution2(int n) {
    int[] nums = new int[n + 3];
    nums[0] = 0;
    nums[1] = 1;
    nums[2] = 1;
    for (int i = 3; i <= n; ++i) {
      nums[i] = nums[i - 1] + nums[i - 2] + nums[i - 3];
    }
    return nums[n];
  }
}
