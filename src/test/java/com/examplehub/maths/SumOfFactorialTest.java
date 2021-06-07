package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfFactorialTest {
    @Test
    void testSum() {
        assertEquals(1, SumOfFactorial.sum(1, 1));
        assertEquals(3, SumOfFactorial.sum(1, 2));
        assertEquals(9, SumOfFactorial.sum(1, 3));
        assertEquals(33, SumOfFactorial.sum(1, 4));
        assertEquals(153, SumOfFactorial.sum(1, 5));

        assertEquals(1, SumOfFactorial.sum(1));
        assertEquals(3, SumOfFactorial.sum(2));
        assertEquals(9, SumOfFactorial.sum(3));
        assertEquals(33, SumOfFactorial.sum(4));
        assertEquals(153, SumOfFactorial.sum(5));
    }
}
