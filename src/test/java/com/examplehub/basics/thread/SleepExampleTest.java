package com.examplehub.basics.thread;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class SleepExampleTest {
  @Test
  void testClockMonitor() throws InterruptedException {
    new Thread(() -> {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      while (true) {
        Date date = new Date();
        System.out.println(sdf.format(date));
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();
    Thread.sleep(1000); // set bigger argument to see effect
  }
}