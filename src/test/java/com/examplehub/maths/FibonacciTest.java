package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void test() {

        try {
            FibonacciRecursion.fibonacci(-1);
            fail(); /* this will not happen */
        } catch (IllegalArgumentException e) {
            assertTrue(true); /* this wil happen */
        }

        assertEquals(0, Fibonacci.fibonacci(0));
        assertEquals(1, Fibonacci.fibonacci(1));
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));
        assertEquals(8, Fibonacci.fibonacci(6));
        assertEquals(13, Fibonacci.fibonacci(7));
        assertEquals(144, Fibonacci.fibonacci(12));
    }
}