package com.examplehub.dynamicprogramming;

public class FibonacciDP {

  /**
   * Get nth fibonacci number.
   *
   * @param nth the nth
   * @return nth fibonacci number.
   * @throws IllegalArgumentException if number is negative.
   */
  public static int fibonacci(int nth) {
    if (nth < 0) {
      throw new IllegalArgumentException("number can't be negative");
    }
    int[] fib = new int[nth + 2]; /* allocate 1 extra space to handle fibonacci[0] */
    fib[0] = 0;
    fib[1] = 1;
    for (int i = 2; i <= nth; i++) {
      fib[i] = fib[i - 1] + fib[i - 2];
    }
    return fib[nth];
  }
}
