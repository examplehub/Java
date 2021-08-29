package com.examplehub.basics.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SetterGetterTest {
  @Test
  void test() {
    SetterGetter setterGetter = new SetterGetter();
    setterGetter.setName("Jack");
    setterGetter.setAge(25);
    assertEquals("Jack", setterGetter.getName());
    assertEquals(25, setterGetter.getAge());

    try {
      setterGetter.setAge(-1);
      fail(); /* won't happen */
    } catch (IllegalArgumentException e) {
      assertTrue(true);
    }
  }
}
