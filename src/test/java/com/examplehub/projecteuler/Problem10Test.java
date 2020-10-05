package com.examplehub.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem10Test {

    @Test
    void testSolution1() {
        assertEquals(17, Problem10.solution1(10));
        assertEquals(142913828922L, Problem10.solution1(2000000));
    }
}