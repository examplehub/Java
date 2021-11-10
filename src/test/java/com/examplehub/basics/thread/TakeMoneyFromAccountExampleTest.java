package com.examplehub.basics.thread;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TakeMoneyFromAccountExampleTest {
  @Test
  void test() throws InterruptedException {
    class Account implements Runnable {
      private int balance;

      public Account() {}

      public Account(int balance) {
        this.balance = balance;
      }

      public int getBalance() {
        return balance;
      }

      @Override
      public void run() {
        synchronized (this) {
          if (balance >= 100) {
            try {
              Thread.sleep(10);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            balance -= 100;
          }
        }
      }
    }

    Account account = new Account(1000);
    Thread t1 = new Thread(account);
    Thread t2 = new Thread(account);
    Thread t3 = new Thread(account);
    t1.start();
    t2.start();
    t3.start();
    t1.join();
    t2.join();
    t3.join();

    assertEquals(700, account.getBalance());
  }
}
