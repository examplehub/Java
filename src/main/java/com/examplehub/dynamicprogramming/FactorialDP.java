package com.examplehub.dynamicprogramming;

public class FactorialDP {

  /**
   * Calculate factorial using dynamic programming.
   *
   * @param n the number.
   * @return the factorial of a number.
   */
  public static long factorial(int n) {
    long[] fact = new long[n + 1];
    fact[0] = 1;
    for (int i = 1; i <= n; i++) {
      fact[i] = fact[i - 1] * i;
    }
    return fact[n];
  }
}
