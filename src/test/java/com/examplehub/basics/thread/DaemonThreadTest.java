package com.examplehub.basics.thread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DaemonThreadTest {
  @Test
  void test() {
    class ExampleThread extends Thread {
      @Override
      public void run() {
        assertTrue(Thread.currentThread().isDaemon());
        while (true) {
        }
      }
    }
    ExampleThread thread = new ExampleThread();
    thread.setDaemon(true);
    thread.start();

    int sum = 0;
    for (int i = 1; i <= 100; ++i) {
      sum = sum + i;
      assertTrue(thread.isAlive());
      assertTrue(thread.isDaemon());
    }
    assertEquals(5050, sum);
  }
}
