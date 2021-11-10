package com.examplehub.basics.reflection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;

class InvokeMethodExampleTest {
  @Test
  void testInvoke()
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    String str = "hello world";
    Class<?> cls = str.getClass();
    Method method = cls.getMethod("substring", int.class);
    String newStr = (String) method.invoke(str, 6);
    assertEquals("world", newStr);
    //        newStr = (String) method.invoke(str, 0, 6);
    //        assertEquals("hello", newStr); //TODO
  }

  @Test
  void testInvokeStaticMethod()
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    assertEquals(123, Integer.class.getMethod("parseInt", String.class).invoke(null, "123"));
  }

  @Test
  void testInvokePrivateMethod()
      throws InstantiationException, IllegalAccessException, NoSuchMethodException,
          InvocationTargetException {
    class MyObj {
      private String name;

      private void setName(String name) {
        this.name = name;
      }

      private String getName() {
        return name;
      }
    }
    Class cls = MyObj.class;
    Object object = new MyObj();
    Method method = cls.getDeclaredMethod("setName", String.class);
    method.setAccessible(true);
    method.invoke(object, "Jack");
    method = cls.getDeclaredMethod("getName");
    method.setAccessible(true);
    assertEquals("Jack", method.invoke(object));
  }

  @Test
  void testPolymorphism()
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    class Parent {
      public String hi() {
        return "Parent.hi";
      }
    }
    class Child extends Parent {
      @Override
      public String hi() {
        return "Child.hi";
      }
    }

    Method method = Parent.class.getMethod("hi");
    assertEquals("Child.hi", method.invoke(new Child()));
  }

  @Test
  void testInvokeConstructor()
      throws NoSuchMethodException, InvocationTargetException, InstantiationException,
          IllegalAccessException {
    Constructor constructor = Integer.class.getConstructor(int.class);
    Integer integer = (Integer) constructor.newInstance(123);
    assertEquals(123, integer.intValue());

    Constructor constructor2 = Integer.class.getConstructor(String.class);
    Integer integer2 = (Integer) constructor2.newInstance("123");
    assertEquals(123, integer2.intValue());
  }
}
