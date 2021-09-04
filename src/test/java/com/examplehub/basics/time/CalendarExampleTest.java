package com.examplehub.basics.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.junit.jupiter.api.Test;

class CalendarExampleTest {
  @Test
  void test() {
    Calendar calendar = Calendar.getInstance();
    System.out.println("year: " + calendar.get(Calendar.YEAR));
    System.out.println("month: " + calendar.get(Calendar.MONTH) + 1);
    System.out.println("day of month: " + calendar.get(Calendar.DAY_OF_MONTH));
    System.out.println("day of week: " + calendar.get(Calendar.DAY_OF_WEEK));
    System.out.println("day of year: " + calendar.get(Calendar.DAY_OF_YEAR));
    System.out.println("hour of day: " + calendar.get(Calendar.HOUR));
    System.out.println("hour of day: " + calendar.get(Calendar.HOUR_OF_DAY));
    System.out.println("minute: " + calendar.get(Calendar.MINUTE));
    System.out.println("second: " + calendar.get(Calendar.SECOND));
    System.out.println("million seconds: " + calendar.get(Calendar.MILLISECOND));
  }

  @Test
  void testSetCustomTime() {
    Calendar calendar = Calendar.getInstance();
    calendar.clear();
    calendar.set(Calendar.YEAR, 2088);
    calendar.set(Calendar.MONTH, 8);
    calendar.set(Calendar.DATE, 25);
    calendar.set(Calendar.HOUR_OF_DAY, 16);
    calendar.set(Calendar.MINUTE, 33);
    calendar.set(Calendar.SECOND, 59);
    System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime()));
  }
}
