package com.examplehub.basics.chars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CharExampleTest {
  @Test
  void testCharDeclaration() {
    char letter = 'A';
    assertEquals('A', letter);

    char ch = '中';
    assertEquals('中', ch);
  }

  @Test
  void testUnicode() {
    assertEquals(65, 'A');
    assertEquals(97, 'a');
    assertEquals(20013, '中');

    assertEquals('A', '\u0041');
    assertEquals('中', '\u4e2d');
  }

  @Test
  void testAddAndSub() {
    assertEquals('9', '0' + 9);
    assertEquals(43, '0' - 5);
    assertEquals(32, 'a' - 'A');
    assertEquals(9, '9' - '0');
    assertEquals(0, 'a' - 97);
  }
}
