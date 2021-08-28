package com.examplehub.basics.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpcastExampleTest {
    @Test
    void test() {
        UpClass upClass = new UpcastExample("Jack", 26, 180);
        assertEquals("Jack", upClass.getName());
        assertEquals(26, upClass.getAge());
        assertEquals(180, ((UpcastExample)upClass).getHeight());
    }
}