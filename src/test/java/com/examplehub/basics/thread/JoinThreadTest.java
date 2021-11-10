package com.examplehub.basics.thread;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;

class JoinThreadTest {
  @Test
  void testJoin() throws InterruptedException {
    class ExampleThread extends Thread {
      private int sum = 0;

      @Override
      public void run() {
        for (int i = 1; i <= 100; ++i) {
          sum += i;
        }
      }

      public int getSum() {
        return sum;
      }
    }
    ExampleThread thread = new ExampleThread();
    assertEquals(0, thread.getSum());
    thread.start();
    thread.join();
    assertEquals(5050, thread.getSum());
  }

  @Test
  void testJoinWithTime() throws InterruptedException {
    AtomicInteger number = new AtomicInteger();
    Thread thread =
        new Thread(
            () -> {
              try {
                Thread.sleep(100);
                number.set(1);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            });
    thread.start();
    thread.join(50);
    assertEquals(0, number.get());
    assertEquals(Thread.State.TIMED_WAITING, thread.getState());
  }
}
