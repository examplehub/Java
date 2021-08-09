package com.examplehub.basics.thread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YieldThreadTest {
    @Test
    void test() {
        YieldThread yieldThread = new YieldThread();
        new Thread(yieldThread).start();
        new Thread(yieldThread).start();
    }
}