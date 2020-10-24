package com.examplehub.maths;

import java.util.stream.IntStream;

public class SumOfArray {

  /**
   * Calculate sum of array.
   *
   * @param numbers the numbers need to be calculated.
   * @return the sum of array.
   */
  public static int sum(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }

  /**
   * Calculate sum of using lambda expression.
   *
   * @param numbers the numbers need to be calculated.
   * @return the sum of array.
   */
  public static int sumWithLambda(int[] numbers) {
    return IntStream.of(numbers).sum();
  }

  /**
   * Calculate sum of using recursion.
   *
   * @param numbers the numbers need to be calculated.
   * @return the sum of array.
   */
  public static int sum(int[] numbers, int len) {
    return len == 0 ? 0 : numbers[len - 1] + sum(numbers, len - 1);
  }
}
