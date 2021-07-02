package com.examplehub.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceWhiteSpaceTest {
    @Test
    void testSolution1() {
        assertEquals("We%20are%20happy.", ReplaceWhiteSpace.solution1("We are happy.", "%20"));
    }

    @Test
    void testSolution2() {
        //FIXME
//        assertEquals("We%20are%20happy.", ReplaceWhiteSpace.solution2("We are happy.", "%20"));
    }
}