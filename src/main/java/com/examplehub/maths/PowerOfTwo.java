package com.examplehub.maths;

public class PowerOfTwo {
  /**
   * Test if a number is power of two or not.
   *
   * @param number the number to be checked.
   * @return {@code true} if given number is power of two, otherwise {@code false}.
   */
  public static boolean isPowerOfTwo(int number) {
    if (number <= 0) {
      return false;
    }
    while (number != 1) {
      if (number % 2 != 0) {
        return false;
      }
      number >>= 1;
    }
    return true;
  }
}
