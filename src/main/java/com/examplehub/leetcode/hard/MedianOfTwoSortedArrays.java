package com.examplehub.leetcode.hard;

import com.examplehub.maths.Median;

public class MedianOfTwoSortedArrays {

  /**
   * Return the median of two sorted array.
   *
   * @param numbers1 the first array.
   * @param numbers2 the second array.
   * @return median of two sorted array.
   */
  public static double solution1(double[] numbers1, double[] numbers2) {
    double[] numbers = new double[numbers1.length + numbers2.length];
    System.arraycopy(numbers1, 0, numbers, 0, numbers1.length);
    System.arraycopy(numbers2, 0, numbers, numbers1.length, numbers2.length);
    return Median.median(numbers);
  }
}
