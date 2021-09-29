package com.examplehub.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonExample5Test {
  @Test
  void test() {
    SingletonExample5 firstInstance = SingletonExample5.getInstance();
    SingletonExample5 secondInstance = SingletonExample5.getInstance();
    assertSame(firstInstance, secondInstance);
  }

  @Test
  void testMultiThreads() {
    //TODO
  }
}