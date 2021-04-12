package com.examplehub.basics;

public class ThisKeywordExample {
  public static void main(String[] args) {
    Point point = new Point(3, 4);
    System.out.println("x = " + point.x + ", y = " + point.y); /* x = 3, y = 4 */

    Rectangle rectangle = new Rectangle();
    System.out.println(rectangle); /* Rectangle{x=0, y=0, width=1, height=1} */

    rectangle = new Rectangle(3, 4);
    System.out.println(rectangle); /* Rectangle{x=0, y=0, width=3, height=4} */

    rectangle = new Rectangle(1, 1, 3, 4);
    System.out.println(rectangle); /* Rectangle{x=1, y=1, width=3, height=4} */
  }
}

class Point {
  public int x = 0;
  public int y = 0;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class Rectangle {
  private final int x;
  private final int y;
  private final int width;
  private final int height;

  public Rectangle() {
    this(0, 0, 1, 1);
  }

  public Rectangle(int width, int height) {
    this(0, 0, width, height);
  }

  public Rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  @Override
  public String toString() {
    return "Rectangle{" + "x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + '}';
  }
}
