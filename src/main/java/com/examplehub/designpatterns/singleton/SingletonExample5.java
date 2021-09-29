package com.examplehub.designpatterns.singleton;

public class SingletonExample5 {
  private static SingletonExample5 INSTANCE;

  private SingletonExample5() {}

  public static SingletonExample5 getInstance() {
    if (INSTANCE == null) {
      synchronized (SingletonExample5.class) {
        if (INSTANCE == null) {
          INSTANCE = new SingletonExample5();
        }
      }
    }
    return INSTANCE;
  }
}
