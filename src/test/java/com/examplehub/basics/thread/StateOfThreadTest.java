package com.examplehub.basics.thread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateOfThreadTest {
    @Test
    void test() {
        Thread thread = new Thread(new StateOfThread());
        assertEquals(Thread.State.NEW, thread.getState());

        thread.start();
        assertEquals(Thread.State.RUNNABLE, thread.getState());

        while (thread.getState() != Thread.State.TERMINATED) {
            System.out.println(thread.getState());
        }
        System.out.println(thread.getState());
    }
}