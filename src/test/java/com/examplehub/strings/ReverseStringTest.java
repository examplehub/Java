package com.examplehub.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

  @Test
  void reverse() {
    assertEquals("", ReverseString.reverse(""));
    assertEquals("123", ReverseString.reverse("321"));
    assertEquals("abc", ReverseString.reverse("cba"));
  }
}
