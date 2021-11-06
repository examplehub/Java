package com.examplehub.basics.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MathUtilsExampleTest {

  @ParameterizedTest
  @ValueSource(ints = {0, 1, 10, 99, 1000, 9999999})
  void testAbs(int num) {
    assertEquals(num, Math.abs(num));
  }

  @ParameterizedTest
  @ValueSource(ints = {-10, -5, -1000})
  void testNegativeAbs(int num) {
    assertEquals(-num, Math.abs(num));
  }

  @Test
  void testMax() {
    assertEquals(3, Math.max(1, 3));
    assertEquals(-1, Math.max(-1, -3));
    assertEquals(-1.5, Math.max(-1.5, -3.27));
  }

  @Test
  void testMin() {
    assertEquals(1, Math.min(1, 3));
    assertEquals(-3, Math.min(-1, -3));
    assertEquals(-3.27, Math.min(-1.5, -3.27));
  }

  @Test
  void testPower() {
    assertEquals(1024, Math.pow(2, 10));
    assertEquals(512, Math.pow(2, 9));
  }

  @Test
  void testSqrt() {
    assertEquals(2, Math.sqrt(4));
    assertEquals(1.4142135623730951, Math.sqrt(2));
  }

  @Test
  void testRandom() {
    double randomNumber = Math.random();
    assertTrue(randomNumber >= 0 && randomNumber < 1);
  }

  @Test
  void testRound() {
    assertEquals(3, Math.round(3.14));
    assertEquals(4, Math.round(3.78));
    assertEquals(-3, Math.round(-3.14));
  }
}
