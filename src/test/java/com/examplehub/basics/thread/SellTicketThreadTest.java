package com.examplehub.basics.thread;

import org.junit.jupiter.api.Test;

class SellTicketThreadTest {
  @Test
  void test() {
    SellTicketThread sellTicketThread = new SellTicketThread();

    Thread firstThread = new Thread(sellTicketThread);
    Thread secondThread = new Thread(sellTicketThread);
    Thread thirdThread = new Thread(sellTicketThread);

    firstThread.start();
    secondThread.start();
    thirdThread.start();
  }
}
