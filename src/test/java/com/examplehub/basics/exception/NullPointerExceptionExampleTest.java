package com.examplehub.basics.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NullPointerExceptionExampleTest {
  @Test
  void testNullPointer() {
    try {
      String str = null;
      System.out.println(" str length = " + str.length());
      fail();
    } catch (NullPointerException e) {
      assertTrue(true);
    }
  }
}