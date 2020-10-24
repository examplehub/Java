package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciRecursionTest {
  @Test
  void test() {

    try {
      FibonacciRecursion.fibonacci(-1);
      fail(); /* this will not happen */
    } catch (IllegalArgumentException e) {
      assertTrue(true); /* this wil happen */
    }

    assertEquals(0, FibonacciRecursion.fibonacci(0));
    assertEquals(1, FibonacciRecursion.fibonacci(1));
    assertEquals(1, FibonacciRecursion.fibonacci(2));
    assertEquals(2, FibonacciRecursion.fibonacci(3));
    assertEquals(3, FibonacciRecursion.fibonacci(4));
    assertEquals(5, FibonacciRecursion.fibonacci(5));
    assertEquals(8, FibonacciRecursion.fibonacci(6));
    assertEquals(13, FibonacciRecursion.fibonacci(7));
    assertEquals(144, FibonacciRecursion.fibonacci(12));
  }
}
