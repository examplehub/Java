package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

  @Test
  void testSolution1() {
    assertEquals("fl", LongestCommonPrefix.solution1(new String[] {"flower", "flow", "flight"}));
    assertEquals(
        "flower",
        LongestCommonPrefix.solution1(new String[] {"flower", "flower", "flower", "flower"}));
    assertEquals("", LongestCommonPrefix.solution1(new String[] {"dog", "racecar", "car"}));
    assertEquals("a", LongestCommonPrefix.solution1(new String[] {"a"}));
    assertEquals("", LongestCommonPrefix.solution1(null));
  }

  @Test
  void testSolution2() {
    assertEquals("fl", LongestCommonPrefix.solution2(new String[] {"flower", "flow", "flight"}));
    assertEquals(
        "flower",
        LongestCommonPrefix.solution2(new String[] {"flower", "flower", "flower", "flower"}));
    assertEquals("", LongestCommonPrefix.solution2(new String[] {"dog", "racecar", "car"}));
    assertEquals("a", LongestCommonPrefix.solution2(new String[] {"a"}));
  }
}
