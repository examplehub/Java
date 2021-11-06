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

  @Test
  void testValueOf() {
    Character c = Character.valueOf('A');
    assertEquals('A', c.charValue());
  }

  @Test
  void testAutoboxing() {
    Character c = 'A';
    System.out.println(c);
    assertEquals('A', c);
  }

  @Test
  void testIsLower() {
    assertFalse(Character.isLowerCase('A'));
    assertTrue(Character.isLowerCase('a'));
    assertFalse(Character.isLowerCase('1'));
  }

  @Test
  void testIsUpper() {
    assertTrue(Character.isUpperCase('A'));
    assertFalse(Character.isUpperCase('a'));
    assertFalse(Character.isUpperCase('1'));
  }

  @Test
  void testIsDigit() {
    System.out.println(Character.isDigit('A'));
    System.out.println(Character.isDigit('a'));
    System.out.println(Character.isDigit('1'));

    assertFalse(Character.isDigit('A'));
    assertFalse(Character.isDigit('a'));
    assertTrue(Character.isDigit('1'));
  }

  @Test
  void testToLower() {
    assertEquals('a', Character.toLowerCase('A'));
  }

  @Test
  void testToUpper() {
    assertEquals('A', Character.toUpperCase('a'));
  }

  @Test
  void testGetNumericValue() {
    System.out.println(Character.getNumericValue('8'));
    assertEquals(8, Character.getNumericValue('8'));

    System.out.println(Character.getNumericValue('A'));
    System.out.println(Character.getNumericValue('a'));
    assertEquals(10, Character.getNumericValue('A'));
    assertEquals(10, Character.getNumericValue('a'));
  }
}
