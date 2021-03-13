package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberOfGoodPairsTest {
  @Test
  void testSolution1() {
    int[] numbers = new int[] {1, 2, 3, 1, 1, 3};
    assertEquals(4, NumberOfGoodPairs.solution1(numbers));

    numbers = new int[] {1, 1, 1, 1};
    assertEquals(6, NumberOfGoodPairs.solution1(numbers));
  }
}
