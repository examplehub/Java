package com.examplehub.designpatterns.factory;

public class EmailSender implements Sender{
  @Override
  public String send(String message) {
    return "email:" + message;
  }
}
