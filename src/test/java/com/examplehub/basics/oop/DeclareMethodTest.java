package com.examplehub.basics.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeclareMethodTest {
  @Test
  void test() {
    DeclareMethod declareMethod = new DeclareMethod();
    declareMethod.setName("Jack");
    declareMethod.setAge(25);

    assertEquals("I'm Jack. I'm 25", declareMethod.intro());
  }
}
