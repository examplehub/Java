package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {
    @Test
    void test() {
        try {
            int result = Divide.divide(3, 0);
            fail(); /* this should will not happen */
        } catch (ArithmeticException e) {
            assertTrue(true); /* this will happen */
        }

        try {
            double result = Divide.divide(3, 0.0);
            fail(); /* this should will not happen */
        } catch (ArithmeticException e) {
            assertTrue(true); /* this will happen */
        }

        assertEquals(0, Divide.divide(0, 100));
        assertEquals(2, Divide.divide(4, 2));
        assertEquals(-2, Divide.divide(-2, 1));

        assertEquals(0.0, Divide.divide(0.0, 100.0));
        assertEquals(2.0, Divide.divide(4.0, 2.0));
        assertEquals(3.14, Divide.divide(314.0, 100.0));
    }
}