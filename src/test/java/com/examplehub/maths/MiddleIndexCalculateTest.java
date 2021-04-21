package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleIndexCalculateTest {
    @Test
    void testMiddle() {
        assertEquals(0, MiddleIndexCalculate.middle(0, 1));
        assertEquals(5, MiddleIndexCalculate.middle(0, 10));
        assertEquals(Integer.MAX_VALUE - 1, MiddleIndexCalculate.middle(Integer.MAX_VALUE - 1, Integer.MAX_VALUE));
        assertEquals(Integer.MAX_VALUE, MiddleIndexCalculate.middle(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }
}