package com.examplehub.conversions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecimalToOctalTest {
    @Test
    void testDecimalToOctal() {
        assertEquals(Integer.toString(0, 8), DecimalToOctal.toOctal(0));
        assertEquals(Integer.toString(6, 8), DecimalToOctal.toOctal(6));
        assertEquals(Integer.toString(111, 8), DecimalToOctal.toOctal(111));
        assertEquals(Integer.toString(-1111, 8), DecimalToOctal.toOctal(-1111));
    }
}