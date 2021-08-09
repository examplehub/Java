package com.examplehub.basics.lambda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumWithLambdaTest {
  @Test
  void testLambda() {
    SumWithLambda sumWithLambda =
        n -> {
          int total = 0;
          for (int i = 1; i <= n; ++i) {
            total = total + i;
          }
          return total;
        };
    assertEquals(5050, sumWithLambda.sum(100));
  }
}
