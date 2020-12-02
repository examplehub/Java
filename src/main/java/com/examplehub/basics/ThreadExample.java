package com.examplehub.basics;

public class ThreadExample extends Thread {

  public ThreadExample(String threadName) {
    this.setName(threadName);
  }

  @Override
  public void run() {
    while (true) {
      try {
        printThreadInfo();
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void printThreadInfo() {
    System.out.println(Thread.currentThread().getName() + " is running");
  }

  public static void main(String[] args) throws InterruptedException {
    new ThreadExample("myThread").start();
    while (true) {
      printThreadInfo();
      Thread.sleep(1000);
    }
  }
}
