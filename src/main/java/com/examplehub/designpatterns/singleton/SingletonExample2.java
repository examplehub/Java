package com.examplehub.designpatterns.singleton;

public class SingletonExample2 {
  private static final SingletonExample2 INSTANCE;

  static {
    /*
     * do more work  here
     */
    INSTANCE = new SingletonExample2();
  }

  private SingletonExample2() {}

  public static SingletonExample2 getInstance() {
    return INSTANCE;
  }
}
