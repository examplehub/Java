package com.examplehub.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem07Test {
  @Test
  void testSolution1() {
    assertEquals(2, Problem07.solution(1));
    assertEquals(3, Problem07.solution(2));
    assertEquals(5, Problem07.solution(3));
    assertEquals(7, Problem07.solution(4));
    assertEquals(13, Problem07.solution(6));
    assertEquals(104743, Problem07.solution(10001));
  }
}
