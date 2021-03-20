package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SelfDividingNumbersTest {
    @Test
    void testSolution1() {
        assertEquals(new ArrayList<>() {
            {
                for (int i = 1; i <= 9; ++i) {
                    add(i);
                }
                add(11);
                add(12);
                add(15);
                add(22);
            }
        }, SelfDividingNumbers.solution1(1, 22));
    }
}