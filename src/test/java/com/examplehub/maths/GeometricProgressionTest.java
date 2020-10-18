package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometricProgressionTest {
    @Test
    void testGetNth() {
        assertEquals(1, GeometricProgression.getNth(1, 1, 100));
        assertEquals(8, GeometricProgression.getNth(1, 2, 4));
        assertEquals(1024, GeometricProgression.getNth(1, 2, 11));
    }

    @Test
    void testSum() {
        assertEquals(15, GeometricProgression.sum(1, 2, 4));
        assertEquals(15, GeometricProgression.sum(1, 2, 4));
        assertEquals(100, GeometricProgression.sum(1, 1, 100));
    }
}