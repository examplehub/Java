package com.examplehub.maths;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

  /**
   * Get all prime factors of a number.
   *
   * @param number the number to be calculated.
   * @return all prime factors.
   */
  public static int[] primeFactors(int number) {
    List<Integer> integers = new ArrayList<>();
    while (number % 2 == 0) {
      integers.add(2);
      number >>= 1;
    }

    for (int i = 3; i <= Math.sqrt(number); i += 2) {
      while (number % i == 0) {
        integers.add(i);
        number /= i;
      }
    }
    if (number > 2) {
      integers.add(number);
    }
    return integers.stream().mapToInt(i -> i).toArray();
  }
}
