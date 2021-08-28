package com.examplehub.basics.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExtendExampleTest {
  @Test
  void test() {
    ExtendExample extendExample = new ExtendExample("Jack", 25, 180);
    assertEquals("Jack", extendExample.getName());
    assertEquals(25, extendExample.getAge());
    assertEquals(180, extendExample.getHeight());
  }
}
