package com.examplehub.basics.constant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalExampleTest {
  @Test
  void test() {
    final double PI = 3.1415927;
    assertEquals(3.1415927, PI);

    //PI = 3.14; // cannot assign a value to final variable PI
  }

  @Test
  void testWithoutInit() {
    final double PI;
    //System.out.println(PI); // variable PI might not have been initialized
  }

  @Test
  void testInitLater() {
    final double PI;
    PI = 3.1415927;
    assertEquals(3.1415927, PI);
  }

  @Test
  void testStatic() {
     class MyMath {
      public static final double PI = 3.1415927;
    }
    assertEquals(3.1415927, MyMath.PI);
  }
}