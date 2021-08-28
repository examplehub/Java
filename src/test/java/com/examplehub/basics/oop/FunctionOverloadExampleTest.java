package com.examplehub.basics.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionOverloadExampleTest {
    @Test
    void test() {
        FunctionOverloadExample functionOverloadExample = new FunctionOverloadExample();
        assertEquals(3, functionOverloadExample.sum(1, 2));
        assertEquals(6, functionOverloadExample.sum(1, 2, 3));
        assertEquals(10, functionOverloadExample.sum(1, 2, 3, 4));
        assertEquals(4.0, functionOverloadExample.sum(1.5, 2.5));
    }
}