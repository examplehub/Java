package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SelfDividingNumbersTest {
  @Test
  void testSolution1() {
    assertEquals(
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22),
        SelfDividingNumbers.solution1(1, 22));
  }
}
