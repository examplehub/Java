package com.examplehub.basics.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterGetterTest {
    @Test
    void test() {
        SetterGetter setterGetter = new SetterGetter();
        setterGetter.setName("Jack");
        setterGetter.setAge(25);
        assertEquals("Jack", setterGetter.getName());
        assertEquals(25, setterGetter.getAge());

        try {
            setterGetter.setAge(-1);
            fail(); /* won't happen */
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}