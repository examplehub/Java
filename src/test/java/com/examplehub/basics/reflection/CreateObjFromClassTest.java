package com.examplehub.basics.reflection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreateObjFromClassTest {
  @Test
  void testCreateObj() throws InstantiationException, IllegalAccessException {
    Class cls = String.class;
    String str = (String) cls.newInstance();
    assertTrue(str.isEmpty());
  }
}
