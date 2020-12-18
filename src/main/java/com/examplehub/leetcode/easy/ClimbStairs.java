package com.examplehub.leetcode.easy;

/** https://leetcode.com/problems/climbing-stairs/ */
public class ClimbStairs {
  public static int solution1(int n) {
    return n <= 2 ? n : solution1(n - 1) + solution1(n - 2);
  }
}
