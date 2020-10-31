package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CharToIntTest {
  @Test
  void testCharToInt() {
    for (char i = 0, ch = '0'; ch <= '9'; i++, ch++) {
      assertEquals(i, CharToInt.toInt(ch));
      assertEquals(i, CharToInt.toInt2(ch));
      assertEquals(i, CharToInt.toInt3(ch));
    }
  }
}
