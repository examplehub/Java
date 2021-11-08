package com.examplehub.basics.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticExceptionExampleTest {
  @Test
  void testDivideByZero() {
    try {
      int division = 10 / 0;
      fail();
    } catch (ArithmeticException e) {
      assertTrue(true);
    }
  }
}
