package com.examplehub.basics.thread;

import org.junit.jupiter.api.Test;

class StopThreadTest {
  @Test
  void test() {
    StopThread stopThread = new StopThread();
    new Thread(stopThread).start();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    stopThread.stop();
    System.out.println("main thread stopped");
  }
}
