package com.examplehub.maths;

public class FibonacciRecursion {

  /**
   * Get nth item of fibonacci sequence using recursion.
   *
   * @param n the nth.
   * @return the nth item of fibonacci sequence.
   * @throws IllegalArgumentException if {@code n} is negative.
   */
  public static int fibonacci(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n < 0");
    }
    return n == 0 ? 0 : n == 1 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
  }
}
