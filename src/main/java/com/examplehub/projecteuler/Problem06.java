package com.examplehub.projecteuler;

import com.examplehub.maths.SumToN;

/** https://projecteuler.net/problem=6 */
public class Problem06 {
  public static long solution1(int n) {
    long sumOfSquares = 0;
    for (int i = 1; i <= n; ++i) {
      sumOfSquares = (long) (sumOfSquares + Math.pow(i, 2));
    }

    long squareOfSum = (long) Math.pow(SumToN.sum(n), 2);
    return squareOfSum - sumOfSquares;
  }
}
