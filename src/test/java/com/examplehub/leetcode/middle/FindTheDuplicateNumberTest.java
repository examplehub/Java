package com.examplehub.leetcode.middle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindTheDuplicateNumberTest {
  @Test
  void testSolution1() {
    assertEquals(2, FindTheDuplicateNumber.solution1(new int[] {1, 3, 4, 2, 2}));
    assertEquals(3, FindTheDuplicateNumber.solution1(new int[] {3, 1, 3, 4, 2}));
    assertEquals(1, FindTheDuplicateNumber.solution1(new int[] {1, 1}));
    assertEquals(1, FindTheDuplicateNumber.solution1(new int[] {1, 1, 2}));
  }

  @Test
  void testSolution2() {
    assertEquals(2, FindTheDuplicateNumber.solution2(new int[] {1, 3, 4, 2, 2}));
    assertEquals(3, FindTheDuplicateNumber.solution2(new int[] {3, 1, 3, 4, 2}));
    assertEquals(1, FindTheDuplicateNumber.solution2(new int[] {1, 1}));
    assertEquals(1, FindTheDuplicateNumber.solution2(new int[] {1, 1, 2}));
  }
}
