package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShuffleStringTest {
  @Test
  void testSolution1() {
    assertEquals(
        "leetcode", ShuffleString.solution1("codeleet", new int[] {4, 5, 6, 7, 0, 2, 1, 3}));
    assertEquals("abc", ShuffleString.solution1("abc", new int[] {0, 1, 2}));
    assertEquals("nihao", ShuffleString.solution1("aiohn", new int[] {3, 1, 4, 2, 0}));
    assertEquals(
        "arigatou", ShuffleString.solution1("aaiougrt", new int[] {4, 0, 2, 6, 7, 3, 1, 5}));
    assertEquals("rat", ShuffleString.solution1("art", new int[] {1, 0, 2}));
  }

  @Test
  void testSolution2() {}
}
