package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumToNFormulaTest {
  @Test
  void test() {
    assertEquals(55, SumToNFormula.sum(10));
    assertEquals(5050, SumToNFormula.sum(100));
  }
}
