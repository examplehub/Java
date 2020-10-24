package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplyTest {
  @Test
  void test() {
    assertEquals(0, Multiply.multiply(2, 0));
    assertEquals(0, Multiply.multiply(0, 2));
    assertEquals(-2, Multiply.multiply(-1, 2));
    assertEquals(100, Multiply.multiply(100, 1));
    assertEquals(100, Multiply.multiply(10, 10));

    assertEquals(0, Multiply.multiply(2.5, 0));
    assertEquals(6.25, Multiply.multiply(2.5, 2.5));
    assertEquals(314.0, Multiply.multiply(3.14, 100));
  }
}
