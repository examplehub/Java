package com.examplehub.designpatterns.factory;

public class SmsSenderFactory implements SenderFactory {
  @Override
  public Sender build() {
    return new SmsSender();
  }
}
