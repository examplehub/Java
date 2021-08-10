package com.examplehub.basics.thread;

public class SynchronizedThread implements Runnable {
  private int count = 10;

  @Override
  public void run() {
    while (count > 0) {
      reduce();
    }
  }

  private synchronized void reduce() {
    System.out.println(Thread.currentThread().getName() + " count = " + count);
    count--;
  }
}
