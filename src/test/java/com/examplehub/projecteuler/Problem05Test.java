package com.examplehub.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem05Test {
  @Test
  void testSolution1() {
    assertEquals(2520, Problem05.solution1(10));
    assertEquals(360360, Problem05.solution1(15));
    assertEquals(232792560, Problem05.solution1(20));
  }
}
