package com.examplehub.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JustAppearOneTimeTest {
    @Test
    void testSolution1() {
        assertTrue(JustAppearOneTime.solution1("abc", "ab"));
        assertFalse(JustAppearOneTime.solution1("abcbc", "bc"));
        assertFalse(JustAppearOneTime.solution1("abc", "ac"));
    }
}