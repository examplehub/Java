package com.examplehub.basics.thread;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static org.junit.jupiter.api.Assertions.*;

class ReadWriteLockExampleTest {
  static class Counter {
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final Lock rLock = readWriteLock.readLock();
    private final Lock wLock = readWriteLock.writeLock();

    private final int[] counts = new int[10];

    public void inc(int index) {
      wLock.lock();
      try {
        counts[index] += 1;
      }finally {
        wLock.unlock();
      }
    }

    public int[] get() {
      rLock.lock();
      try {
        return Arrays.copyOf(counts, counts.length);
      }finally {
        rLock.unlock();
      }
    }
  }
  @Test
  void test() throws InterruptedException {
    Counter counter = new Counter();
    for (int i = 0; i < 10; i++) {
      int finalI = i;
      new Thread(()->{
        counter.inc(finalI);
        System.out.println(Arrays.toString(counter.get()));
      }).start();
    }
    Thread.sleep(100);
    assertEquals("[1, 1, 1, 1, 1, 1, 1, 1, 1, 1]", Arrays.toString(counter.get()));
  }
}