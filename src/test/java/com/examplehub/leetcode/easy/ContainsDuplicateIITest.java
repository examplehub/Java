package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContainsDuplicateIITest {
  @Test
  void testSolution1() {
    assertTrue(ContainsDuplicateII.solution1(new int[] {1, 2, 3, 1}, 3));
    assertTrue(ContainsDuplicateII.solution1(new int[] {1, 0, 1, 1}, 1));
    assertFalse(ContainsDuplicateII.solution1(new int[] {1, 2, 3, 1, 2, 3}, 2));
  }
}
