package com.examplehub.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilsTest {
  @Test
  void testBytesToString() {
    byte[] bytes = {1, 2, 3, 4, 5, 0, 0, 0, 0};
    assertEquals("234", StringUtils.toString(bytes, 1, 3));
  }

  @Test
  void testCharsToString() {
    char[] bytes = {'1', '2', '3', '4', '\0', '\0', '\0'};
    assertEquals("234", StringUtils.toString(bytes, 1, 3));
  }
}
