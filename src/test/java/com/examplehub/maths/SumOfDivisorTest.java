package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDivisorTest {
    @Test
    void testSumOfDivisorInclude() {
        assertEquals(0, SumOfDivisor.sumOfDivisorInclude(0));
        assertEquals(1, SumOfDivisor.sumOfDivisorInclude(1));
        assertEquals(3, SumOfDivisor.sumOfDivisorInclude(2));
        assertEquals(18, SumOfDivisor.sumOfDivisorInclude(10));
    }

    @Test
    void testSumOfDivisorExclude() {
        assertEquals(0, SumOfDivisor.sumOfDivisorExclude(0));
        assertEquals(0, SumOfDivisor.sumOfDivisorExclude(1));
        assertEquals(1, SumOfDivisor.sumOfDivisorExclude(2));
        assertEquals(8, SumOfDivisor.sumOfDivisorExclude(10));
    }
}