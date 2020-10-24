package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImplementStrStrTest {

  @Test
  void testSolution1() {
    assertEquals(2, ImplementStrStr.solution1("hello", "ll"));
    assertEquals(-1, ImplementStrStr.solution1("aaaaa", "bba"));
    assertEquals(0, ImplementStrStr.solution1("", ""));
  }

  @Test
  void testSolution2() {
    assertEquals(2, ImplementStrStr.solution2("hello", "ll"));
    assertEquals(-1, ImplementStrStr.solution2("aaaaa", "bba"));
    assertEquals(0, ImplementStrStr.solution2("", ""));
  }
}
