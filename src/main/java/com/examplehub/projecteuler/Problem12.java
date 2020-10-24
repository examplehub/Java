package com.examplehub.projecteuler;

import com.examplehub.maths.SumToN;

/** https://projecteuler.net/problem=12 */
public class Problem12 {

  public static int solution1(int n) {
    for (int i = 1; ; i++) {
      int numberOfDivisors = 0;
      int triangleNumber = SumToN.sum(i);
      for (int divisor = 1; divisor <= triangleNumber; divisor++) {
        if (triangleNumber % divisor == 0) {
          numberOfDivisors++;
        }
      }
      if (numberOfDivisors > n) {
        return triangleNumber;
      }
    }
  }
}
