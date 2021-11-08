package com.examplehub.basics.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
