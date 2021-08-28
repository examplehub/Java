package com.examplehub.basics.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContinueExampleTest {
    @Test
    void test1() {
        int sum = 0;
        for (int i = 1; i <= 10; ++i) {
            if (i % 2 == 1) {
                continue;
            }
            sum += i;
        }
        assertEquals(2 + 4 + 6 + 8 + 10, sum);
    }
}