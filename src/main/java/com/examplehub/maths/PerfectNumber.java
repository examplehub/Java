package com.examplehub.maths;

/** https://en.wikipedia.org/wiki/Perfect_number */
public class PerfectNumber {

  /**
   * Test if a number is a perfect number.
   *
   * @param number the number to be checked.
   * @return {@code true} if the {@code number} is perfect number, otherwise {@code false}.
   */
  public static boolean isPerfectNumber(int number) {
    if (number <= 0) {
      return false; /* all negative is not perfect number */
    }
    int sum = 0;
    for (int i = 1; i <= number / 2; ++i) {

      if (number % i == 0) {
        sum += i;
      }
    }
    return sum == number;
  }
}
