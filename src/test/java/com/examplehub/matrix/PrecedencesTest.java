package com.examplehub.matrix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrecedencesTest {
  @Test
  void testPrecedences() {
    assertTrue(Precedences.compare("*", "+") > 0);
    assertTrue(Precedences.compare("*", "-") > 0);
    assertEquals(Precedences.compare("+", "-"), 0);
    assertTrue(Precedences.compare("*", "/") >= 0);
  }
}
