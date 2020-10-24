package com.examplehub.projecteuler;

import com.examplehub.maths.Factorial;

/** https://projecteuler.net/problem=34 */
public class Problem34 {
  public static int solution1() {
    int bigSum = 0;
    for (int i = 3; i <= 100000; i++) {
      int sum = 0;
      int num = i;
      while (num != 0) {
        sum = (int) (sum + Factorial.factorial(num % 10));
        num /= 10;
      }
      if (i == sum) {
        bigSum += i;
      }
    }
    return bigSum;
  }
}
