package com.examplehub.basics.reflection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class User {
  private  String username;
  private  int age;

  public User() {
  }

  public User(String username, int age) {
    this.username = username;
    this.age = age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String toString() {
    return "User{" +
            "username='" + username + '\'' +
            ", age=" + age +
            '}';
  }
}
class CreateObjFromClassTest {
  @Test
  void testCreateObjUsingNewInstance() throws InstantiationException, IllegalAccessException {
    Class<String> cls = String.class;
    String str = cls.newInstance();
    assertTrue(str.isEmpty());
  }

  @Test
  void testCreateCustomObject() throws InstantiationException, IllegalAccessException, ClassNotFoundException {

    Class<?> userClass = User.class;
    User user = (User) userClass.newInstance();
    user.setUsername("admin");
    user.setAge(25);
    assertEquals("User{username='admin', age=25}", user.toString());
  }

  @Test
  void testCreateCustomObjectUsingConstructor() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Class<?> userClass = Class.forName("com.examplehub.basics.reflection.User");
    Constructor<?> constructor = userClass.getConstructor();
    assertEquals("public com.examplehub.basics.reflection.User()", constructor.toString());
    User user = (User) constructor.newInstance();
    user.setUsername("duyuanchao");
    user.setAge(25);
    assertEquals("User{username='duyuanchao', age=25}", user.toString());
  }

  @Test
  void testCreateCustomObjectUsingConstructorWithArgs() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Class<?> userClass = Class.forName("com.examplehub.basics.reflection.User");
    Constructor<?> constructor = userClass.getConstructor(String.class, int.class);
    assertEquals("public com.examplehub.basics.reflection.User(java.lang.String,int)", constructor.toString());
    User user = (User) constructor.newInstance("duyuanchao", 26);
    assertEquals("User{username='duyuanchao', age=26}", user.toString());
  }

  @Test
  void testGetAllConstructors() throws ClassNotFoundException {
    Class<?> userClass = Class.forName("com.examplehub.basics.reflection.User");
    Constructor<?>[] constructors = userClass.getConstructors();
    for (Constructor<?> constructor : constructors) {
      assertEquals(1, constructor.getModifiers());
      assertEquals("com.examplehub.basics.reflection.User", constructor.getName());
      Class<?>[] classes = constructor.getParameterTypes();
      int count = 0;
      for (Class<?> cls : classes) {
        if (count == 0) {
          assertEquals("java.lang.String", cls.getName());
        }
        if (count == 1) {
          assertEquals("int", cls.getName());
        }
        count++;
      }
    }
  }
}
