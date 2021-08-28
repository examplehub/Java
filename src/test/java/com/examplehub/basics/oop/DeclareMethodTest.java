package com.examplehub.basics.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeclareMethodTest {
    @Test
    void test() {
        DeclareMethod declareMethod = new DeclareMethod();
        declareMethod.setName("Jack");
        declareMethod.setAge(25);

        assertEquals("I'm Jack. I'm 25", declareMethod.intro());
    }
}