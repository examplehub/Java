package com.examplehub.maths;

public class Divide {

  /**
   * Divide two integer numbers.
   *
   * @param a the first number.
   * @param b the second number.
   * @return divide value of two integer numbers.
   * @throws ArithmeticException if divisor is zero.
   */
  public static int divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("divide by zero");
    }
    return a / b;
  }

  /**
   * Divide two double numbers.
   *
   * @param a the first number.
   * @param b the second number.
   * @return divide value of two double numbers.
   * @throws ArithmeticException if divisor is zero.
   */
  public static double divide(double a, double b) {
    if (b == 0.0) {
      throw new ArithmeticException("divide by zero");
    }
    return a / b;
  }
}
