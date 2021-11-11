package com.examplehub.designpatterns.factory;

public class NormalSenderFactory {
  public Sender build(String senderType) {
    switch (senderType) {
      case "email":
        return new EmailSender();
      case "sms":
        return new SmsSender();
      default:
        return null;
    }
  }

  public Sender build(SenderType senderType) {
    switch (senderType) {
      case EMAIL_SENDER:
        return new EmailSender();
      case SMS_SENDER:
        return new SmsSender();
      default:
        return null;
    }
  }

  public Sender buildEmailSender() {
    return new EmailSender();
  }

  public Sender buildSmsSender() {
    return new SmsSender();
  }
}
