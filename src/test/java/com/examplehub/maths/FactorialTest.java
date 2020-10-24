package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

  @Test
  void testFactorial() {
    try {
      long fact = Factorial.factorial(-1);
      fail(); /* will not happen */
    } catch (ArithmeticException e) {
      assertTrue(true); /* will happen */
    }

    int[][] testNumbers = {{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}};
    for (int[] testNumber : testNumbers) {
      assertEquals(Factorial.factorial(testNumber[0]), testNumber[1]);
    }
  }
}
