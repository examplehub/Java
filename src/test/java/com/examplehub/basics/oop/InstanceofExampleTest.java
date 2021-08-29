package com.examplehub.basics.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InstanceofExampleTest {
  @Test
  void test() {
    String str = "hello world";
    assertTrue(str instanceof String);
    assertTrue(str instanceof Object);
  }
}
