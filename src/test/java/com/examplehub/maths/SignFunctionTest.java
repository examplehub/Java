package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignFunctionTest {
    @Test
    void testSignFunction() {
        for (int i = 1; i <= 100; i++) {
            assertEquals(1, SignFunction.signFunction(i));
            assertEquals(-1, SignFunction.signFunction(-i));
        }
        assertEquals(0, SignFunction.signFunction(0));
    }
}