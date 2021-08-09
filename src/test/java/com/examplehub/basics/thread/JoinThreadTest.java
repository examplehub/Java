package com.examplehub.basics.thread;

import org.junit.jupiter.api.Test;

class JoinThreadTest {
    @Test
    void test() throws InterruptedException {
        Thread thread = new Thread(new JoinThread());
        thread.start();
        for (int i = 0; i < 10; i++) {
            if (i == 1) {
                thread.join();
            }
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}