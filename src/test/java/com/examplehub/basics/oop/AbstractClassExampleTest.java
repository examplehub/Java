package com.examplehub.basics.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AbstractClassExampleTest {
  @Test
  void test() {
    People people = new Student();
    assertEquals("Student.say", people.say());
    people = new Teacher();
    assertEquals("Teacher.eat", people.say());
  }
}
