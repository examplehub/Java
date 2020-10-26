package com.examplehub.maths;

/**
 * https://en.wikipedia.org/wiki/Lucas_number
 */
public class LucasNumbers {

  /**
   * Get nth lucas number.
   *
   * @param n the nth.
   * @return nth lucas number.
   */
  public static int lucas(int n) {
    return n == 0 ? 2 : n == 1 ? 1 : lucas(n - 1) + lucas(n - 2);
  }
}
