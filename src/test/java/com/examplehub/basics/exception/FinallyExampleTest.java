package com.examplehub.basics.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinallyExampleTest {
  @Test
  void testWithCatch() {
    int result = 0;
    try {
      int number = 10 / 2;
    } finally {
      result++;
    }
    assertEquals(1, result);
  }

  @Test
  void testReturn() {
    assertEquals(3, func());
  }
  public int func() {
    try {
      int num = 10 / 0;
      return 1;
    } catch (ArithmeticException e) {
      return 2;
    }finally {
      return 3;
    }
  }
}