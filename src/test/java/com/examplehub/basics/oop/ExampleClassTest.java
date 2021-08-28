package com.examplehub.basics.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleClassTest {
  @Test
  void test() {
    ExampleClass exampleClass = new ExampleClass();
    exampleClass.name = "duyuanchao";
    exampleClass.age = 25;
    assertEquals("duyuanchao", exampleClass.name);
    assertEquals(25, exampleClass.age);
  }
}
