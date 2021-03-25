package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountNegativeNumbersInASortedMatrixTest {
    @Test
    void testSolution1() {
        int[][] grid = new int[][]{
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
        assertEquals(8, CountNegativeNumbersInASortedMatrix.solution1(grid));


        grid = new int[][]{
                {3,2},
                {1,0},
        };
        assertEquals(0, CountNegativeNumbersInASortedMatrix.solution1(grid));

        grid = new int[][]{
                {1,-1},
                {-1,-1},
        };
        assertEquals(3, CountNegativeNumbersInASortedMatrix.solution1(grid));        grid = new int[][]{
                {-1},
        };
        assertEquals(1, CountNegativeNumbersInASortedMatrix.solution1(grid));
    }
}