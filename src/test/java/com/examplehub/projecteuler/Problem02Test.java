package com.examplehub.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem02Test {
  @Test
  void testSolution1() {
    assertEquals(10, Problem02.solution1(10));
    assertEquals(4613732, Problem02.solution1(4000000));
  }
}
