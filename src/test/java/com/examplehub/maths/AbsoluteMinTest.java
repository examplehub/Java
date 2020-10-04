package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsoluteMinTest {

    @Test
    void testAbsoluteMin() {
        int[] ints = {1, -2, 5, -8, 7};
        assertEquals(1, AbsoluteMin.absoluteMin(ints));

        ints = new int[]{1, -2, 3, -4, 5};
        assertEquals(1, AbsoluteMin.absoluteMin(ints));
    }
}