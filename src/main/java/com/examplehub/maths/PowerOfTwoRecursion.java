package com.examplehub.maths;

public class PowerOfTwoRecursion {
  /**
   * Test if a number is power of two or not using recursion.
   *
   * @param number the number to be checked.
   * @return {@code true} if given number is power of two, otherwise {@code false}.
   */
  public static boolean isPowerOfTwo(int number) {
    if (number == 1) {
      return true;
    }
    if (number % 2 != 0 || number <= 0) {
      return false;
    }
    return isPowerOfTwo(number / 2);
  }
}
