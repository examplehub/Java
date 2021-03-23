package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthTribonacciNumberTest {
    @Test
    void testSolution1() {
        assertEquals(NthTribonacciNumber.solution1(0), 0);
        assertEquals(NthTribonacciNumber.solution1(1), 1);
        assertEquals(NthTribonacciNumber.solution1(2), 1);
        assertEquals(NthTribonacciNumber.solution1(4), 4);
        assertEquals(NthTribonacciNumber.solution1(25), 1389537);
    }

    @Test
    void testSolution2() {
        assertEquals(NthTribonacciNumber.solution2(0), 0);
        assertEquals(NthTribonacciNumber.solution2(1), 1);
        assertEquals(NthTribonacciNumber.solution2(2), 1);
        assertEquals(NthTribonacciNumber.solution2(4), 4);
        assertEquals(NthTribonacciNumber.solution2(25), 1389537);
        assertEquals(NthTribonacciNumber.solution2(35), 615693474);
    }
}