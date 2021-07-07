package com.examplehub.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JustAppearOneTimeTest {
  @Test
  void testSolution1() {
    assertTrue(JustAppearOneTime.solution1("abc", "ab"));
    assertFalse(JustAppearOneTime.solution1("abcbc", "bc"));
    assertFalse(JustAppearOneTime.solution1("abc", "ac"));
  }
}
