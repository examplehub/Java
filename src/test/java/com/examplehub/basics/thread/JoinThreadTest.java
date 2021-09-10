package com.examplehub.basics.thread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.atomic.AtomicInteger;

class JoinThreadTest {
  @Test
  void test() throws InterruptedException {
    Thread thread = new Thread(new JoinThread());
    thread.start();
    for (int i = 0; i < 10; i++) {
      if (i == 1) {
        thread.join();
      }
      System.out.println(Thread.currentThread().getName() + i);
    }
  }

  @Test
  void testJoinWithTime() throws InterruptedException {
    AtomicInteger number = new AtomicInteger();
    Thread thread = new Thread(()->{
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
