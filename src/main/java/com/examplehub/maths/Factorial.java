package com.examplehub.maths;

/**
 * https://en.wikipedia.org/wiki/Factorial
 */
public class Factorial {
  public static long factorial(int number) {
    if (number < 0) {
      throw new ArithmeticException(number + " is negative");
    }
    long fact = 1;
    for (int i = 1; i <= number; ++i) {
      fact *= i;
    }
    return fact;
  }
}
