package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeNumberTest {

    @Test
    void testCubeNumber() {
        int[] cubeNumbers = {-8, -1, 0, 1, 8, 27, 64, 8000, 216_000};
        for (int numbers : cubeNumbers) {
            assertTrue(CubeNumber.isCubeNumber(numbers));
        }
    }
}