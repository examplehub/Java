package com.examplehub.basics.chars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringBuilderExampleTest {
  @Test
  void testAppend() {
    StringBuilder builder = new StringBuilder();
    builder.append("Hello").append(",").append("World").append("!");
    assertEquals("Hello,World!", builder.toString());
  }
}
