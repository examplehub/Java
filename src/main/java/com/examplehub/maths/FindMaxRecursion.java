package com.examplehub.maths;

public class FindMaxRecursion {

  /**
   * Find max value in array using recursion.
   *
   * @param numbers the numbers to find.
   * @param length the length of array.
   * @return max value in given array.
   */
  public static int max(int[] numbers, int length) {
    if (length == 1) {
      return numbers[0];
    }
    int temp = max(numbers, length - 1);
    return Math.max(numbers[length - 1], temp);
  }

  /**
   * Find max value in array using recursion.
   *
   * @param numbers the numbers to find.
   * @param left the left index of sub array.
   * @param right the right index of sub array.
   * @return max value in given array.
   */
  public static int max(int[] numbers, int left, int right) {
    if (left == right) {
      return numbers[left];
    }
    int middle = (left + right) >> 1;
    int leftMax = max(numbers, left, middle); /* find max in range[left, middle] */
    int rightMax = max(numbers, middle + 1, right); /* find max in range[middle + 1, right] */
    return Math.max(leftMax, rightMax);
  }
}
