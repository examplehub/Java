package com.examplehub.projecteuler;

import com.examplehub.maths.PrimeCheck;

/** link: https://projecteuler.net/problem=10 */
public class Problem10 {
  public static long solution1(int n) {
    long sum = 0;
    for (int i = 2; i <= n; i++) {
      if (PrimeCheck.isPrime(i)) {
        sum += i;
      }
    }
    return sum;
  }
}
