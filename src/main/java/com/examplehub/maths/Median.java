package com.examplehub.maths;

import java.util.Arrays;

/** https://en.wikipedia.org/wiki/Median */
public class Median {
  public static double median(double[] numbers) {
    Arrays.sort(numbers);
    int length = numbers.length;
    int middle_index = length >> 1;
    return EvenCheck.isEvenFaster(length)
        ? (numbers[middle_index] + numbers[middle_index - 1]) / 2
        : numbers[middle_index];
  }
}
