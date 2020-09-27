package com.examplehub.utils;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortUtilsTest {

    @Test
    void testIsSorted() {
        int[] ints = IntStream.range(-50, 50).toArray();
        assertTrue(SortUtils.isSorted(ints));
    }

    @Test
    void testIsSortedGeneric() {
        Integer[] integers = IntStream.range(-50, 50).boxed().toArray(Integer[]::new);
        assertTrue(SortUtils.isSorted(integers));
    }
}