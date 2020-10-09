package com.examplehub.strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NativePatternSearchingTest {

    @Test
    void testNativePatternSearching() {
        assertTrue(Arrays.equals(new int[]{0, 4}, NativePatternSearching.search("ABCDABC", "ABC")));
        assertTrue(Arrays.equals(new int[]{0, 9, 12}, NativePatternSearching.search("AABAACAADAABAABA", "AABA")));
        assertTrue(Arrays.equals(new int[]{4, 10, 18}, NativePatternSearching.search("ABAAABCDBBABCDDEBCABC", "ABC")));
    }
}