package com.examplehub.basics.reflection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckClassIfPresentTest {
  @Test
  void test() {
    try {
      Class cls = Class.forName("java.lang.String");
      assertTrue(true);
      assertEquals("String", cls.getSimpleName());
    } catch (ClassNotFoundException e) {
      fail();
    }

    try {
      Class cls = Class.forName("java.lang.MyString");
      fail();
    } catch (ClassNotFoundException e) {
      assertTrue(true);
    }
  }
}
