package com.examplehub.conversions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryTest {
    @Test
    void testDecimalToBinary() {
        assertEquals(Integer.toString(0, 2), DecimalToBinary.toBinary(0));
        assertEquals(Integer.toString(6, 2), DecimalToBinary.toBinary(6));
        assertEquals(Integer.toString(111, 2), DecimalToBinary.toBinary(111));
        assertEquals(Integer.toString(-1111, 2), DecimalToBinary.toBinary(-1111));
    }
}