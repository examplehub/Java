package com.examplehub.basics.thread;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleRunnableTest {
  @Test
  void testRunnable() {
    Thread thread = new Thread(new ExampleRunnable());
    thread.setName("runnable-thread");
    thread.start();
    for (int i = 0; i < 10; ++i) {
      System.out.println(Thread.currentThread().getName() + "->" + i);
    }
  }
}
