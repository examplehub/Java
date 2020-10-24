package com.examplehub.conversions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryToHexadecimalTest {

  @Test
  void testBinaryHexadecimal() {
    assertEquals("7", BinaryToHexadecimal.toHexadecimal("0111"));
    assertEquals("F", BinaryToHexadecimal.toHexadecimal("1111"));
    assertEquals("1569", BinaryToHexadecimal.toHexadecimal("1010101101001"));
  }
}
