package com.examplehub.basics.thread;

import org.junit.jupiter.api.Test;

class YieldThreadTest {
  @Test
  void test() {
    YieldThread yieldThread = new YieldThread();
    new Thread(yieldThread).start();
    new Thread(yieldThread).start();
  }
}
