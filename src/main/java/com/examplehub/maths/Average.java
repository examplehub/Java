package com.examplehub.maths;

/** https://en.wikipedia.org/wiki/Average */
public class Average {

  /**
   * Calculate average value of numbers.
   *
   * @param numbers the numbers to be calculated.
   * @return average value of numbers.
   */
  public static double average(double... numbers) {
    double sum = 0;
    for (double number : numbers) {
      sum += number;
    }
    return sum / numbers.length;
  }
}
