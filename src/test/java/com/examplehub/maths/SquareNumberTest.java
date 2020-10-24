package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareNumberTest {
  @Test
  void testSquareNumber() {
    int[] squareNumbers = {0, 1, 4, 9, 16, 81, 100, 841, 1600};
    for (int number : squareNumbers) {
      assertTrue(SquareNumber.isSquareNumber(number));
    }

    int[] notSquareNumbers = {2, 3, 5, 6, 7, 8, 10, 99};
    for (int number : notSquareNumbers) {
      assertFalse(SquareNumber.isSquareNumber(number));
    }
  }
}
