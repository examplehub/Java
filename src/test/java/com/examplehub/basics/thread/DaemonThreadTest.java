package com.examplehub.basics.thread;

class DaemonThreadTest {
  //  @Test
  void test() {
    Thread thread = new Thread(new DaemonThread());
    thread.setDaemon(true);
    thread.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("main thread");
    }
  }
}