package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumToNFormulaTest {
    @Test
    void test() {
        assertEquals(55, SumToNFormula.sum(10));
        assertEquals(5050, SumToNFormula.sum(100));
    }
}