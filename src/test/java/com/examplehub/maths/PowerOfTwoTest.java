package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PowerOfTwoTest {
  @Test
  void test() {
    for (int i = -5; i <= 0; ++i) {
      assertFalse(PowerOfTwo.isPowerOfTwo(i));
    }
    assertFalse(PowerOfTwo.isPowerOfTwo(99));
    assertTrue(PowerOfTwo.isPowerOfTwo(64));
    assertTrue(PowerOfTwo.isPowerOfTwo(1024));
  }
}
