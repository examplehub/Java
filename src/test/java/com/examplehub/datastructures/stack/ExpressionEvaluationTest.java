package com.examplehub.datastructures.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpressionEvaluationTest {

  @Test
  void evaluate() throws Exception {
    assertEquals(5, 2 + 3);
    assertEquals(-1, 2 - 3);
    assertEquals(0, 2 / 3);
    assertEquals(6, 2 * 3);
    assertEquals(80, ExpressionEvaluation.evaluate("1+(2*3^4)/2-2"));
    assertEquals(80, ExpressionEvaluation.evaluate("1 + (2 * 3 ^ 4) / 2 - 2"));
  }
}
