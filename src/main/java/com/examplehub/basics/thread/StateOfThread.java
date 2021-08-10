package com.examplehub.basics.thread;

public class StateOfThread implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
