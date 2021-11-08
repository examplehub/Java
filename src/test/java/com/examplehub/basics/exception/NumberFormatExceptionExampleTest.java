package com.examplehub.basics.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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