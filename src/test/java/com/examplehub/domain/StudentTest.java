package com.examplehub.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testComparable() {
        Student stuA = new Student(1, 99, 99, 99);
        Student stuB = new Student(1, 99, 99, 99);
        assertNotEquals(stuA, stuB);
        assertEquals(stuA.compareTo(stuB), 0);
        stuA = new Student(1, 100, 99, 99);
        stuB = new Student(1, 99, 99, 99);
        assertTrue(stuA.compareTo(stuB) > 0);
        stuA = new Student(1, 100, 99, 99);
        stuB = new Student(1, 99, 100, 99);
        assertTrue(stuA.compareTo(stuB) < 0);
    }
}