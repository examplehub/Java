package com.examplehub.basics.thread;

public class StopThread implements Runnable {

  private boolean flag = true;

  @Override
  public synchronized void run() {
    while (true) {
      for (int i = 1; ; ++i) {
        System.out.println(i);
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public void stop() {
    flag = false;
    System.out.println("sub thread stopped");
  }
}
