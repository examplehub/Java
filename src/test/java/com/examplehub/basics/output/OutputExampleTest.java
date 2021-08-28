package com.examplehub.basics.output;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputExampleTest {
    @Test
    void testPrint() {
        /*
         * ABCD!
         */
        System.out.print("A");
        System.out.print("B");
        System.out.println("CD!");
    }

    @Test
    void testFormatPrint() {
        final double PI = 3.1415926;
        System.out.printf("%.2f\n", PI); // 3.14
        System.out.printf("%.4f\n", PI); // 3.1416

        int num = 1024;
        System.out.printf("%d\n", num); // 1024
        System.out.printf("%x\n", num); // 400

    }
}