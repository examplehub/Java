package com.examplehub.basics.regex;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SplitReplaceExampleTest {
  @Test
  void testSplit() {
    assertEquals("[a, b, c]", Arrays.toString("a b c".split("\\s")));
    assertEquals("[a, b, , c]", Arrays.toString("a b  c".split("\\s")));
    assertEquals("[a, b, c]", Arrays.toString("a, b ;; c".split("[,;\\s]+")));
  }
}
