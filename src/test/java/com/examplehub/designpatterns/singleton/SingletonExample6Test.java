package com.examplehub.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonExample6Test {
  @Test
  void test() {
    SingletonExample6 firstInstance = SingletonExample6.getInstance();
    SingletonExample6 secondInstance = SingletonExample6.getInstance();
    assertSame(firstInstance, secondInstance);
  }

  @Test
  void testMultiThreads() {
    //TODO
  }
}