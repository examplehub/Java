package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThirdMaximumNumberTest {
  @Test
  void testSolution1() {
    assertEquals(1, ThirdMaximumNumber.solution1(3, 2, 1));
    assertEquals(2, ThirdMaximumNumber.solution1(1, 2));
    assertEquals(1, ThirdMaximumNumber.solution1(2, 2, 3, 1));
  }
}
