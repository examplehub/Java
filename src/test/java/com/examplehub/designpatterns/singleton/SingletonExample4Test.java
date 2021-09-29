package com.examplehub.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonExample4Test {
  @Test
  void test() {
    SingletonExample4 firstInstance = SingletonExample4.getInstance();
    SingletonExample4 secondInstance = SingletonExample4.getInstance();
    assertSame(firstInstance, secondInstance);
  }

  @Test
  void testMultiThreads() {
    //TODO
  }
}