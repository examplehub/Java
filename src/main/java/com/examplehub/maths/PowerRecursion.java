package com.examplehub.maths;

public class PowerRecursion {

  /**
   * Returns the value of the first argument raised to the power of the second argument using
   * recursion.
   *
   * @param a the base.
   * @param b the exponent.
   * @return the value {@code a}<sup>{@code b}</sup>.
   */
  public static long pow(int a, int b) {
    return b == 0 ? 1 : a * pow(a, b - 1);
  }
}
