package com.examplehub.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonExample3Test {
  @Test
  void test() {
    SingletonExample3 firstInstance = SingletonExample3.INSTANCE;
    SingletonExample3 secondInstance = SingletonExample3.INSTANCE;
    assertEquals(firstInstance.hashCode(), secondInstance.hashCode());
  }
}