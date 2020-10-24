package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GetTheFirstDigitTest {

  @Test
  void test() {
    int[][] testNumbers = {{-123, 1}, {0, 0}, {123, 1}, {123456789, 1}};
    for (int[] testNumber : testNumbers) {
      assertEquals(testNumber[1], GetTheFirstDigit.firstDigit(testNumber[0]));
      assertEquals(testNumber[1], GetTheFirstDigit.firstDigitByString(testNumber[0]));
    }
  }
}
