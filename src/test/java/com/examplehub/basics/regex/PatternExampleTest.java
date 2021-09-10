package com.examplehub.basics.regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class PatternExampleTest {
  @Test
  void testGroup() {
    Pattern pattern = Pattern.compile("(\\d{3,4})-(\\d{7,8})");
    Matcher matcher = pattern.matcher("010-12345678");
    assertTrue(matcher.matches());
    assertEquals("010-12345678", matcher.group(0));
    assertEquals("010", matcher.group(1));
    assertEquals("12345678", matcher.group(2));
  }

  @Test
  void testMatcher() {
    Pattern pattern = Pattern.compile("(\\d{3,4})-(\\d){7,8}");
    assertTrue(pattern.matcher("010-12345678").matches());
    assertTrue(pattern.matcher("010-1234567").matches());
    assertTrue(pattern.matcher("0101-1234567").matches());
    assertTrue(pattern.matcher("0101-12345678").matches());
    assertFalse(pattern.matcher("010#12345678").matches());
    assertFalse(pattern.matcher("010-123456789").matches());

    pattern = Pattern.compile("(\\d??)(9*)");
    Matcher matcher = pattern.matcher("999999999999");
    assertTrue(matcher.matches());
    assertEquals("999999999999", matcher.group(0));
    assertEquals("", matcher.group(1));
    assertEquals("999999999999", matcher.group(2));

    pattern = Pattern.compile("(\\d?)(9*)");
    matcher = pattern.matcher("999999999999");
    assertTrue(matcher.matches());
    assertEquals("999999999999", matcher.group(0));
    assertEquals("9", matcher.group(1));
    assertEquals("99999999999", matcher.group(2));
  }

  @Test
  void testGetTime() {
    Pattern pattern = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})");
    Matcher matcher = pattern.matcher("23:01:59");
    assertTrue(matcher.matches());
    assertEquals("23:01:59", matcher.group(0));
    assertEquals("23", matcher.group(1));
    assertEquals("01", matcher.group(2));
    assertEquals("59", matcher.group(3));
  }

  @Test
  void testGetZero() {
    Pattern pattern = Pattern.compile("(\\d+?)(0*)");
    Matcher matcher = pattern.matcher("1230000");
    assertTrue(matcher.matches());
    assertEquals("1230000", matcher.group(0));
    assertEquals("123", matcher.group(1));
    assertEquals("0000", matcher.group(2));
  }

  @Test
  void testGetZeroVersion2() {
    Pattern pattern = Pattern.compile("([1-9]*)(0*)");
    Matcher matcher = pattern.matcher("1230000");
    assertTrue(matcher.matches());
    assertEquals("1230000", matcher.group(0));
    assertEquals("123", matcher.group(1));
    assertEquals("0000", matcher.group(2));
  }
}