package com.examplehub.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem01Test {

  @Test
  void testSolution1() {

    assertEquals(0, Problem01.solution1(-100));
    assertEquals(0, Problem01.solution1(3));
    assertEquals(3, Problem01.solution1(4));
    assertEquals(23, Problem01.solution1(10));
    assertEquals(233168, Problem01.solution1(1000));
  }
}
