package com.examplehub.basics.thread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleThreadTest {
    @Test
    void test(){
        ExampleThread exampleThread = new ExampleThread();
        exampleThread.setName("custom-thread");
        exampleThread.start();
        for (int i = 0; i < 10; ++i) {
            System.out.println(Thread.currentThread().getName() + "->" + i);
        }
    }
}