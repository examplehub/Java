package com.examplehub.basics.thread;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;

class ReentrantLockExampleTest {
  static class Counter {
    private final Lock lock = new ReentrantLock();
    private int count;

    public void add(int step) {
      lock.lock();
      try {
        count += step;
      } finally {
        lock.unlock();
      }
    }

    public int getCount() {
      return count;
    }
  }

  @Test
  void test() throws InterruptedException {
    Counter counter = new Counter();
    for (int i = 0; i < 10; i++) {
      new Thread(
              () -> {
                counter.add(1);
              })
          .start();
    }
    Thread.sleep(100);
    assertEquals(10, counter.getCount());
  }
}
