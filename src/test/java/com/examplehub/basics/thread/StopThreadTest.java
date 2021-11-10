package com.examplehub.basics.thread;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StopThreadTest {
  @Test
  void test() throws InterruptedException {
    class ExampleThread extends Thread {
      private boolean stopped = false;

      @Override
      public void run() {
        while (!stopped) {}
        assertThrows(
            ArithmeticException.class,
            () -> {
              int num = 10 / 0;
            });
      }

      public void stop(boolean stopped) {
        this.stopped = stopped;
      }
    }
    ExampleThread thread = new ExampleThread();
    thread.start();
    thread.stop(true);
  }
}
