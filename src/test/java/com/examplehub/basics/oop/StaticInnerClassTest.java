package com.examplehub.basics.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StaticInnerClassTest {
  @Test
  void test() {
    StaticInnerClass.InnerClass innerClass = new StaticInnerClass.InnerClass();
    assertEquals("Hi, JACK", innerClass.sayHi());
  }
}
