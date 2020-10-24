package com.examplehub.maths;

public class SumToN {

  /**
   * Sum from 1 to n.
   *
   * @param n the limitation.
   * @return sum of 1 to n.
   */
  public static int sum(int n) {
    int sum = 0;
    for (int i = 0; i <= n; ++i) {
      sum += i;
    }
    return sum;
  }
}
