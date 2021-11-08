package com.examplehub.basics.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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