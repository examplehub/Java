package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {
  @Test
  void testSolution1() {
    assertTrue(ContainsDuplicate.solution1(1, 2, 3, 1));
    assertFalse(ContainsDuplicate.solution1(1, 2, 3, 4));
    assertTrue(ContainsDuplicate.solution1(1, 1, 1, 3, 3, 4, 3, 2, 4, 2));
  }

  @Test
  void testSolution2() {
    assertTrue(ContainsDuplicate.solution2(1, 2, 3, 1));
    assertFalse(ContainsDuplicate.solution2(1, 2, 3, 4));
    assertTrue(ContainsDuplicate.solution2(1, 1, 1, 3, 3, 4, 3, 2, 4, 2));
  }

  @Test
  void testSolution3() {
    assertTrue(ContainsDuplicate.solution3(1, 2, 3, 1));
    assertFalse(ContainsDuplicate.solution3(1, 2, 3, 4));
    assertTrue(ContainsDuplicate.solution3(1, 1, 1, 3, 3, 4, 3, 2, 4, 2));
  }
}
