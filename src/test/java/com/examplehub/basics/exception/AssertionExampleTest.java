package com.examplehub.basics.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionExampleTest {
    @Test
    void test() {
        assert 3 + 2 == 5;

        try {
            assert 3 + 2 != 5 : "error msg";
            fail();
        } catch (AssertionError error) {
            assertTrue(true);
            assertEquals("error msg", error.getMessage());
        }
    }
}