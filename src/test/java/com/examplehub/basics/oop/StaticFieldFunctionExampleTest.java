package com.examplehub.basics.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StaticFieldFunctionExampleTest {
  @Test
  void test() {
    var staticFieldFunctionExample = new StaticFieldFunctionExample();
    staticFieldFunctionExample = new StaticFieldFunctionExample();
    staticFieldFunctionExample = new StaticFieldFunctionExample();
    assertEquals(3, StaticFieldFunctionExample.getCount());
    assertEquals(1, staticFieldFunctionExample.getNum());
  }
}
