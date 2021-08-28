package com.examplehub.basics.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstanceofExampleTest {
    @Test
    void test() {
        String str = "hello world";
        assertTrue(str instanceof String);
        assertTrue(str instanceof Object);
    }
}