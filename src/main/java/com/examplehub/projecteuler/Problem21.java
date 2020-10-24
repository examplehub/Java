package com.examplehub.projecteuler;

import com.examplehub.maths.SumOfDivisor;

/** https://projecteuler.net/problem=21 */
public class Problem21 {
  public static int solution1(int n) {
    int sum = 0;
    for (int i = 1; i < n; i++) {
      int sumOfDivisor = SumOfDivisor.sumOfDivisorExclude(i);
      if (SumOfDivisor.sumOfDivisorExclude(sumOfDivisor) == i && sumOfDivisor != i) {
        sum += i;
      }
    }
    return sum;
  }
}
