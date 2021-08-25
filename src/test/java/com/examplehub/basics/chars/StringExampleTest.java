package com.examplehub.basics.chars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
}
