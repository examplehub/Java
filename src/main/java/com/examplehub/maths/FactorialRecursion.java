package com.examplehub.maths;

/**
 * https://en.wikipedia.org/wiki/Factorial
 */
public class FactorialRecursion {
  public static long factorial(int number) {
    if (number < 0) {
      throw new ArithmeticException(number + " is negative");
    }
    return number == 0 || number == 1 ? 1 : number * factorial(number - 1);
  }
}
