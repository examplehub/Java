package com.examplehub.basics.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomExceptionExampleTest {
  @Test
  void testCustomException() {
    try {
      throw new CustomExceptionExample("custom exception");
    } catch (CustomExceptionExample e) {
      assertEquals("custom exception", e.getMessage());
    }
  }
}
