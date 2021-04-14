package com.examplehub.leetcode.middle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingleElementInASortedArrayTest {
  @Test
  void testSolution1() {
    assertEquals(2, SingleElementInASortedArray.solution1(new int[] {1, 1, 2, 3, 3, 4, 4, 8, 8}));
    assertEquals(10, SingleElementInASortedArray.solution1(new int[] {3, 3, 7, 7, 10, 11, 11}));
  }

  @Test
  void testSolution2() {
    assertEquals(2, SingleElementInASortedArray.solution2(new int[] {1, 1, 2, 3, 3, 4, 4, 8, 8}));
    assertEquals(10, SingleElementInASortedArray.solution2(new int[] {3, 3, 7, 7, 10, 11, 11}));
  }
}
