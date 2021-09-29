package com.examplehub.designpatterns.singleton;

public class SingletonExample6 {

  private SingletonExample6(){
  }

  private static final class InstanceHolder {
    private static final SingletonExample6 INSTANCE = new SingletonExample6();
  }

  public static SingletonExample6 getInstance() {
    return InstanceHolder.INSTANCE;
  }
}
