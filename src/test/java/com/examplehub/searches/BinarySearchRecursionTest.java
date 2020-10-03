package com.examplehub.searches;

import com.examplehub.utils.SortUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchRecursionTest {
    private Search search;

    @BeforeEach
    void setup() {
        search = new BinarySearchRecursion();
    }

    @Test
    void testLinearSearch() {
        int[] ints = IntStream.range(0, 10).toArray();
        for (int i = 0; i < ints.length; ++i) {
            assertEquals(i, search.search(ints, i));
        }
        assertEquals(-1, search.search(ints, 10));
        assertEquals(-1, search.search(ints, 100));
        assertEquals(-1, search.search(ints, -1));

        String[] strings = {"123", "ABC", "BCD", "abc", "bcd", "xyz"};
        assertTrue(SortUtils.isSorted(strings));
        for (int i = 0; i < strings.length; ++i) {
            assertEquals(i, search.search(strings, strings[i]));
        }
        assertEquals(-1, search.search(strings, "Windows"));
        assertEquals(-1, search.search(strings, "321"));
        assertEquals(-1, search.search(strings, ""));
    }
}