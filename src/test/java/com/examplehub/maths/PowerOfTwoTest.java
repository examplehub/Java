package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
