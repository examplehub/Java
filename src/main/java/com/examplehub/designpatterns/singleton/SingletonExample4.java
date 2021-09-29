package com.examplehub.designpatterns.singleton;

public class SingletonExample4 {
  private static SingletonExample4 INSTANCE;

  private SingletonExample4(){
  }

  public static SingletonExample4 getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new SingletonExample4();
    }
    return INSTANCE;
  }
}
