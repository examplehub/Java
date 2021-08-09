package com.examplehub.basics.thread;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YieldThreadTest {
  @Test
  void test() {
    YieldThread yieldThread = new YieldThread();
    new Thread(yieldThread).start();
    new Thread(yieldThread).start();
  }
}
