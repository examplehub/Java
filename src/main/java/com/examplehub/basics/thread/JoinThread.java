package com.examplehub.basics.thread;

public class JoinThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() +  i);
        }
    }
}
