package com.examplehub.designpatterns.factory;

public class StaticSenderFactory {
  public static Sender build(String senderType) {
    switch (senderType) {
      case "email":
        return new EmailSender();
      case "sms":
        return new SmsSender();
      default:
        return null;
    }
  }

  public static Sender build(SenderType senderType) {
    switch (senderType) {
      case EMAIL_SENDER:
        return new EmailSender();
      case SMS_SENDER:
        return new SmsSender();
      default:
        return null;
    }
  }

  public static Sender buildEmailSender() {
    return new EmailSender();
  }

  public static Sender buildSmsSender() {
    return new SmsSender();
  }
}
