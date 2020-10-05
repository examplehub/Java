package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HanoiTest {

    @Test
    void test() {
        Hanoi.move(5, "A", "B", "C");
    }
}