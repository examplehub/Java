package com.examplehub.basics.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThrowsExceptionExampleTest {
  @Test
  void testReceiveException() {
    try {
      int num = division(3, 0);
      fail();
    } catch (ArithmeticException e) {
      assertTrue(true);
    }
  }

  public int division(int a, int b) throws ArithmeticException {
    return a / b;
  }

  @Test
  void testThrowException() {
    try {
      int number = parseInt("123a");
      fail();
    } catch (NumberFormatException e) {
      assertTrue(true);
      assertEquals("can't contains non-digits", e.getMessage());
    }
  }

  public int parseInt(String str) throws NumberFormatException {
    if (!str.matches("\\d+")) {
      throw new NumberFormatException("can't contains non-digits");
    }
    return Integer.parseInt(str);
  }
}
