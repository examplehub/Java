package com.examplehub.designpatterns.proxy;

import com.examplehub.designpatterns.decorator.Machine;
import com.examplehub.designpatterns.decorator.Readable;

public class Proxy implements Readable {

  Readable readable;

  public Proxy() {
    readable = new Machine();
  }

  @Override
  public void read() {
    readable.read();
  }
}
