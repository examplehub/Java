package com.examplehub.basics.thread;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SynchronizedThreadTest {
  @Test
  void test() {
    SynchronizedThread synchronizedThread = new SynchronizedThread();
    Thread first = new Thread(synchronizedThread);
    Thread second = new Thread(synchronizedThread);

    first.start();
    second.start();
  }
}
