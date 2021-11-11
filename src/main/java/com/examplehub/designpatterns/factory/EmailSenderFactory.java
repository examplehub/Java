package com.examplehub.designpatterns.factory;

public class EmailSenderFactory implements SenderFactory{
  @Override
  public Sender build() {
    return new EmailSender();
  }
}
