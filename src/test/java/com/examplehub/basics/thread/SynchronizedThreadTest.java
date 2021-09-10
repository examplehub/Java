package com.examplehub.basics.thread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Counter {
  public static final Object lock = new Object();
  public static int count = 0;
}

class SynchronizedThreadTest {

  @Test
  void test() {
    SynchronizedThread synchronizedThread = new SynchronizedThread();
    Thread first = new Thread(synchronizedThread);
    Thread second = new Thread(synchronizedThread);

    first.start();
    second.start();
  }

  @Test
  void testCounter() throws InterruptedException {
    class AddThread extends Thread {
      @Override
      public void run() {
        for (int i = 0; i < 100; ++i) {
          synchronized (Counter.lock) {
            Counter.count++;
          }
        }
      }
    }
    class DesThread extends Thread {
      @Override
      public void run() {
        for (int i = 0; i < 100; i++) {
          synchronized (Counter.lock) {
            Counter.count--;
          }
        }
      }
    }
    AddThread addThread = new AddThread();
    DesThread desThread = new DesThread();
    addThread.start();
    desThread.start();
    addThread.join();
    desThread.join();
    assertEquals(0, Counter.count);
  }

  @Test
  void testSynchronizedThis() throws InterruptedException {
    class Counter {
      private int count = 0;
      public void dec() {
        synchronized (this) {
          count = count - 1;
        }
      }
      public void add() {
        synchronized (this) {
          count = count + 1;
        }
      }

      public int getCount() {
        return count;
      }
    }
    Counter counter = new Counter();
    var firstThread = new Thread(() -> {
      for (int i = 0; i < 100; i++) {
        counter.add();
      }
    });
    var secondThread = new Thread(() -> {
      for (int i = 0; i < 100; i++) {
        counter.dec();
      }
    });
    firstThread.start();
    secondThread.start();
    firstThread.join();
    secondThread.join();
    assertEquals(0, counter.getCount());
  }

  @Test
  void testSynchronizedFunction() throws InterruptedException {
    class Counter {
      private int count = 0;
      public synchronized void dec() {
          count = count - 1;
      }
      public synchronized void add() {
          count = count + 1;
      }

      public int getCount() {
        return count;
      }
    }
    Counter counter = new Counter();
    var firstThread = new Thread(() -> {
      for (int i = 0; i < 100; i++) {
        counter.add();
      }
    });
    var secondThread = new Thread(() -> {
      for (int i = 0; i < 100; i++) {
        counter.dec();
      }
    });
    firstThread.start();
    secondThread.start();
    firstThread.join();
    secondThread.join();
    assertEquals(0, counter.getCount());
  }
}
