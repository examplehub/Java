package com.examplehub.maths;

public class CountDigits {

  /**
   * Count the number of digits of a number.
   *
   * @param number the number to counted.
   * @return the number of digits.
   */
  public static int countDigits(int number) {
    int count = 0;
    do {
      number /= 10;
      count++;
    } while (number != 0);
    return count;
  }
}
