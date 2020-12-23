package com.examplehub.leetcode.middle;

/** https://leetcode.com/problems/sort-colors/ */
public class SortColor {
  private static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void solution1(int[] arr) {
    int begin = 0;
    int cur = 0;
    int end = arr.length - 1;
    while (cur <= end) {
      if (arr[cur] == 0) {
        swap(arr, cur, begin);
        cur++;
        begin++;
      } else if (arr[cur] == 1) {
        cur++;
      } else {
        swap(arr, cur, end);
        end--;
      }
    }
  }
}
