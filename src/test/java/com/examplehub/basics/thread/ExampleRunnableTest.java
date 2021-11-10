package com.examplehub.basics.thread;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleRunnableTest {
  @Test
  void testRunnable() throws InterruptedException {
    class ExampleRunnable implements Runnable {
      private int sum = 0;

      @Override
      public void run() {
        for (int i = 1; i <= 100; ++i) {
          sum = sum + i;
        }
      }

      public int getSum() {
        return sum;
      }
    }
    ExampleRunnable exampleRunnable = new ExampleRunnable();
    Thread thread = new Thread(exampleRunnable);
    thread.start();
    thread.join();
    assertEquals(5050, exampleRunnable.getSum());
  }

  @Test
  void testAnonymous() {
    new Thread(() -> System.out.println("testAnonymous")).start();
  }
}
