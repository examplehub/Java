package com.examplehub.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {
  @Test
  void testComparable() {
    Student stuA = new Student(1, 99, 99, 99);
    Student stuB = new Student(1, 99, 99, 99);
    assertEquals(stuB.compareTo(stuA), 0);
    stuA = new Student(1, 100, 99, 99);
    stuB = new Student(1, 99, 99, 99);
    assertTrue(stuA.compareTo(stuB) > 0);
    stuA = new Student(1, 100, 99, 99);
    stuB = new Student(1, 99, 100, 99);
    assertTrue(stuA.compareTo(stuB) > 0);
  }
}
