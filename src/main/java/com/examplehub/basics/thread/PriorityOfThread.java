package com.examplehub.basics.thread;

public class PriorityOfThread implements Runnable {
  @Override
  public void run() {
    System.out.println(
        Thread.currentThread().getName() + "-> priority = " + Thread.currentThread().getPriority());
  }
}
