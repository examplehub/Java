package com.examplehub.designpatterns.decorator;

public class Decorator implements Readable{
  Readable readable;

  public Decorator(Readable readable) {
    this.readable = readable;
  }

  @Override
  public void read() {
    readable.read();
    System.out.println("I not have enough power");
  }
}
