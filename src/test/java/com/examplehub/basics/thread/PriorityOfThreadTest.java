package com.examplehub.basics.thread;

import org.junit.jupiter.api.Test;

class PriorityOfThreadTest {
  @Test
  void test() {
    Thread first = new Thread(new PriorityOfThread());
    first.setPriority(3);

    Thread second = new Thread(new PriorityOfThread());
    second.setPriority(5);

    Thread third = new Thread(new PriorityOfThread());
    second.setPriority(Thread.MAX_PRIORITY);

    first.start();
    second.start();
    third.start();
    System.out.println(
        Thread.currentThread().getName() + "-> priority = " + Thread.currentThread().getPriority());
  }
}
