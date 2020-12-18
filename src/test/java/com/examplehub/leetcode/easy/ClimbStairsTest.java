package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClimbStairsTest {
  @Test
  void test() {
    assertEquals(0, ClimbStairs.solution1(0));
    assertEquals(1, ClimbStairs.solution1(1));
    assertEquals(2, ClimbStairs.solution1(2));
    assertEquals(3, ClimbStairs.solution1(3));
    assertEquals(5, ClimbStairs.solution1(4));
  }
}
