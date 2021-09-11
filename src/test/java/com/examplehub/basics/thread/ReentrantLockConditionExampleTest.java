package com.examplehub.basics.thread;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockConditionExampleTest {
  static class TaskQueue {
    Queue<String> queue = new LinkedList<>();
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    public void addTask(String task) {
      lock.lock();
      try {
        queue.add(task);
        condition.signalAll();
      }finally {
        lock.unlock();
      }
    }

    public String getTask() throws InterruptedException {
      lock.lock();
      try {
        while (queue.isEmpty()) {
          condition.await();
        }
        return queue.remove();
      }finally {
       lock.unlock();
      }
    }
  }
  @Test
  void test() throws InterruptedException {
    var tasks = new TaskQueue();
    var threads = new ArrayList<Thread>();
    for (int i = 0; i < 5; i++) {
      Thread thread = new Thread(()->{
        while (true) {
          try {
            String task = tasks.getTask();
            System.out.println("execute: " + task);
          } catch (InterruptedException e) {
            System.out.println("thread " + Thread.currentThread().getName() + " interrupted" );
            return;
          }
        }
      });
      thread.start();
      threads.add(thread);
    }
    var addThread = new Thread(()->{
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
}