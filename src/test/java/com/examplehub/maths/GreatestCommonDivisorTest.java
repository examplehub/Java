package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreatestCommonDivisorTest {
  @Test
  void testGCD() {
    int[][] testNumbers = {{8, 12, 4}, {54, 24, 6}, {3, 4, 1}, {3, 0, 3}};
    for (int[] testNumber : testNumbers) {
      assertEquals(testNumber[2], GreatestCommonDivisor.gcdEasy(testNumber[0], testNumber[1]));
      assertEquals(testNumber[2], GreatestCommonDivisor.gcd(testNumber[0], testNumber[1]));
    }
  }
}
