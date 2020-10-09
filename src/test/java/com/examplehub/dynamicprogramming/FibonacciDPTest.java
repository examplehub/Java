package com.examplehub.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciDPTest {
    @Test
    void testFibonacci() {
        assertEquals(0, FibonacciDP.fibonacci(0));
        assertEquals(1, FibonacciDP.fibonacci(1));
        assertEquals(1, FibonacciDP.fibonacci(2));
        assertEquals(34, FibonacciDP.fibonacci(9));
    }
}