package com.examplehub.designpatterns.factory;

public class SmsSender implements Sender{
  @Override
  public String send(String message) {
    return "sms:" + message;
  }
}
