package com.examplehub.basics.thread;

public class YieldThread implements Runnable {

  @Override
  public void run() {
    //    System.out.println(Thread.currentThread().getName() + " is running");
    Thread.yield();
    System.out.println(Thread.currentThread().getName() + " is stopped");
  }
}
