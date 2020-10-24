package com.examplehub.leetcode.middle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

  @Test
  void testSolution1() {
    assertEquals(3, LongestSubstringWithoutRepeatingCharacters.solution1("abcabcbb"));
    assertEquals(1, LongestSubstringWithoutRepeatingCharacters.solution1("bbbbb"));
    assertEquals(3, LongestSubstringWithoutRepeatingCharacters.solution1("pwwkew"));
    assertEquals(0, LongestSubstringWithoutRepeatingCharacters.solution1(""));
    assertEquals(1, LongestSubstringWithoutRepeatingCharacters.solution1(" "));
    assertEquals(2, LongestSubstringWithoutRepeatingCharacters.solution1("au"));
  }
}
