package com.examplehub.maths;

public class CountDigitsRecursion {

  /**
   * Count the number of digits of a number using recursion.
   *
   * @param number the number to be counted.
   * @return the number of digits.
   */
  public static int countDigits(int number) {
    number = Math.abs(number);
    return number < 10 ? 1 : 1 + countDigits(number / 10);
  }
}
