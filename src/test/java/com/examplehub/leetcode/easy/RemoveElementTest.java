package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void test() {
        int[] ints = new int[]{3, 2, 2, 3};
        assertEquals(2, RemoveElement.solution1(ints, 3));
        assertTrue(ints[0] == 2 && ints[1] == 2);

        ints = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        assertEquals(5, RemoveElement.solution1(ints, 2));
        int[] newInts = {0, 1, 3, 0, 4};
        for (int i = 0; i < newInts.length; i++) {
            assertEquals(ints[i], newInts[i]);
        }
    }
}