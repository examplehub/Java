package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciBigNumberTest {
    @Test
    void testFibonacciBigNumber() {
        assertEquals("1", FibonacciBigNumber.fibonacci(1));
        assertEquals("1", FibonacciBigNumber.fibonacci(2));
        assertEquals("144", FibonacciBigNumber.fibonacci(12));
    }
}