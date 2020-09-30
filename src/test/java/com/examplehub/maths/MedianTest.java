package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianTest {

    @Test
    void testMedian() {
        assertEquals(0, Median.median(new double[]{0}));
        assertEquals(2.5, Median.median(new double[]{4,1,3,2}));
        assertEquals(6, Median.median(new double[]{1, 3, 3, 6, 7, 8, 9}));
        assertEquals(8, Median.median(new double[]{2, 70, 6, 50, 20, 8, 4}));
    }
}