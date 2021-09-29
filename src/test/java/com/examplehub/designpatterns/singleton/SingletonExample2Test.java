package com.examplehub.designpatterns.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonExample2Test {
  @Test
  void test() {
    SingletonExample2 firstInstance = SingletonExample2.getInstance();
    SingletonExample2 secondInstance = SingletonExample2.getInstance();
    assertEquals(firstInstance.hashCode(), secondInstance.hashCode());
  }
}
