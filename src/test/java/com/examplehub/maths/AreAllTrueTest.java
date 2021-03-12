package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AreAllTrueTest {
  @Test
  void test() {
    assertTrue(AreAllTrue.areAllTrue(new boolean[] {true, true, true, true}));
    assertFalse(AreAllTrue.areAllTrue(new boolean[] {true, true, true, false}));
    assertFalse(AreAllTrue.areAllTrue(new boolean[] {true, false, true, false}));
  }
}
