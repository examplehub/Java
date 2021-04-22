package com.examplehub.maths;

public class Add {

  /**
   * Add two integer numbers.
   *
   * @param a the first number.
   * @param b the second number.
   * @return sum of two numbers.
   */
  public static int add(int a, int b) {
    return a + b;
  }

  /**
   * Add some integer numbers.
   *
   * @param numbers the numbers.
   * @return sum of some numbers.
   */
  public static int add(int... numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum = sum + number;
    }
    return sum;
  }

  /**
   * Add two double numbers.
   *
   * @param a the first number.
   * @param b the second number.
   * @return sum of two numbers.
   */
  public static double add(double a, double b) {
    return a + b;
  }
}
