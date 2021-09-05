package com.examplehub.basics.regex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatchesExampleTest {
  @Test
  void testGivenDigits() {
    String regex = "1\\d{10}";
    assertTrue("12345678910".matches(regex));
    assertFalse("123456789101".matches(regex));
    assertTrue("19999999999".matches(regex));
    assertFalse("09999999999".matches(regex));
    assertFalse("199999d9999".matches(regex));

    assertTrue("abc".matches("abc"));
    assertFalse("ABC".matches("abc"));
    assertFalse("Abc".matches("abc"));
  }

  @Test
  void testRangedDigits() {
    String regex = "a\\d{3,8}";
    assertTrue("a123".matches(regex));
    assertTrue("a1234".matches(regex));
    assertTrue("a1235".matches(regex));
    assertTrue("a12345".matches(regex));
    assertTrue("a123456".matches(regex));
    assertTrue("a12345678".matches(regex));

    assertFalse("a12".matches(regex));
    assertFalse("a1".matches(regex));
    assertFalse("a".matches(regex));
    assertFalse("a123a5678".matches(regex));
    assertFalse("a123456789".matches(regex));

    regex = "a\\d{2,}";
    assertTrue("a12".matches(regex));
    assertTrue("a123".matches(regex));
    assertTrue("a1234".matches(regex));
    assertTrue("a12345".matches(regex));
    assertTrue("a123456".matches(regex));
    assertTrue("a12341241234123413521542345326346543745875685698".matches(regex));
  }

  @Test
  void testDot() {
    String regex = "a.c";
    assertTrue("abc".matches(regex));
    assertTrue("a-c".matches(regex));
    assertTrue("a|c".matches(regex));
    assertTrue("a.c".matches(regex));

    assertFalse("ac".matches(regex));
    assertFalse("abbc".matches(regex));
  }

  @Test
  void testDigit() {
    String regex = "00\\d";
    assertTrue("007".matches(regex));
    assertTrue("009".matches(regex));

    assertFalse("0000".matches(regex));
    assertFalse("0001".matches(regex));
    assertFalse("00a".matches(regex));
    assertFalse("00A".matches(regex));
  }

  @Test
  void testNonDigit() {
    String regex = "00\\D";
    assertFalse("007".matches(regex));
    assertFalse("009".matches(regex));

    assertTrue("00A".matches(regex));
    assertTrue("00 ".matches(regex));
    assertTrue("00a".matches(regex));
    assertTrue("00#".matches(regex));
    assertTrue("00$".matches(regex));
    assertTrue("00\r".matches(regex));
    assertTrue("00\n".matches(regex));
  }

  @Test
  void testAnyDigit() {
    String regex = "\\d*";
    assertTrue("".matches(regex));
    assertTrue("1".matches(regex));
    assertTrue("01".matches(regex));
    assertTrue("012".matches(regex));

    assertFalse("a".matches(regex));
    assertFalse("a0".matches(regex));
    assertFalse("a01".matches(regex));
  }

  @Test
  void testOneMoreDigits() {
    String regex = "\\d+";

    assertFalse("".matches(regex));
    assertTrue("1".matches(regex));
    assertTrue("01".matches(regex));
    assertTrue("012".matches(regex));

    assertFalse("a".matches(regex));
    assertFalse("a0".matches(regex));
    assertFalse("a01".matches(regex));
  }

  @Test
  void testOneOrZeroDigit() {
    String regex = "a\\d?";

    assertTrue("a1".matches(regex));
    assertTrue("a".matches(regex));

    assertFalse("a123".matches(regex));
    assertFalse("ab".matches(regex));
  }

  @Test
  void testWord() {
    String regex = "java\\w";
    assertTrue("javac".matches(regex));
    assertTrue("java8".matches(regex));
    assertTrue("java_".matches(regex));

    assertFalse("javac8".matches(regex));
    assertFalse("java".matches(regex));
    assertFalse("java ".matches(regex));
    assertFalse("java$".matches(regex));
    assertFalse("java#".matches(regex));
  }

  @Test
  void testNonWord() {
    String regex = "java\\W";
    assertFalse("javac".matches(regex));
    assertFalse("java8".matches(regex));
    assertFalse("java_".matches(regex));
    assertFalse("javac8".matches(regex));
    assertFalse("java".matches(regex));
    assertTrue("java ".matches(regex));
    assertTrue("java$".matches(regex));
    assertTrue("java#".matches(regex));
  }

  @Test
  void testSpace() {
    String regex = "a\\sc";
    assertTrue("a c".matches(regex));
    assertTrue("a c".matches(regex));
    assertFalse("abc".matches(regex));
    assertTrue("a\rc".matches(regex));
    assertTrue("a\nc".matches(regex));
  }

  @Test
  void testPhoneNumber() {
    String regex = "[1-9]\\d{6,7}";
    assertTrue("12345678".matches(regex));
    assertTrue("1234567".matches(regex));
    assertFalse("01234567".matches(regex));
    assertFalse("0123456".matches(regex));
  }

  @Test
  void testHex() {
    String regex = "[0-9a-fA-F]{4}";
    assertTrue("aF30".matches(regex));
    assertTrue("abcd".matches(regex));
    assertTrue("ABCD".matches(regex));
    assertTrue("1234".matches(regex));
  }

  @Test
  void testExclude() {
    String regex = "[^1-9]{3}";
    assertTrue("A00".matches(regex));
    assertTrue("ABC".matches(regex));
    assertFalse("A01".matches(regex));
    assertFalse("A05".matches(regex));
  }

  @Test
  void testOr() {
    String regex = "java|python";
    assertTrue("java".matches(regex));
    assertTrue("python".matches(regex));
    assertFalse("go".matches(regex));

    regex = "learn\\s([jJ]ava|[pP]ython)";
    assertTrue("learn java".matches(regex));
    assertTrue("learn python".matches(regex));
    assertFalse("learn go".matches(regex));

    assertTrue("learn Java".matches(regex));
    assertTrue("learn Python".matches(regex));
  }
}
