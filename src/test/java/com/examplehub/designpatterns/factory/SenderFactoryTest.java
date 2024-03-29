package com.examplehub.designpatterns.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SenderFactoryTest {
  @Test
  void testBuildEmailSender() {
    SenderFactory factory = new EmailSenderFactory();
    Sender emailSender = factory.build();
    assertEquals("email:how are you", emailSender.send("how are you"));
  }

  @Test
  void testBuildSmsSender() {
    SenderFactory factory = new SmsSenderFactory();
    Sender smsSender = factory.build();
    assertEquals("sms:how are you", smsSender.send("how are you"));
  }
}
