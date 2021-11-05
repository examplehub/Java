package com.examplehub.basics.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleExampleTest {
  @Test
  void testValueOf() {
    Double d = Double.valueOf(3.14);
    System.out.println(d.doubleValue());
    assertEquals(3.14, d.doubleValue());

    d = Double.valueOf("3.14159");
    System.out.println(d.doubleValue());
    assertEquals(3.14159, d.doubleValue());
  }

  @Test
  void testIsNaN() {
    Double d = 0.0 / 0;
    assertEquals(d, Double.NaN);
  }

  @Test
  void testAutoboxing() {
    Double d = 3.14;
    assertEquals(3.14, d.doubleValue());
    double pi = d;
    assertEquals(3.14, pi);
  }
}