package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PowerTest {

  @Test
  void testPow() {
    assertEquals(1, Power.pow(0, 0));
    assertEquals(0, Power.pow(0, 10));
    assertEquals(1, Power.pow(1, 0));
    assertEquals(2, Power.pow(2, 1));
    assertEquals(8, Power.pow(2, 3));
    assertEquals(1024, Power.pow(2, 10));
    assertEquals(625, Power.pow(25, 2));
  }
}
