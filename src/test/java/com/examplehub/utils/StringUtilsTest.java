package com.examplehub.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

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

  @ParameterizedTest
  @MethodSource
  void testCapitalize(String input, String excepted) {
    assertEquals(excepted, StringUtils.capitalize(input));
  }

  static List<Arguments> testCapitalize() {
    return List.of(Arguments.arguments("abc", "Abc"), //
            Arguments.arguments("APPLE", "Apple"), //
            Arguments.arguments("gooD", "Good"));
  }

  @ParameterizedTest
  @CsvSource({"abc, Abc", "APPLE, Apple", "gooD, Good"})
  void testCapitalizeCvsSource(String input, String excepted) {
    assertEquals(excepted, StringUtils.capitalize(input));
  }
}
