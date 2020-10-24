package com.examplehub.leetcode.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MedianOfTwoSortedArraysTest {

  @Test
  void testSolution1() {
    assertEquals(2.0, MedianOfTwoSortedArrays.solution1(new double[] {1, 3}, new double[] {2}));
    assertEquals(2.5, MedianOfTwoSortedArrays.solution1(new double[] {1, 2}, new double[] {3, 4}));
    assertEquals(0.0, MedianOfTwoSortedArrays.solution1(new double[] {0, 0}, new double[] {0, 0}));
    assertEquals(1.0, MedianOfTwoSortedArrays.solution1(new double[] {}, new double[] {1}));
  }
}
