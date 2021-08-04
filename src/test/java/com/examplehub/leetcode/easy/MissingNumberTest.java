package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {
    @Test
    void testSolution1() {
        assertEquals(2, MissingNumber.solution1(3,0,1));
        assertEquals(2, MissingNumber.solution1(0,1));
        assertEquals(8, MissingNumber.solution1(9,6,4,2,3,5,7,0,1));
    }

    @Test
    void testSolution2() {
        assertEquals(2, MissingNumber.solution2(3,0,1));
        assertEquals(2, MissingNumber.solution2(0,1));
        assertEquals(8, MissingNumber.solution2(9,6,4,2,3,5,7,0,1));
    }

    @Test
    void testSolution3() {
        assertEquals(2, MissingNumber.solution3(3,0,1));
        assertEquals(2, MissingNumber.solution3(0,1));
        assertEquals(8, MissingNumber.solution3(9,6,4,2,3,5,7,0,1));
    }

    @Test
    void testSolution4() {
        assertEquals(2, MissingNumber.solution4(3,0,1));
        assertEquals(2, MissingNumber.solution4(0,1));
        assertEquals(8, MissingNumber.solution4(9,6,4,2,3,5,7,0,1));
    }
}