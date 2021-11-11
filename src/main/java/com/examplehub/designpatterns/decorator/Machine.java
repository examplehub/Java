package com.examplehub.designpatterns.decorator;

public class Machine implements Readable{
  @Override
  public void read() {
    System.out.println("I'm reading");
  }
}
