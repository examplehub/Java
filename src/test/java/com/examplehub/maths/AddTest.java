package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void testAdd() {
        assertEquals(7, Add.add(3, 4));
        assertEquals(0, Add.add(3, -3));
        assertEquals(100, Add.add(90, 10));

        assertEquals(4.0, Add.add(2.0, 2.0));
        assertEquals(3.4, Add.add(2.0, 1.4));
        assertEquals(-2.0, Add.add(-4.0, 2.0));
    }
}