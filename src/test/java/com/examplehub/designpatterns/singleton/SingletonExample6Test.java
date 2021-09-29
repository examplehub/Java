package com.examplehub.designpatterns.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonExample6Test {
  @Test
  void test() {
    SingletonExample6 firstInstance = SingletonExample6.getInstance();
    SingletonExample6 secondInstance = SingletonExample6.getInstance();
    assertSame(firstInstance, secondInstance);
  }

  @Test
  void testMultiThreads() {
    // TODO
  }
}
