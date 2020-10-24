package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumToNRecursionTest {
  @Test
  void testSum() {
    assertEquals(0, SumToNRecursion.sum(0));
    assertEquals(1, SumToNRecursion.sum(1));
    assertEquals(3, SumToNRecursion.sum(2));
    assertEquals(55, SumToNRecursion.sum(10));
    assertEquals(5050, SumToNRecursion.sum(100));
  }
}
