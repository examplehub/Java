package com.examplehub.basics.reflection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GetSupperClassTest {
  @Test
  void test() {
    Class cls = Integer.class;
    assertEquals(Number.class, cls.getSuperclass());
    assertEquals(Object.class, cls.getSuperclass().getSuperclass());
    assertEquals(null, cls.getSuperclass().getSuperclass().getSuperclass());
  }
}
