package com.examplehub.basics.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InnerClassExampleTest {
  @Test
  void test() {
    OuterClass outerClass = new OuterClass("jack");
    assertEquals("jack", outerClass.getName());
    OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    assertEquals("Hi, jack", innerClass.sayHi());
  }
}
