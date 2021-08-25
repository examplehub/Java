package com.examplehub.basics.ints;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntOperationTest {
    @Test
    void testAdd() {
        assertEquals(10, 5 + 5);
        assertEquals(0, 10 + (-10));
        assertEquals(-2147483641, 2147483640 + 15);
    }

    @Test
    void testDivide() {
        assertEquals(2, 10 / 5);
        assertEquals(5, 10 / 2);
        assertEquals(2, 7 / 3);
        assertEquals(164, 12345 / 75);
    }

    @Test
    void testRemainder() {
        assertEquals(1, 10 % 3);
        assertEquals(1, 31 % 3);
        assertEquals(1, 1 % 2);
        assertEquals(0, 10 % 5);
    }

    @Test
    void testIncrement() {
        int age = 10;
        assertEquals(11, ++age);
        assertEquals(11, age++);
        assertEquals(12, age);
    }

    @Test
    void testDecrement() {
        int age = 10;
        assertEquals(9, --age);
        assertEquals(9, age--);
        assertEquals(8, age);
    }

    @Test
    void testBitwiseRightShift() {
        int num = 7;      // 00000000 00000000 00000000 00000111 = 7
        int a = num << 1; // 00000000 00000000 00000000 00001110 = 14
        assertEquals(14, a);

        int b = num << 2; // 00000000 00000000 00000000 00011100 = 28
        assertEquals(28, b);

        int c = num << 28;// 01110000 00000000 00000000 00000000 = 1879048192
        assertEquals(1879048192, c);

        int d = num << 29;// 11100000 00000000 00000000 00000000 = -536870912
        assertEquals(-536870912, d);
    }

    @Test
    void testBitwiseLeftShift() {
        int num = -536870912;
        int a = num >> 1;  // 11110000 00000000 00000000 00000000 = -268435456
        assertEquals(-268435456, a);

        int b = num >> 2;  // 11111000 00000000 00000000 00000000 = -134217728
        assertEquals(-134217728, b);

        int c = num >> 28; // 11111111 11111111 11111111 11111110 = -2
        assertEquals(-2, c);

        int d = num >> 29; // 11111111 11111111 11111111 11111111 = -1
        assertEquals(-1, d);
    }
}