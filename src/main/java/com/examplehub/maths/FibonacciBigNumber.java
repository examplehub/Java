package com.examplehub.maths;

import java.math.BigDecimal;

/** https://en.wikipedia.org/wiki/Fibonacci_number */
public class FibonacciBigNumber {

  /**
   * Get nth fibonacci number in string.
   *
   * @param nth the nth.
   * @return nth fibonacci number in string.
   */
  public static String fibonacci(int nth) {
    BigDecimal first = new BigDecimal("1");
    BigDecimal second = new BigDecimal("1");
    for (int i = 1; i < nth; i++) {
      BigDecimal temp = first.add(second);
      first = second;
      second = temp;
    }
    return first.toString();
  }
}
