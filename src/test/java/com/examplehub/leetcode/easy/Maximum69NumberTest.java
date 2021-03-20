package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum69NumberTest {
    @Test
    void testSolution1() {
        assertEquals(Maximum69Number.solution1(9669), 9969);
        assertEquals(Maximum69Number.solution1(9996), 9999);
        assertEquals(Maximum69Number.solution1(9999), 9999);
    }
}