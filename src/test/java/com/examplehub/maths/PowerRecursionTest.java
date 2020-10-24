package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PowerRecursionTest {

  @Test
  void testPow() {
    assertEquals(1, PowerRecursion.pow(0, 0));
    assertEquals(0, PowerRecursion.pow(0, 10));
    assertEquals(1, PowerRecursion.pow(1, 0));
    assertEquals(2, PowerRecursion.pow(2, 1));
    assertEquals(8, PowerRecursion.pow(2, 3));
    assertEquals(1024, PowerRecursion.pow(2, 10));
    assertEquals(625, PowerRecursion.pow(25, 2));
  }
}
