package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PowerOfTwoRecursionTest {
  @Test
  void test() {
    for (int i = -5; i <= 0; ++i) {
      assertFalse(PowerOfTwoRecursion.isPowerOfTwo(i));
    }
    assertFalse(PowerOfTwoRecursion.isPowerOfTwo(99));
    assertTrue(PowerOfTwoRecursion.isPowerOfTwo(64));
    assertTrue(PowerOfTwoRecursion.isPowerOfTwo(1024));
  }
}
