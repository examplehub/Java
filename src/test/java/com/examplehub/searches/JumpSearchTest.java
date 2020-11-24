package com.examplehub.searches;

import com.examplehub.utils.SortUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class JumpSearchTest {
    private Search search;

    @BeforeEach
    void setup() {
        search = new JumpSearch();
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
    }
}