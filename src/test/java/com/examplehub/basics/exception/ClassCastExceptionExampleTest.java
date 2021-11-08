package com.examplehub.basics.exception;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ClassCastExceptionExampleTest {
  @Test
  void testClassCast() {
    try {
      String[] strArray = new String[] {"John", "Snow"};
      ArrayList<String> strList = (ArrayList<String>) Arrays.asList(strArray);
      System.out.println("String list: " + strList);
    } catch (ClassCastException e) {
      assertTrue(true);
    }
  }
}
