package com.examplehub.maths;

public class SumOfDivisor {

  /**
   * Calculate sum of divisors of a number, including itself.
   *
   * @param number the number to be calculated
   * @return sum of divisors.
   */
  public static int sumOfDivisorInclude(int number) {
    int sum = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    return sum;
  }

  /**
   * Calculate sum of divisors of a number, excluding itself.
   *
   * @param number the number to be calculated
   * @return sum of divisors.
   */
  public static int sumOfDivisorExclude(int number) {
    int sum = 0;
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
