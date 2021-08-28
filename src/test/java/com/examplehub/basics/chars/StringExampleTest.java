package com.examplehub.basics.chars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import java.util.Arrays;

public class StringExampleTest {
  @Test
  void testInit() {
    String abc = "abc";
    assertEquals("abc", abc);

    abc = new String("abc");
    assertEquals("abc", abc);

    abc = String.valueOf("abc");
    assertEquals("abc", abc);

    abc = String.valueOf(new char[] {'a', 'b', 'c'});
    assertEquals("abc", abc);
  }

  @Test
  void testEqual() {
    String s1 = "hello";
    String s2 = "hello";
    assertTrue(s1 == s2);
    assertTrue(s1.equals(s2));

    String s3 = "world";
    String s4 = "WORLD".toLowerCase();
    assertTrue(s3  != s4);
    assertTrue(s3.equals(s4));
  }

  @Test
  void testLength() {
    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    assertEquals(26, abc.length());
  }

  @Test
  void testToLowerCase() {
    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    assertEquals("abcdefghijklmnopqrstuvwxyz", abc.toLowerCase());
  }

  @Test
  void testIndexOf() {
    String filename = "abc.txt";
    assertEquals(3, filename.indexOf(".txt"));
    assertEquals(3, filename.indexOf("."));
    assertEquals("abc", filename.substring(0, filename.indexOf(".")));
  }

  @Test
  void testLastIndexOf() {
    String str = "abcabcabc";
    assertEquals(6, str.lastIndexOf("abc"));
    assertEquals(-1, str.lastIndexOf("cc"));
  }

  @Test
  void testStartWith() {
    String str = "https://www.google.com";
    assertTrue(str.startsWith("https"));
    assertTrue(str.startsWith("http"));
    assertFalse(str.startsWith("ftp"));
  }

  @Test
  void testEndWith() {
    String str = "https://www.google.com";
    assertTrue(str.endsWith(".com"));
    assertFalse(str.endsWith(".co"));
  }

  @Test
  void testSubstring() {
    String str = "helloworld";
    assertEquals("world", str.substring(5));
    assertEquals("hello", str.substring(0, 5));
    assertEquals("ll", str.substring(2, 4));
  }

  @Test
  void testConcat() {
    String s1 = "hello";
    String s2 = " world!";
    assertEquals("hello world!", s1 + s2);
    assertEquals("hello world!", s1.concat(s2));

    int age = 25;
    assertEquals("I'm 25.", "I'm ".concat(25 + "."));
  }

  //    @Test
  //    void testTextBlocks() {
  // String sql = """
  //                   SELECT * FROM
  //                     users
  //                   WHERE id > 100
  //                   ORDER BY name DESC
  //                   """;
  //    }

  @Test
  void testFinal() {
    String s = "hello";
    String t = s;
    assertEquals(s, t);

    s = "world";

    assertEquals("world", s);
    assertEquals("hello", t);
  }

  @Test
  void testNull() {
    String s = null;
    assertNull(s);

    String s2;
    // assertEquals(s2); //Variable 's2' might not have been initialized

    String s3 = "";
    assertNotNull(s3);
  }

  @Test
  void testContains() {
    assertTrue("hello".contains("el"));
    assertFalse("hello".contains("le"));
  }

  @Test
  void testTrim() {
    String str = "       \n\t   \r  hello   \n\t";
    assertEquals("hello", str.trim());
  }

  @Test
  void testStrip() {
    assertEquals("hello", "\u3000hello\u3000".strip());
    String str = "       \n\t   \r  hello   \n\t";
    assertEquals("hello", str.strip());
    assertEquals("hello ", "  hello ".stripLeading());
    assertEquals(" hello", " hello ".stripTrailing());
  }
  @Test
  void testIsEmpty() {
    assertTrue("".isEmpty());
    assertFalse(" ".isEmpty());
  }

  @Test
  void isBlank() {
    assertTrue("   \n".isBlank());
    assertFalse("    hello".isBlank());
  }

  @Test
  void testReplace() {
    String str = "hello";
    assertEquals("heooo", str.replace("l", "o"));
    assertEquals("heooo", str.replace("ll", "oo"));
    assertEquals(str, str.replace("ha", "foo"));
  }

  @Test
  void testReplaceAll() {
    String str = "A,,B;C ,D";
    assertEquals("A,B,C,D", str.replaceAll("[,;\\s]+", ","));
  }

  @Test
  void testSplit() {
    String str = "A,B,C,D";
    String[] ss = str.split(",");
    assertEquals("[A, B, C, D]", Arrays.toString(ss));
  }

  @Test
  void testJoin() {
    String[] ss = {"A", "B", "C"};
    assertEquals("A->B->C", String.join("->", ss));
  }

  @Test
  void testFormat() {
    String sql = "select * from %s where id = %d";
    assertEquals("select * from user where id = 5", String.format(sql, "user", 5));
  }

  @Test
  void testToString() {
    assertEquals("123", String.valueOf(123));
    assertEquals("12.34", String.valueOf(12.34));
    assertEquals("true", String.valueOf(true));
    Object obj = new Object();
    assertEquals(obj.toString(), String.valueOf(obj));
  }

  @Test
  void testParseInt() {
    assertEquals(123, Integer.parseInt("123"));
    assertEquals(255, Integer.parseInt("ff", 16));
  }

}
