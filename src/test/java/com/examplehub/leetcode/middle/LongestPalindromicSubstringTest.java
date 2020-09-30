package com.examplehub.leetcode.middle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
    @Test
    void testSolution1() {
        assertEquals("bab", LongestPalindromicSubstring.solution1("babad"));
        assertEquals("bb", LongestPalindromicSubstring.solution1("cbbd"));
    }
}