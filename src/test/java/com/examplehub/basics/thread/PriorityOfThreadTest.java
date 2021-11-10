package com.examplehub.basics.thread;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PriorityOfThreadTest {
  @Test
  void test() {
    Thread thread = new Thread(()->{
      assertEquals(Thread.MAX_PRIORITY, Thread.currentThread().getPriority());
    });
    thread.setPriority(Thread.MAX_PRIORITY);
    thread.start();
  }
}
