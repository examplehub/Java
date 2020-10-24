package com.examplehub.maths;

/** https://en.wikipedia.org/wiki/Greatest_common_divisor */
public class GreatestCommonDivisor {

  /**
   * Returns the greatest common divisor of two numbers.
   *
   * @param a the first number the.
   * @param b the second number.
   * @return the greatest common divisor of two numbers.
   */
  public static int gcdEasy(int a, int b) {
    if (a == 0 || b == 0) {
      return Math.max(a, b);
    }
    for (int i = Math.min(a, b); i >= 1; i--) {
      if (a % i == 0 && b % i == 0) {
        return i;
      }
    }
    return -1; /* not found */
  }

  /**
   * Returns the greatest common divisor of two numbers.
   *
   * @param a the first number the.
   * @param b the second number.
   * @return the greatest common divisor of two numbers.
   */
  public static int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
  }
}
