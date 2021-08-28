package com.examplehub.basics.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractClassExampleTest {
    @Test
    void test() {
        People people = new Student();
        assertEquals("Student.say", people.say());
        people = new Teacher();
        assertEquals("Teacher.eat", people.say());
    }
}