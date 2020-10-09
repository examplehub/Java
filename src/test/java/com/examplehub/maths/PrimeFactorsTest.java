package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsTest {

    @Test
    void testPrimeFactors() {
        assertTrue(Arrays.equals(new int[]{2}, PrimeFactors.primeFactors(2)));
        assertTrue(Arrays.equals(new int[]{2, 2, 3}, PrimeFactors.primeFactors(12)));
        assertTrue(Arrays.equals(new int[]{3, 3, 5, 7}, PrimeFactors.primeFactors(315)));
    }
}