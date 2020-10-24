package com.examplehub.projecteuler;

import com.examplehub.maths.PrimeCheck;

/** link: https://projecteuler.net/problem=3 */
public class Problem03 {
  public static long solution1(long n) {
    for (long i = n; i >= 2; i--) {
      if (n % i == 0 && PrimeCheck.isPrime(i)) {
        return i;
      }
    }
    return -1; /* not found */
  }
}
