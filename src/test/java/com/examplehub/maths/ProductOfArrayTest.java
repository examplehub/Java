package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayTest {
    @Test
    void testProduct() {
        assertEquals(0, ProductOfArray.product(0, 1, 2, 3));
        assertEquals(1, ProductOfArray.product(1, 1));
        assertEquals(120, ProductOfArray.product(1, 2, 3, 5, 4));
    }
}