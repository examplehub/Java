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

  @Test
  void testInitCapacity() {
    String firstStr = "123456789";
    String secondStr = "987654321";
    String thirdStr = "abcef";

    StringBuilder builder =
        new StringBuilder(firstStr.length() + secondStr.length() + thirdStr.length());
    assertEquals(
        "123456789987654321abcef",
        builder.append(firstStr).append(secondStr).append(thirdStr).toString());
  }
}
