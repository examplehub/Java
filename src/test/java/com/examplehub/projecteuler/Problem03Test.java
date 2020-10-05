package com.examplehub.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem03Test {

    @Test
    void testSolution1() {

        assertEquals(-1, Problem03.solution1(0));
        assertEquals(-1, Problem03.solution1(1));
        assertEquals(2, Problem03.solution1(2));
        assertEquals(3, Problem03.solution1(3));
        assertEquals(2, Problem03.solution1(4));
        assertEquals(19, Problem03.solution1(19));
        assertEquals(29, Problem03.solution1(13195));
        /* assertEquals(6857, Problem03.solution1(600851475143L)); */
    }
}