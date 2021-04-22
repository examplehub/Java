package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AbsoluteMaxTest {

  @Test
  void testAbsoluteMax() {
    assertEquals(-8, AbsoluteMax.absoluteMax(new int[]{1, -2, 5, -8, 7}));

    assertEquals(5, AbsoluteMax.absoluteMax(new int[]{1, 2, 3, -4, 5}));

    assertEquals(-10, AbsoluteMax.absoluteMax(new int[]{-10}));
  }
}
