package com.examplehub.basics.thread;

public class DaemonThread implements Runnable {

  @Override
  public void run() {
    while (Thread.currentThread().getState() != Thread.State.TERMINATED) {
      System.out.println("daemon thread is terminated");
    }
  }
}
