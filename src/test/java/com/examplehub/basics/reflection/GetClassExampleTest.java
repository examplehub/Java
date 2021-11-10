package com.examplehub.basics.reflection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.time.Month;

class GetClassExampleTest {

  @Test
  void testVoid() {
    Class<Void> c = void.class;
    assertEquals("void", c.getName());
    assertEquals("void", c.getSimpleName());
    assertEquals("java.lang", c.getPackageName());
    assertEquals("void", c.toString());
  }

  @Test
  void testGetClass() throws ClassNotFoundException {
    Class<String> cls = String.class;
    Class<?> cls2 = "hello".getClass();
    Class<?> cls3 = Class.forName("java.lang.String");
    assertSame(cls, cls2);
    assertSame(cls, cls3);
  }

  @Test
  void testGetClassByTYPE() {
    Class<?> c = Integer.TYPE;
    assertEquals("int", c.getName());
    assertEquals("int", c.getSimpleName());
    assertEquals("java.lang", c.getPackageName());
    assertEquals("int", c.toString());
    assertTrue(c.isPrimitive());
  }

  @Test
  void testGetClassByClassloader() throws ClassNotFoundException {
    ClassLoader classLoader = GetClassExample.class.getClassLoader();
    Class<?> cls = classLoader.loadClass("java.lang.String");
    assertEquals("java.lang.String", cls.getName());
  }

  @Test
  void testStringClass() {
    Class<?> cls = "".getClass();
    assertEquals("java.lang.String", cls.getName());
    assertEquals("String", cls.getSimpleName());
    assertEquals("java.lang", cls.getPackageName());
    assertFalse(cls.isInterface());
    assertFalse(cls.isEnum());
    assertFalse(cls.isArray());
    assertFalse(cls.isPrimitive());
  }

  @Test
  void testInterface() {
    Class<Runnable> cls = Runnable.class;
    assertEquals("java.lang.Runnable", cls.getName());
    assertEquals("Runnable", cls.getSimpleName());
    assertEquals("java.lang", cls.getPackageName());
    assertTrue(cls.isInterface());
    assertFalse(cls.isEnum());
    assertFalse(cls.isArray());
    assertFalse(cls.isPrimitive());
  }

  @Test
  void testMonth() {
    Class<Month> cls = java.time.Month.class;
    assertEquals("java.time.Month", cls.getName());
    assertEquals("Month", cls.getSimpleName());
    assertEquals("java.time", cls.getPackageName());
    assertFalse(cls.isInterface());
    assertTrue(cls.isEnum());
    assertFalse(cls.isArray());
    assertFalse(cls.isPrimitive());
  }

  @Test
  void testStringArray() {
    Class<String[]> cls = String[].class;
    assertEquals("[Ljava.lang.String;", cls.getName());
    assertEquals("String[]", cls.getSimpleName());
    assertEquals("java.lang", cls.getPackageName());
    assertFalse(cls.isInterface());
    assertFalse(cls.isEnum());
    assertTrue(cls.isArray());
    assertFalse(cls.isPrimitive());
  }

  @Test
  void testPrimitive() {
    Class<?> cls = int.class;
    assertEquals("int", cls.getName());
    assertEquals("int", cls.getSimpleName());
    assertEquals("java.lang", cls.getPackageName());
    assertFalse(cls.isInterface());
    assertFalse(cls.isEnum());
    assertFalse(cls.isArray());
    assertTrue(cls.isPrimitive());
  }
}
