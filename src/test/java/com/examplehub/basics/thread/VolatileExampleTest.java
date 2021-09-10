package com.examplehub.basics.thread;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VolatileExampleTest {
  int number = 0;

  @Test
  void test() throws InterruptedException {
    class MyThread extends Thread {
      @Override
      public void run() {
        for (int i = 1; i <= 10; ++i) {
          number++;
        }
      }
    }
    MyThread firstThread = new MyThread();
    MyThread secondThread = new MyThread();
    MyThread thirdThread = new MyThread();
    firstThread.start();
    secondThread.start();
    thirdThread.start();
    firstThread.join();
    secondThread.join();
    thirdThread.join();
    assertEquals(30, number);
  }
}
