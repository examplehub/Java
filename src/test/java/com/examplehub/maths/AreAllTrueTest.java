package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AreAllTrueTest {
  @Test
  void test() {
    assertTrue(AreAllTrue.areAllTrue(true, true, true, true));
    assertFalse(AreAllTrue.areAllTrue(true, true, true, false));
    assertFalse(AreAllTrue.areAllTrue(true, false, true, false));
    assertFalse(AreAllTrue.areAllTrue(false));
    assertTrue(AreAllTrue.areAllTrue(true));
  }
}
