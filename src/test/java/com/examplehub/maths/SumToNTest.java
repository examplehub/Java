package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumToNTest {

  @Test
  void testSum() {
    assertEquals(0, SumToN.sum(0));
    assertEquals(1, SumToN.sum(1));
    assertEquals(3, SumToN.sum(2));
    assertEquals(55, SumToN.sum(10));
    assertEquals(5050, SumToN.sum(100));
  }
}
