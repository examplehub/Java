package com.examplehub.basics.number;

import static org.junit.jupiter.api.Assertions.*;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class IntegerExampleTest {

  @Test
  void testValueOf() {
    Integer integer = Integer.valueOf(100);
    System.out.println(integer);
    assertEquals(100, integer.intValue());

    integer = Integer.valueOf("123");
    System.out.println(integer);
    assertEquals(123, integer.intValue());

    integer = Integer.valueOf("a", 16);
    System.out.println(integer);
    assertEquals(10, integer.intValue());
  }

  @Test
  void testParseInt() {
    int number = Integer.parseInt("123");
    System.out.println(number);
    assertEquals(123, number);

    assertThrows(NumberFormatException.class, () -> {
      int num = Integer.parseInt("123a");
      fail();
    });
  }

  @Test
  void testAutoBoxing() {
    Integer integer = 10;
    assertEquals(10, integer.intValue());
    Integer integer1 = 10;
    assertTrue(integer == integer1);
    assertTrue(integer.equals(integer1));

    Integer first = 128;
    Integer second = 128;
    System.out.println(first == second);
    assertNotSame(first, second);
  }

  @Test
  void testAutoBoxingNullPointer() {
    Integer integer = null;
    try {
      int intVal = integer;
      fail(); // won't happen
    } catch (NullPointerException nullPointerException) {
      assertTrue(true);
    }
  }

  @Test
  void testToBinaryString() {
    assertEquals("1010", Integer.toBinaryString(10));
  }

  @Test
  void testToOctalString() {
    assertEquals("12", Integer.toOctalString(10));
  }

  @Test
  void test(){
    assertEquals("a", Integer.toHexString(10));
  }
}
