package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void testSolution1() {
        assertEquals(4, BinarySearch.solution1(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        assertEquals(-1, BinarySearch.solution1(new int[]{-1,0,3,5,9,12}, 2));
    }

    @Test
    void testSolution2() {
        assertEquals(4, BinarySearch.solution2(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        assertEquals(-1, BinarySearch.solution2(new int[]{-1,0,3,5,9,12}, 2));
    }
}