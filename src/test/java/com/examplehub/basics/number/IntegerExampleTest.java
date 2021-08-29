package com.examplehub.basics.number;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntegerExampleTest {
  @Test
  void testAutoBoxing() {
    Integer integer = 10;
    assertEquals(10, integer.intValue());
    Integer integer1 = 10;
    assertTrue(integer == integer1);
    assertTrue(integer.equals(integer1));
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
}
