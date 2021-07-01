package com.examplehub.leetcode.middle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchA2dMatrixTest {
    @Test
    void testSolution1() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        assertTrue(SearchA2dMatrix.solution1(matrix, 3));
        assertFalse(SearchA2dMatrix.solution1(matrix, 13));
    }

    @Test
    void testSolution2() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        assertTrue(SearchA2dMatrix.solution2(matrix, 3));
        assertFalse(SearchA2dMatrix.solution2(matrix, 13));
    }
}