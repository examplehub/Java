package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignOfTheProductOfAnArrayTest {
    @Test
    void testSolution1() {
        assertEquals(1, SignOfTheProductOfAnArray.solution1(-1,-2,-3,-4,3,2,1));
        assertEquals(0, SignOfTheProductOfAnArray.solution1(1,5,0,2,-3));
        assertEquals(-1, SignOfTheProductOfAnArray.solution1(-1,1,-1,1,-1));
    }

    @Test
    void testSolution2() {
        assertEquals(-1, SignOfTheProductOfAnArray.solution2(41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41));
    }
}