package com.examplehub.basics.generic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GenericClassTest {
  @Test
  void testWriteGenericClass() {
    class MyBean<T> {
      T value;

      public T getValue() {
        return value;
      }

      public void setValue(T value) {
        this.value = value;
      }
    }
    MyBean<Integer> bean1 = new MyBean<>();
    bean1.setValue(123);
    assertEquals(123, bean1.getValue());
  }
}
