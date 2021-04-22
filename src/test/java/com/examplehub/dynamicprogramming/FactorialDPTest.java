package com.examplehub.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialDPTest {
  @Test
  void testFactorial() {
    assertEquals(1, FactorialDP.factorial(0));
    assertEquals(1, FactorialDP.factorial(1));
    assertEquals(2, FactorialDP.factorial(2));
    assertEquals(6, FactorialDP.factorial(3));
    assertEquals(24, FactorialDP.factorial(4));
    assertEquals(120, FactorialDP.factorial(5));

    try {
      long result = FactorialDP.factorial(-1);
      fail(); /* this won't happen */
    } catch (ArithmeticException e) {
      assertTrue(true); /* this will happen */
    }
  }
}
