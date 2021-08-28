package com.examplehub.basics.chars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringBuilderExampleTest {
    @Test
    void testAppend() {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello")
                .append(",")
                .append("World")
                .append("!");
        assertEquals("Hello,World!", builder.toString());
    }
}