package com.examplehub.basics.thread;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleThreadTest {
  @Test
  void test() throws Exception{
    class ExampleThread extends Thread {
      private int sum = 0;

      public int getSum() {
        return sum;
      }

      @Override
      public void run() {
        for (int i = 1; i <= 100; ++i) {
          sum += i;
        }
      }
    }
    ExampleThread thread = new ExampleThread();
    thread.start();
    thread.join(); // main thread wait unit sub thread completed
    assertEquals(5050, thread.getSum());
  }

  @Test
  void testAnonymous() {
    new Thread(() -> System.out.println("testAnonymous")).start();
  }

  @Test
  void testGetThreadId() {
    new Thread(()->assertTrue(Thread.currentThread().getId() > 1)).start();
    assertEquals(1, Thread.currentThread().getId());
  }

  @Test
  void testGetThreadName() {
    class ExampleThread extends Thread {
      public ExampleThread(String name) {
        super(name);
      }

      @Override
      public void run() {
        assertEquals("sub-thread", getName());
      }
    }
    new ExampleThread("sub-thread").start();
    new Thread(() -> assertEquals("second-sub-thread", Thread.currentThread().getName()), "second-sub-thread").start();
    assertEquals("main", Thread.currentThread().getName());
  }

  @Test
  void testSumOddEven() throws InterruptedException {
    class OddSumThread extends Thread {
      private int sum = 0;

      public int getSum() {
        return sum;
      }

      @Override
      public void run() {
        for (int i = 1; i <= 99; i += 2) {
          sum += i;
        }
      }
    }
    class EvenSumThread extends Thread {
      private int sum = 0;

      public int getSum() {
        return sum;
      }

      @Override
      public void run() {
        for (int i = 2; i <= 100; i += 2) {
          sum += i;
        }
      }
    }

    OddSumThread oddSumThread = new OddSumThread();
    EvenSumThread evenSumThread = new EvenSumThread();
    oddSumThread.start();
    evenSumThread.start();
    oddSumThread.join();
    evenSumThread.join();
    assertEquals(5050, oddSumThread.getSum() + evenSumThread.getSum());
  }
}
