package com.examplehub.basics.thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.Test;

class WaitNotifyExampleTest {
  static class TaskQueue {
    Queue<String> queue = new LinkedList<>();

    public synchronized void addTask(String task) {
      queue.add(task);
      this.notifyAll();
    }

    public synchronized String getTask() throws InterruptedException {
      while (queue.isEmpty()) {
        this.wait();
      }
      return queue.remove();
    }
  }

  @Test
  void test() throws InterruptedException {
    var tasks = new TaskQueue();
    var threads = new ArrayList<Thread>();
    for (int i = 0; i < 5; i++) {
      Thread thread =
          new Thread(
              () -> {
                while (true) {
                  try {
                    String task = tasks.getTask();
                    System.out.println("execute: " + task);
                  } catch (InterruptedException e) {
                    System.out.println(
                        "thread " + Thread.currentThread().getName() + " interrupted");
                    return;
                  }
                }
              });
      thread.start();
      threads.add(thread);
    }
    var addThread =
        new Thread(
            () -> {
              for (int i = 0; i < 10; ++i) {
                String task = "task - " + Math.random();
                System.out.println("added: " + task);
                tasks.addTask(task);
                try {
                  Thread.sleep(100);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
              }
            });
    addThread.start();
    addThread.join();
    Thread.sleep(100);
    for (var thread : threads) {
      thread.interrupt();
    }
  }

  @Test
  void testPrint1To10TwoThread() throws InterruptedException {
    class MyRunnable implements Runnable {
      private int count = 1;
      @Override
      public void run() {
        while (true) {
          synchronized (this) {
            notify();
            if (count <= 10) {
              System.out.println(Thread.currentThread().getName() + "->" + count++);
            } else {
              break;
            }
            try {
              wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      }
    }
    MyRunnable myRunnable = new MyRunnable();
    Thread t1 = new Thread(myRunnable, "t1");
    Thread t2 = new Thread(myRunnable, "t2");
    t1.start();
    t2.start();
    t1.join();
    t2.join();
  }
}
