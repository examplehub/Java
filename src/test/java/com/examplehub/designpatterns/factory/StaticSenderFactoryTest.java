package com.examplehub.designpatterns.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticSenderFactoryTest {
  @Test
  void testBuildEmailSender() {
    Sender sender = StaticSenderFactory.build("email");
    assert sender != null;
    assertEquals("email:how are you", sender.send("how are you"));
  }

  @Test
  void testBuildSmsSender() {
    Sender sender = StaticSenderFactory.build("sms");
    assert sender != null;
    assertEquals("sms:you are so beautiful", sender.send("you are so beautiful"));
  }

  @Test
  void testBuildEmailSenderEnum() {
    Sender sender = StaticSenderFactory.build(SenderType.EMAIL_SENDER);
    assert sender != null;
    assertEquals("email:how are you", sender.send("how are you"));
  }

  @Test
  void testBuildSmsSenderEnum() {
    Sender sender = StaticSenderFactory.build(SenderType.SMS_SENDER);
    assert sender != null;
    assertEquals("sms:how are you", sender.send("how are you"));
  }

  @Test
  void testBuildEmailType() {
    Sender sender = StaticSenderFactory.buildEmailSender();
    assertEquals("email:how are you", sender.send("how are you"));
  }

  @Test
  void testBuildSmsType() {
    Sender sender = StaticSenderFactory.buildSmsSender();
    assertEquals("sms:how are you", sender.send("how are you"));
  }
}