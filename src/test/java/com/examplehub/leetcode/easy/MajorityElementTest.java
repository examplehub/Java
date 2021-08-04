package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    @Test
    void testSolution1() {
        assertEquals(3, MajorityElement.solution1(3, 2, 3));
        assertEquals(2, MajorityElement.solution1(2,2,1,1,1,2,2));
    }
}