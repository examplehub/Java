package com.examplehub.basics.exception;

public class CatchException {
  public static double divide(double a, double b) throws ArithmeticException {
    if (b == 0) {
      throw new ArithmeticException("division is zero");
    }
    return a / b;
  }
}
