package com.examplehub.designpatterns.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NormalSenderFactoryTest {
  @Test
  void testBuildEmailSender() {
    NormalSenderFactory factory = new NormalSenderFactory();
    Sender sender = factory.build("email");
    assertEquals("email:how are you", sender.send("how are you"));
  }

  @Test
  void testBuildSmsSender() {
    NormalSenderFactory factory = new NormalSenderFactory();
    Sender sender = factory.build("sms");
    assertEquals("sms:you are so beautiful", sender.send("you are so beautiful"));
  }

  @Test
  void testBuildEmailSenderEnum() {
    NormalSenderFactory factory = new NormalSenderFactory();
    Sender sender = factory.build(SenderType.EMAIL_SENDER);
    assertEquals("email:how are you", sender.send("how are you"));
  }

  @Test
  void testBuildSmsSenderEnum() {
    NormalSenderFactory factory = new NormalSenderFactory();
    Sender sender = factory.build(SenderType.SMS_SENDER);
    assertEquals("sms:how are you", sender.send("how are you"));
  }

  @Test
  void testBuildEmailType() {
    NormalSenderFactory factory = new NormalSenderFactory();
    Sender sender = factory.buildEmailSender();
    assertEquals("email:how are you", sender.send("how are you"));
  }

  @Test
  void testBuildSmsType() {
    NormalSenderFactory factory = new NormalSenderFactory();
    Sender sender = factory.buildSmsSender();
    assertEquals("sms:how are you", sender.send("how are you"));
  }
}
