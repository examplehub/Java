package com.examplehub.basics.conversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TypeConversionExampleTest {
  @Test
  void testObjectConversion() {
    class A {}
    class B {}
    // A a = new B(); // incompatible types: B cannot be converted to A

    class Father {}
    class Son extends Father {}
    Father father = new Son(); // ok
    assertThrows(
        ClassCastException.class,
        () -> {
          Son son = (Son) new Father();
        });
  }
}
