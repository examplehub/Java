package com.examplehub.basics.reflection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateObjFromClassTest {
    @Test
    void testCreateObj() throws InstantiationException, IllegalAccessException {
        Class cls = String.class;
        String str = (String) cls.newInstance();
        assertTrue(str.isEmpty());
    }
}