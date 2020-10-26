package com.examplehub.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrecedencesTest {
  @Test
  void testPrecedences() {
    assertTrue(Precedences.compare("*", "+") > 0);
    assertTrue(Precedences.compare("*", "-") > 0);
    assertEquals(Precedences.compare("+", "-"), 0);
    assertTrue(Precedences.compare("*", "/") >= 0);
  }
}