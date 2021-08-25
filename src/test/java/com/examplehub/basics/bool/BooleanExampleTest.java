package com.examplehub.basics.bool;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BooleanExampleTest {
  @Test
  void testCompareOperator() {
    boolean isGreater = 5 < 3;
    assertFalse(isGreater);

    int age = 25;
    boolean isZero = age == 0;
    assertFalse(isZero);

    boolean isNonZero = !isZero;
    assertTrue(isNonZero);

    boolean isAdult = age > 18;
    assertTrue(isAdult);

    boolean isTeenager = age > 6 && age < 18;
    assertFalse(isTeenager);
  }

  @Test
  void testShortCircuit() {
    boolean bool = false;
    boolean result = bool && (5 / 0 > 0);
    assertFalse(result);

    bool = true;
    try {
      result = bool && (5 / 0 > 0);
      fail(); // won't execute
    } catch (ArithmeticException arithmeticException) {
      assertTrue(true);
    }

    result = true || (5 / 0 > 0);
    assertTrue(result);
  }

  @Test
  void testTernaryOperator() {
    int num = -3;
    int abs = num < 0 ? -num : num;
    assertEquals(3, abs);
  }
}
