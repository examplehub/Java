package com.examplehub.basics.regex;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SplitReplaceExampleTest {
  @Test
  void testSplit() {
    assertEquals("[a, b, c]", Arrays.toString("a b c".split("\\s")));
    assertEquals("[a, b, , c]", Arrays.toString("a b  c".split("\\s")));
    assertEquals("[a, b, c]", Arrays.toString("a, b ;; c".split("[,;\\s]+")));
  }
}