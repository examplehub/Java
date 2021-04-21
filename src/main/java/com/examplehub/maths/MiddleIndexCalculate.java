package com.examplehub.maths;

public class MiddleIndexCalculate {

  /**
   * Return middle index from left index to right index.
   *
   * @param left the left index of array.
   * @param right the right index of array.
   * @return middle index.
   */
  public static int middle(int left, int right) {
    return (left + right) >>> 1;
  }
}
