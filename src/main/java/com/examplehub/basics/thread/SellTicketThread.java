package com.examplehub.basics.thread;

public class SellTicketThread implements Runnable {

  private int totalTickets = 10;

  @Override
  public void run() {
    while (totalTickets > 0) {
      System.out.println(Thread.currentThread().getName() + " buy " + totalTickets + " nth ticket");
      totalTickets--;
    }
  }
}
