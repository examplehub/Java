package com.examplehub.leetcode.easy;

/** https://leetcode.com/problems/find-lucky-integer-in-an-array/ */
public class FindLuckyIntegerInAnArray {

  public static int solution1(int[] arr) {
    int maxLuckyNum = -1;
    for (int i = 0; i < arr.length; ++i) {
      int count = 0;
      for (int j = 0; j < arr.length; ++j) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
      if (count > 1 && count == arr[i]) {
        maxLuckyNum = arr[i];
      }
    }
    return maxLuckyNum;
  }
}
