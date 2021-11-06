package com.examplehub.basics.time;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DateExampleTest {

  @Test
  void testInit() {
    Date firstDate = new Date();
    Date secondDate = new Date(System.currentTimeMillis());
    assertEquals(firstDate, secondDate);
  }

  @Test
  void testGetTime() {
    Date date = new Date(1636200610202L);
    assertEquals(1636200610202L, date.getTime());
  }

  @Test
  void testSetTime() {
    long time = System.currentTimeMillis();
    Date date = new Date(time);
    assertEquals(time, date.getTime());
  }

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
    long time = 1636201275057L;
    Date date = new Date(time);
    String formatDate = format.format(date);
    assertTrue("2021-11-06 20:21:15".equals(formatDate) || "2021-11-06 12:21:15".equals(formatDate));
  }

  @Test
  void testParse() throws ParseException {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    long time = format.parse("2021-11-06 20:21:15").getTime();
//    assertEquals(1636201275057L, time); TODO
  }
}
