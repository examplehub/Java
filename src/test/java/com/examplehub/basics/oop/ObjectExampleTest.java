package com.examplehub.basics.oop;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ObjectExampleTest {
  @Test
  void testObject() {
    Object o = new Object();
    System.out.println(o);
  }

  @Test
  void testEquals() {
    class Student {
      private int id;
      private String name;
      public Student(int id, String name) {
        this.id = id;
        this.name = name;
      }
    }
    class People {
      private final String name;
      private final int age;

      public People(String name, int age) {
        this.name = name;
        this.age = age;
      }

      @Override
      public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name);
      }

      @Override
      public int hashCode() {
        return 0;
      }
    }
    Student stu1 = new Student(10001, "duyuanchao");
    Student stu2 = new Student(10001, "duyuanchao");
    assertNotSame(stu1, stu2);
    assertNotEquals(stu1, stu2);

    People p1 = new People("duyuanchao", 25);
    People p2 = new People("duyuanchao", 25);
    People p3 = new People("jack", 25);
    assertNotSame(p1, p2);
    assertEquals(p1, p2);
    assertNotEquals(p1, p3);
  }

  @Test
  void testHashCode() {
    class People {
      private final String name;
      private final int age;

      public People(String name, int age) {
        this.name = name;
        this.age = age;
      }

      @Override
      public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name);
      }

      @Override
      public int hashCode() {
        return this.age % 13;
      }
    }
    People p1 = new People("duyuanchao", 25);
    People p2 = new People("duyuanchao", 25);
    assertEquals(p1.hashCode(), p2.hashCode());
  }

  @Test
  void testToString() {
    class People {
      private final String name;
      private final int age;

      public People(String name, int age) {
        this.name = name;
        this.age = age;
      }

      @Override
      public String toString() {
        return "name = " + name + ", age = " + age;
      }
    }

    People people = new People("duyuanchao", 25);
    assertEquals("name = duyuanchao, age = 25", people.toString());
  }
}