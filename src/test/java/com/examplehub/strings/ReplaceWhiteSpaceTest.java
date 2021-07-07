package com.examplehub.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReplaceWhiteSpaceTest {
  @Test
  void testSolution1() {
    assertEquals("We%20are%20happy.", ReplaceWhiteSpace.solution1("We are happy.", "%20"));
  }

  @Test
  void testSolution2() {
    assertEquals("We%20are%20happy.", ReplaceWhiteSpace.solution2("We are happy.", "%20"));
  }
}
