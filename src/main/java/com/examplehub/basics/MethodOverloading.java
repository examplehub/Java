package com.examplehub.basics;

public class MethodOverloading {
  public static int sum(int a, int b) {
    return a + b;
  }

  public static int sum(int a, int b, int c, int d) {
    return sum(a, b) + sum(c, d); /* return a + b + c + d */
  }

  public static int sum(int... numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }

  public static float sum(float a, float b) {
    return a + b;
  }
}
