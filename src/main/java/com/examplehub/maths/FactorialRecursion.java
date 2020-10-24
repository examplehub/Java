package com.examplehub.maths;

public class FactorialRecursion {
  public static long factorial(int number) {
    if (number < 0) {
      throw new ArithmeticException(number + " is negative");
    }
    return number == 0 || number == 1 ? 1 : number * factorial(number - 1);
  }
}
