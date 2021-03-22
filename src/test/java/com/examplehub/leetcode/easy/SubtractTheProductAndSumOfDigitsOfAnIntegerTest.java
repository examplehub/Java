package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {
  @Test
  void testSolution1() {
    assertEquals(SubtractTheProductAndSumOfDigitsOfAnInteger.solution1(234), 15);
    assertEquals(SubtractTheProductAndSumOfDigitsOfAnInteger.solution1(4421), 21);
  }
}
