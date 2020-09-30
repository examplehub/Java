package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModeTest {
    @Test
    void testMode() {
        assertEquals(2, Mode.mode(new int[]{1, 2, 2, 3, 4, 7, 9, 2}));
        assertEquals(3, Mode.mode(new int[]{1, 2, 3, 4, 5, 6, 3, 3, 2, 3, 6}));
    }
}