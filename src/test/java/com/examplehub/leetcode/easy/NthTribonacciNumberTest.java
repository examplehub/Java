package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthTribonacciNumberTest {
    @Test
    void testSolution1() {
        assertEquals(NthTribonacciNumber.solution1(4), 4);
        assertEquals(NthTribonacciNumber.solution1(25), 1389537);
    }
}