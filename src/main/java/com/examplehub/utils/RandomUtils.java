package com.examplehub.utils;

import java.util.Random;

public class RandomUtils {

  /**
   * Generate random int numbers in a range.
   *
   * @param min the min value of random numbers.
   * @param max the max value of random numbers.
   * @param count the count of random numbers.
   * @return {@code count} random numbers from {@code min} to {@code max} range.
   */
  public static int[] randomInts(int min, int max, int count) {
    if (min > max) {
      throw new IllegalArgumentException("min value must be less than or equals to max");
    }
    int[] ints = new int[count];
    Random random = new Random();
    for (int i = 0; i < count; ++i) {
      ints[i] = min + random.nextInt(max - min + 1);
    }
    return ints;
  }

  /**
   * Generate random double numbers in a range.
   *
   * @param min the min value of random numbers.
   * @param max the max value of random numbers.
   * @param count the count of random numbers.
   * @return {@code count} random numbers from {@code min} to {@code max} range.
   */
  public static double[] randomDoubles(double min, double max, int count) {
    if (min > max) {
      throw new IllegalArgumentException("min value must be less than or equals to max");
    }
    double[] floats = new double[count];
    Random random = new Random();
    for (int i = 0; i < count; ++i) {
      floats[i] = min + random.nextFloat() * (max - min);
    }
    return floats;
  }
}
