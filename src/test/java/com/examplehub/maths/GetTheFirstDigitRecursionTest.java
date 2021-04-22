package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GetTheFirstDigitRecursionTest {
  @Test
  void testFirstDigit() {
    int[][] testNumbers = {{-123, 1}, {0, 0}, {123, 1}, {123456789, 1}};
    for (int[] testNumber : testNumbers) {
      assertEquals(testNumber[1], GetTheFirstDigitRecursion.firstDigit(testNumber[0]));
    }
  }
}
