package com.examplehub.basics.chars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharExampleTest {
    @Test
    void testCharDeclaration() {
        char letter = 'A';
        assertEquals('A', letter);

        char ch = '中';
        assertEquals('中', ch);
    }

    @Test
    void testUnicode() {
        assertEquals(65, 'A');
        assertEquals(97, 'a');
        assertEquals(20013, '中');

        assertEquals('A', '\u0041');
        assertEquals('中', '\u4e2d');
    }
}