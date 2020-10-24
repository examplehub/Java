package com.examplehub.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem25Test {
  @Test
  void testSolution1() {
    assertEquals(12, Problem25.solution1(3));
  }

  @Test
  void testSolution2() {
    assertEquals(4782, Problem25.solution2(1000));
  }
}
