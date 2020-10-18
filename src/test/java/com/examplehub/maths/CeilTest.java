package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeilTest {
    @Test
    void testCeil() {
        assertEquals(Math.ceil(3.14), Ceil.ceil(3.14));
        assertEquals(Math.ceil(3), Ceil.ceil(3));
        assertEquals(Math.ceil(0), Ceil.ceil(0));
        assertEquals(Math.ceil(-3), Ceil.ceil(-3));
        assertEquals(Math.ceil(-3.14), Ceil.ceil(-3.14));
    }
}