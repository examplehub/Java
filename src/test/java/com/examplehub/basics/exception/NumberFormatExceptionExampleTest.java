package com.examplehub.basics.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberFormatExceptionExampleTest {
  @Test
  void testFormatNumber() {
    try {
      int number = Integer.parseInt("123a");
      fail();
    } catch (NumberFormatException e) {
      assertTrue(true);
    }
  }
}
