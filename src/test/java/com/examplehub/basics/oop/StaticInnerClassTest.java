package com.examplehub.basics.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticInnerClassTest {
    @Test
    void test() {
        StaticInnerClass.InnerClass innerClass = new StaticInnerClass.InnerClass();
        assertEquals("Hi, JACK", innerClass.sayHi());
    }
}