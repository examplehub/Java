package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LucasNumbersTest {
  @Test
  void test() {
    int[] lucasNumbers = {2, 1, 3, 4, 7, 11, 18, 29, 47, 76, 123};
    for (int i = 0; i < lucasNumbers.length; i++) {
      assertEquals(lucasNumbers[i], LucasNumbers.lucas(i));
    }
  }
}
