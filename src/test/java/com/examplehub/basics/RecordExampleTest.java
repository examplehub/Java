package com.examplehub.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecordExampleTest {
  @Test
  void test() {
    record Point(int x, int y) {}
    Point point = new Point(100, 200);
    assertEquals(100, point.x);
    assertEquals(100, point.x());
    assertEquals(200, point.y());
    assertEquals("Point[x=100, y=200]", point.toString());
  }

  @Test
  void testConstructor() {
    record Point(int x, int y) {
      public Point {
        if (x < 0 || y < 0) {
          throw new IllegalArgumentException();
        }
      }
    }
    ;
    try {
      Point point = new Point(-1, -1);
      fail();
    } catch (IllegalArgumentException e) {
      assertTrue(true);
    }
  }

  @Test
  void testStaticMethod() {
    record Point(int x, int y) {
      public static Point of() {
        return new Point(0, 0);
      }

      public static Point of(int x, int y) {
        return new Point(x, y);
      }
    }
    Point p1 = Point.of();
    assertEquals(0, p1.x());
    assertEquals(0, p1.y());

    Point p2 = Point.of(100, 200);
    assertEquals(100, p2.x());
    assertEquals(200, p2.y());
  }
}
