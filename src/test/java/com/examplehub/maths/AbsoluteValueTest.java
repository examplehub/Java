package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AbsoluteValueTest {

  @Test
  void test() {
    assertEquals(AbsoluteValue.absoluteValue(-1), Math.abs(-1));
    assertEquals(AbsoluteValue.absoluteValue(0), Math.abs(0));
    assertEquals(AbsoluteValue.absoluteValue(1), Math.abs(1));
    assertEquals(AbsoluteValue.absoluteValue(100), Math.abs(-100));
  }
}
