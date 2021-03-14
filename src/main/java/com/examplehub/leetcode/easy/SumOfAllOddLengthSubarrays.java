package com.examplehub.leetcode.easy;

/** https://leetcode.com/problems/sum-of-all-odd-length-subarrays/ */
public class SumOfAllOddLengthSubarrays {
  public static int solution1(int[] arr) {
    int sum = 0;
    for (int subLen = 1, len = arr.length; subLen <= len; subLen += 2) {
      for (int i = 0; i + subLen <= len; ++i) {
        for (int j = i; j < i + subLen; ++j) {
          sum = sum + arr[j];
        }
      }
    }
    return sum;
  }
}
