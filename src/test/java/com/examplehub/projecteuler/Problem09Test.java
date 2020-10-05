package com.examplehub.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem09Test {

    @Test
    void testSolution1() {
        assertEquals(60, Problem09.solution1(12));
        assertEquals(31875000, Problem09.solution1(1000));
    }
}