package com.examplehub.basics;

public class RunnableExample implements Runnable {
  public static void main(String[] args) {
    new Thread(new RunnableExample()).start();
    while (true) {
      printThreadInfo();
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public void run() {
    while (true) {
      printThreadInfo();
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void printThreadInfo() {
    System.out.println(Thread.currentThread().getName());
  }
}
