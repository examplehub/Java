package com.examplehub.conversions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryToDecimalTest {
  @Test
  void testBinaryToDecimal() {
    assertEquals(0, BinaryToDecimal.toDecimal("0"));
    assertEquals(1, BinaryToDecimal.toDecimal("1"));
    assertEquals(10, BinaryToDecimal.toDecimal("1010"));
    assertEquals(-29, BinaryToDecimal.toDecimal("-11101"));
  }
}
