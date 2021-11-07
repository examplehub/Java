package com.examplehub.basics.set;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class TreeSetExampleTest {
  @Test
  void testAdd() {
    Set<String> set = new TreeSet<>();
    assertTrue(set.add("B"));
    assertTrue(set.add("A"));
    assertTrue(set.add("C"));
    assertTrue(set.add("D"));
    assertEquals("[A, B, C, D]", set.toString());
  }

  @Test
  void testComparable() {
    class Student implements Comparable<Student> {
      private final String name;
      private final int age;

      public Student(String name, int age) {
        this.name = name;
        this.age = age;
      }

      public String getName() {
        return name;
      }

      public int getAge() {
        return age;
      }

      @Override
      public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
      }

      @Override
      public int compareTo(Student o) {
        return this.getAge() - o.getAge();
      }
    }

    Student s1 = new Student("Jack", 23);
    Student s2 = new Student("Tom", 22);
    Student s3 = new Student("Zara", 21);

    Set<Student> set = new TreeSet<>();
    set.add(s1);
    set.add(s2);
    set.add(s3);

    assertEquals("[Student{name='Zara', age=21}, Student{name='Tom', age=22}, Student{name='Jack', age=23}]"
            , set.toString());
  }

  @Test
  void testComparator() {
    class Student{
      private final String name;
      private final int age;

      public Student(String name, int age) {
        this.name = name;
        this.age = age;
      }

      public String getName() {
        return name;
      }

      public int getAge() {
        return age;
      }
      @Override
      public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
      }
    }

    Student s1 = new Student("Jack", 23);
    Student s2 = new Student("Tom", 22);
    Student s3 = new Student("Zara", 21);

    Set<Student> set = new TreeSet<>((o1, o2) -> o1.getAge() - o2.getAge());
    set.add(s1);
    set.add(s2);
    set.add(s3);

    assertEquals("[Student{name='Zara', age=21}, Student{name='Tom', age=22}, Student{name='Jack', age=23}]"
            , set.toString());
  }
}
