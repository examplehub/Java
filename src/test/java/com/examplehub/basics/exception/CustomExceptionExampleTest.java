package com.examplehub.basics.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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