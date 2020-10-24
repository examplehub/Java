package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class SumOfArrayTest {
  @Test
  void testSum() {
    assertEquals(55, SumOfArray.sum(IntStream.range(1, 11).toArray()));
    assertEquals(5050, SumOfArray.sum(IntStream.range(1, 101).toArray()));
  }

  @Test
  void testSumWithLambda() {
    assertEquals(55, SumOfArray.sumWithLambda(IntStream.range(1, 11).toArray()));
    assertEquals(5050, SumOfArray.sumWithLambda(IntStream.range(1, 101).toArray()));
  }

  @Test
  void testSumRecursion() {
    assertEquals(55, SumOfArray.sum(IntStream.range(1, 11).toArray()), 10);
    assertEquals(5050, SumOfArray.sum(IntStream.range(1, 101).toArray()), 100);
  }
}
