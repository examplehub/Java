package com.examplehub.basics;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class MethodOverloadingTest {
    @Test
    void testSum() {
        assertEquals(5, MethodOverloading.sum(2, 3));
        assertEquals(6, MethodOverloading.sum(1, 2, 3));
        assertEquals(10, MethodOverloading.sum(1, 2, 3, 4));
        assertEquals(15, MethodOverloading.sum(1, 2, 3, 4, 5));
        assertEquals(5050, MethodOverloading.sum(IntStream.range(1, 101).toArray()));

        assertEquals(5.0, MethodOverloading.sum(2.0f, 3.0f));
    }
}