package com.examplehub.sorts;

import com.examplehub.utils.RandomUtils;
import com.examplehub.utils.SortUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortRecursionTest {

    private Sort sort;

    @BeforeEach
    public void before() {
        sort = new InsertionSortRecursion();
    }

    @Test
    void sort() {
        int[] ints = RandomUtils.randomInts(-50, 50, 1);
        sort.sort(ints);
        assertTrue(SortUtils.isSorted(ints));
    }

    @Test
    void sortInteger() {
        Integer[] integers = Arrays.stream(RandomUtils.randomInts(-50, 50, 100))
                .boxed().toArray(Integer[]::new);
        sort.sort(integers);
        assertTrue(SortUtils.isSorted(integers));
    }
}