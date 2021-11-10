package com.examplehub.basics.reflection;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.junit.jupiter.api.Test;

class Person {
  public String name;

  public Person(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String hi() {
    return "hi";
  }
}

class Student extends Person {
  public int score;
  private int grade;

  public Student(String name) {
    super(name);
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }
}

class GetFieldExampleTest {
  @Test
  void testGetField() throws NoSuchFieldException {
    Class<Student> stuCls = Student.class;
    assertEquals("score", stuCls.getField("score").getName());
    assertEquals("name", stuCls.getField("name").getName());
    assertEquals("grade", stuCls.getDeclaredField("grade").getName());
  }

  @Test
  void testGetFieldValue() throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException {
    Class<?> cls = Person.class;
    Constructor<?> constructor = cls.getConstructor(String.class);
    Person person = (Person) constructor.newInstance("Jack");
    Field field = cls.getDeclaredField("name");
    assertEquals("Jack", field.get(person));
  }

  @Test
  void testSetFiledValue() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException {
    Class<?> cls = Class.forName("com.examplehub.basics.reflection.Person");
    Constructor<?> constructor = cls.getConstructor(String.class);
    Object person = constructor.newInstance("Jack");
    Field field = cls.getDeclaredField("name");
    assertEquals("Jack", field.get(person).toString());
    field.set(person, "Tom");
    assertEquals("Tom", field.get(person).toString());
  }

  @Test
  void testGetFunction() throws NoSuchMethodException, ClassNotFoundException {
    Class<?> stuClass = Class.forName("com.examplehub.basics.reflection.Student");
    assertEquals("getScore", stuClass.getDeclaredMethod("getScore").getName());
    assertEquals("setScore", stuClass.getMethod("setScore", int.class).getName());
    assertEquals("getGrade", stuClass.getDeclaredMethod("getGrade").getName());
    assertEquals("setGrade", stuClass.getMethod("setGrade", int.class).getName());
    assertEquals("getName", stuClass.getMethod("getName").getName());
    assertEquals("setName", stuClass.getMethod("setName", String.class).getName());
  }

  @Test
  void testGetAllFields() throws ClassNotFoundException {
    Class<?> stuClass = Class.forName("com.examplehub.basics.reflection.Student");
    Field[] fields = stuClass.getFields();
    for (Field field : fields) {
      System.out.println(field.getModifiers());
      System.out.println(field.getType());
      System.out.println(field.getName());
      System.out.println("-------------");
    }
  }
}
