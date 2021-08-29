package com.examplehub.basics.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UpcastExampleTest {
  @Test
  void test() {
    UpClass upClass = new UpcastExample("Jack", 26, 180);
    assertEquals("Jack", upClass.getName());
    assertEquals(26, upClass.getAge());
    assertEquals(180, ((UpcastExample) upClass).getHeight());
  }
}
