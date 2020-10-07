package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {
    @Test
    void testReverseNumber() {
        assertEquals(21, ReverseNumber.reverse(12));
        assertEquals(12345, ReverseNumber.reverse(54321));
        assertEquals(54321, ReverseNumber.reverse(12345));

        assertEquals(-21, ReverseNumber.reverse(-12));
        assertEquals(-54321, ReverseNumber.reverse(-12345));
    }
}