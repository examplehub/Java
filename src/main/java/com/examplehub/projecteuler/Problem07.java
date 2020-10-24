package com.examplehub.projecteuler;

import com.examplehub.maths.PrimeCheck;

/** link: https://projecteuler.net/problem=7 */
public class Problem07 {

  public static long solution(int n) {
    int count = 0;
    int i;
    for (i = 2; count != n; i++) {
      if (PrimeCheck.isPrime(i)) {
        count++;
      }
    }
    return i - 1;
  }
}
