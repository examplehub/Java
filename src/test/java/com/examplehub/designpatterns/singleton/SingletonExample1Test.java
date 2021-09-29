package com.examplehub.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonExample1Test {
  @Test
  void test() {
    SingletonExample1 firstInstance = SingletonExample1.getInstance();
    SingletonExample1 secondInstance = SingletonExample1.getInstance();
    assertEquals(firstInstance.hashCode(), secondInstance.hashCode());
  }
}