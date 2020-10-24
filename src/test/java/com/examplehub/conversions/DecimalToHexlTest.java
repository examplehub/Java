package com.examplehub.conversions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DecimalToHexlTest {
  @Test
  void testDecimalToOctal() {
    assertEquals(Integer.toString(0, 16), DecimalToHex.toHex(0));
    assertEquals(Integer.toString(6, 16), DecimalToHex.toHex(6));
    assertEquals(Integer.toString(111, 16), DecimalToHex.toHex(111));
    assertEquals(Integer.toString(-1111, 16), DecimalToHex.toHex(-1111));
  }
}
