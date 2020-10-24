package com.examplehub.leetcode.middle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestPalindromicSubstringTest {
  @Test
  void testSolution1() {
    assertEquals("bab", LongestPalindromicSubstring.solution1("babad"));
    assertEquals("bb", LongestPalindromicSubstring.solution1("cbbd"));
  }
}
