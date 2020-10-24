package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AbsoluteMaxTest {

  @Test
  void testAbsoluteMax() {
    int[] ints = {1, -2, 5, -8, 7};
    assertEquals(-8, AbsoluteMax.absoluteMax(ints));

    ints = new int[] {1, 2, 3, -4, 5};
    assertEquals(5, AbsoluteMax.absoluteMax(ints));
  }
}
