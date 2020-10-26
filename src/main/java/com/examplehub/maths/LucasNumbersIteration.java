package com.examplehub.maths;

/** https://en.wikipedia.org/wiki/Lucas_number */
public class LucasNumbersIteration {

  /**
   * Get nth lucas number using iteration.
   *
   * @param n the nth.
   * @return nth lucas number.
   */
  public static int lucas(int n) {
    if (n == 0) {
      return 2;
    }
    int first = 1;
    int second = 3;
    for (int i = 1; i < n; i++) {
      int temp = first + second;
      first = second;
      second = temp;
    }
    return first;
  }
}
