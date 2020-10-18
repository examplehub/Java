package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloorTest {
    @Test
    void testFloor() {
        assertEquals(Math.floor(123.45), Floor.floor(123.45));
        assertEquals(Math.floor(3.14), Floor.floor(3.14));
        assertEquals(Math.floor(1), Floor.floor(1));
        assertEquals(Math.floor(0), Floor.floor(0));
        assertEquals(Math.floor(-3.14), Floor.floor(-3.14));
        assertEquals(Math.floor(-3.14), Floor.floor(-3.14));
        assertEquals(Math.floor(-3), Floor.floor(-3));
        assertEquals(Math.floor(-123.45), Floor.floor(-123.45));
    }
}