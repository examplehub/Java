package com.examplehub.basics.thread;

public class ExampleThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println(getName() + "->" + i);
        }
    }
}
