package com.examplehub.conversions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryToOctalTest {

  @Test
  void testBinaryToOctal() {
    assertEquals("17", BinaryToOctal.toOctal("1111"));
    assertEquals("7", BinaryToOctal.toOctal("111"));
    assertEquals("1274", BinaryToOctal.toOctal("1010111100"));
  }
}
