package com.examplehub.basics.thread;

public class DeadLockExample {
    public Object resourceA = new Object();
    public Object resourceB = new Object();

    public static void main(String[] args) {
        DeadLockExample deadLockExample = new DeadLockExample();
        Runnable runnableA = new Runnable() {
            @Override
            public void run() {
                synchronized (deadLockExample.resourceA) {
                    System.out.println(Thread.currentThread().getName() + "get resourceA");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " is trying to get resourceB");
                    synchronized (deadLockExample.resourceB) {
                        System.out.println(Thread.currentThread().getName() + "get resourceB");
                    }
                }
            }
        };

        Runnable runnableB = new Runnable() {
            @Override
            public void run() {
                synchronized (deadLockExample.resourceB) {
                    System.out.println(Thread.currentThread().getName() + "get resourceB");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " is trying to get resourceA");
                    synchronized (deadLockExample.resourceA) {
                        System.out.println(Thread.currentThread().getName() + "get resourceA");
                    }
                }
            }
        };

        new Thread(runnableA).start();
        new Thread(runnableB).start();
    }
}
