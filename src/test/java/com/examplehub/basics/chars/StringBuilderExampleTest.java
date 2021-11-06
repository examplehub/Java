package com.examplehub.basics.chars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringBuilderExampleTest {

  @Test
  void testToString() {
    StringBuilder builder = new StringBuilder("hello123");
    assertEquals("hello123", builder.toString());
  }
  @Test
  void testCapacity() {
    StringBuilder sb = new StringBuilder();
    assertEquals(16, sb.capacity());

    sb = new StringBuilder(20);
    assertEquals(20, sb.capacity());

    sb = new StringBuilder("abc123");
    assertEquals(22, sb.capacity());
  }

  @Test
  void testAppend() {
      StringBuilder builder = new StringBuilder();
      builder.append("Hello").append(",").append("World").append("!");
      assertEquals("Hello,World!", builder.toString());
  }

  @Test
  void testInsert() {
    StringBuilder builder = new StringBuilder("abc");
    builder.insert(0, "123");
    assertEquals("123abc", builder.toString());
    builder.insert(3, "45");
    assertEquals("12345abc", builder.toString());
    builder.insert(builder.length(), "!");
    assertEquals("12345abc!", builder.toString());
  }

  @Test
  void testDeleteCharAt() {
    StringBuilder builder = new StringBuilder("hello123abc");
    builder.deleteCharAt(0);
    assertEquals("ello123abc", builder.toString());

    //delete ello
    for (int i = 1; i <= 4; i++) {
      builder.deleteCharAt(0);
    }
    assertEquals("123abc", builder.toString());
    builder.deleteCharAt(builder.length() - 1);
    assertEquals("123ab", builder.toString());
  }

  @Test
  void testDelete() {
    StringBuilder builder = new StringBuilder("123abcABC");
    builder.delete(0, 3); // delete "123"
    assertEquals("abcABC", builder.toString());
    builder.delete(3, builder.length()); // delete "ABC"
    assertEquals("abc", builder.toString());
  }

  @Test
  void testCharAt() {
    StringBuilder builder = new StringBuilder("0123456789abc");
    assertEquals('a', builder.charAt(10));

    for (int i = 0; i <= 9; ++i) {
      assertEquals('0' + i, builder.charAt(i));
    }
  }

  @Test
  void testSetCharAt() {
    StringBuilder builder = new StringBuilder("abC123");
    builder.setCharAt(2, 'c');
    assertEquals("abc123", builder.toString());
  }

  @Test
  void testReplace() {
    StringBuilder builder = new StringBuilder("abc123");
    builder.replace(0, 3, "ABC");
    assertEquals("ABC123", builder.toString());
  }

  @Test
  void testIndexOf() {
    StringBuilder builder = new StringBuilder("abc123abc");
    assertEquals(1, builder.indexOf("bc"));
    assertEquals(7, builder.indexOf("bc", 3));
  }

  @Test
  void testLastIndexOf() {
    StringBuilder builder = new StringBuilder("abc123abc");
    assertEquals(7, builder.lastIndexOf("bc"));
    assertEquals(6, builder.lastIndexOf("abc", 6));
  }
}
