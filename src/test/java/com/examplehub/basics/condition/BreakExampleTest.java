package com.examplehub.basics.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreakExampleTest {
    @Test
    void test() {
        int i = 0;
        for (i = 0; i < 10; ++i) {
            if (i == 5) {
                break;
            }
        }
        assertEquals(5, i);

        i = 100;
        for (; i >= 0; i--) {
            if (i == 90) {
                break;
            }
        }
        assertEquals(90, i);
    }

    @Test
    void testSwitch() {
        int opt = 2;
        int sum = 0;
        switch (opt) {
            case 1:
                sum += 1;
                break;
            case 2:
                sum += 2;
            case 3:
                sum += 3;
                break;
            default:
                sum += 10;
                break;
        }
        assertEquals(2 + 3, sum);
    }

    @Test
    void testNestLoop() {
        int sum = 0;
        for (int i = 1; i <= 3; ++i) {
            for (int j = 1; j <= 5; j++) {
                sum = sum + j;
                if (j == 3) {
                    break;
                }
            }
        }
        assertEquals((1 + 2 + 3) * 3, sum);
    }
}