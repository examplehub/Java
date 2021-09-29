package com.examplehub.designpatterns.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonExample3Test {
  @Test
  void test() {
    SingletonExample3 firstInstance = SingletonExample3.INSTANCE;
    SingletonExample3 secondInstance = SingletonExample3.INSTANCE;
    assertEquals(firstInstance.hashCode(), secondInstance.hashCode());
  }
}
