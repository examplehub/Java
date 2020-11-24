package com.examplehub.maths;

/** Calculate 1! + 2! + 3! + ... n! */
public class SumOfFactorial {
  public static int sum(int n) {
    return sum(1, n);
  }

  public static int sum(int i, int n) {
    if (i == n) {
      return n;
    } else {
      return i + i * sum(i + 1, n);
    }
  }
}
