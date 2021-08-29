package com.examplehub.basics.oop;

public class InterfaceExample {}

interface USB {
  String charge();

  default String defaultFunction() {
    return "hello world";
  }
}

class Computer implements USB {

  @Override
  public String charge() {
    return "computer's usb";
  }
}

class Phone implements USB {

  @Override
  public String charge() {
    return "phone's usb";
  }
}
