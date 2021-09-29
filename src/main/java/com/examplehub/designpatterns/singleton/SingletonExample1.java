package com.examplehub.designpatterns.singleton;

public class SingletonExample1 {
  private static final SingletonExample1 INSTANCE = new SingletonExample1();

  private SingletonExample1() {}

  public static SingletonExample1 getInstance() {
    return INSTANCE;
  }
}
