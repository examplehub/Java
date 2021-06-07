package com.examplehub.maths;

/** Calculate 1! + 2! + 3! + ... n! */
public class SumOfFactorial {

  public static int sum(int i, int n) {
    if (i == n) {
      return n;
    } else {
      return i + i * sum(i + 1, n);
    }
  }

  public static int sum(int n) {
    if (n == 1) {
      return 1; /* 1! */
    } else if (n == 2) {
      return 1 + 2; /* 1! + 2! */
    } else {
      /**
       * sum(n)=1! + 2! + 3! + ... + (n-1)! + n!
       *       = sum(n-1) + n!
       *       = sum(n-1) + (n-1)! * n
       *       = sum(n-1) + (sum(n-1) - sum(n-2))*n
       */
      return sum(n - 1) + (sum(n - 1) - sum(n - 2)) * n;
    }
  }
}
