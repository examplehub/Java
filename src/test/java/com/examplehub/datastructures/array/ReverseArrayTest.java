package com.examplehub.datastructures.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {
    @Test
    void testReverse() {
        int[] array = IntStream.range(1, 6).toArray();
        ReverseArray.reverse(array);
        for (int i = 0; i < array.length; i++) {
            assertEquals(array.length - i, array[i]);
        }
    }
}