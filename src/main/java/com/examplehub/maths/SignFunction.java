package com.examplehub.maths;

public class SignFunction {

  /**
   * Sign function algorithm.
   *
   * @param number the number to be checked.
   * @return {@code 1} if number is positive, {@code 0} returned if number is zero, otherwise {@code
   *     -1} returned.
   */
  public static int signFunction(int number) {
    return Integer.compare(number, 0);
  }
}
