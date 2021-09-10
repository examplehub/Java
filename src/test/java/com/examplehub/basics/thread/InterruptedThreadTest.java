package com.examplehub.basics.thread;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class InterruptedThreadTest {
  @Test
  @Disabled
  void test() throws InterruptedException {
    // TODO
    class MyThread extends Thread {
      @Override
      public void run() {
        while (!isInterrupted()) {
          System.out.println(Thread.currentThread().getName() + " running");
        }
        System.out.println(Thread.currentThread().getName() + " stopped");
      }
    }

    Thread thread = new MyThread();
    thread.start();
    Thread.sleep(1);
    thread.interrupt();
    thread.join();
    System.out.println(Thread.currentThread().getName() + " stopped");
  }
}
