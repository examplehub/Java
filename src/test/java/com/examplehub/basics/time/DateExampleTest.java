package com.examplehub.basics.time;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

class DateExampleTest {
  @Test
  void test() {
    Date date = new Date();
    System.out.println(date.getYear() + 1900);
    System.out.println(date.getMonth() + 1);
    System.out.println(date.getDate());
    System.out.println(date);
    System.out.println(date.toGMTString());
    System.out.println(date.toLocaleString());
  }

  @Test
  void testSimpleDateForMate() {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.println(format.format(new Date()));
  }
}