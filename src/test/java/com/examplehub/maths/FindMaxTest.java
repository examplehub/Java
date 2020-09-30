package com.examplehub.maths;

import com.examplehub.utils.RandomUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxTest {
    private int[] numbers;

    @BeforeEach
    public void setup() {
        numbers = RandomUtils.randomInts(-50, 50, 100);
    }

    @Test
    void testFindMax() {
        int max = FindMax.findMax(numbers);
        for (int number : numbers) {
            assertTrue(max >= number);
        }
    }

    @Test
    void testFindMaxSecond() {
        int max = FindMax.findMaxSecond(numbers);
        for (int number : numbers) {
            assertTrue(max >= number);
        }
    }
}