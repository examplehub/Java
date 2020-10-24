package com.examplehub.projecteuler;

import com.examplehub.maths.CountDigits;
import com.examplehub.maths.Fibonacci;
import com.examplehub.maths.FibonacciBigNumber;

/** https://projecteuler.net/problem=25 */
public class Problem25 {

  public static int solution1(int digits) {
    for (int i = 1; ; i++) {
      if (CountDigits.countDigits(Fibonacci.fibonacci(i)) == digits) {
        return i;
      }
    }
  }

  public static int solution2(int digits) {
    for (int i = 1; ; i++) {
      if (FibonacciBigNumber.fibonacci(i).length() == digits) {
        return i;
      }
    }
  }
}
