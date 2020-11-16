package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJumpTest {

  @Test
  void test() {
    assertEquals(1, FrogJump.canCross(0, 0));
    assertEquals(2, FrogJump.canCross(1, 0));
    assertEquals(3, FrogJump.canCross(2, 0));
    assertEquals(4, FrogJump.canCross(1, 1));
    assertEquals(6, FrogJump.canCross(2, 1));
  }
}
