package com.examplehub.basics.reflection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetClassExampleTest {
    @Test
    void testGetClass() throws ClassNotFoundException {
        Class cls = String.class;
        Class cls2 = "hello".getClass();
        Class cls3 = Class.forName("java.lang.String");
        assertTrue(cls == cls2 && cls == cls3);
    }

    @Test
    void testStringClass() {
        Class cls = "".getClass();
        assertEquals("java.lang.String", cls.getName());
        assertEquals("String", cls.getSimpleName());
        assertEquals("java.lang", cls.getPackageName());
        assertFalse(cls.isInterface());
        assertFalse(cls.isEnum());
        assertFalse(cls.isArray());
        assertFalse(cls.isPrimitive());
    }

    @Test
    void testInterface() {
        Class cls = Runnable.class;
        assertEquals("java.lang.Runnable", cls.getName());
        assertEquals("Runnable", cls.getSimpleName());
        assertEquals("java.lang", cls.getPackageName());
        assertTrue(cls.isInterface());
        assertFalse(cls.isEnum());
        assertFalse(cls.isArray());
        assertFalse(cls.isPrimitive());
    }

    @Test
    void testMonth() {
        Class cls = java.time.Month.class;
        assertEquals("java.time.Month", cls.getName());
        assertEquals("Month", cls.getSimpleName());
        assertEquals("java.time", cls.getPackageName());
        assertFalse(cls.isInterface());
        assertTrue(cls.isEnum());
        assertFalse(cls.isArray());
        assertFalse(cls.isPrimitive());
    }

    @Test
    void testStringArray() {
        Class cls = String[].class;
        assertEquals("[Ljava.lang.String;", cls.getName());
        assertEquals("String[]", cls.getSimpleName());
        assertEquals("java.lang", cls.getPackageName());
        assertFalse(cls.isInterface());
        assertFalse(cls.isEnum());
        assertTrue(cls.isArray());
        assertFalse(cls.isPrimitive());
    }

    @Test
    void testPrimitive() {
        Class cls = int.class;
        assertEquals("int", cls.getName());
        assertEquals("int", cls.getSimpleName());
        assertEquals("java.lang", cls.getPackageName());
        assertFalse(cls.isInterface());
        assertFalse(cls.isEnum());
        assertFalse(cls.isArray());
        assertTrue(cls.isPrimitive());
    }
}