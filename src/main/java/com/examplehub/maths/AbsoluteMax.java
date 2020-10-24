package com.examplehub.maths;

public class AbsoluteMax {

  /**
   * Calculate absolute max value.
   *
   * @param numbers the numbers to be checked.
   * @return absolute max value.
   */
  public static int absoluteMax(int[] numbers) {
    int absMax = Math.abs(numbers[0]);
    int number = numbers[0];
    for (int temp : numbers) {
      if (Math.abs(temp) > absMax) {
        absMax = Math.abs(temp);
        number = temp;
      }
    }
    return number;
  }
}
