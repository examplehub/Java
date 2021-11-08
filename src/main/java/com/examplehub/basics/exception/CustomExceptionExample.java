package com.examplehub.basics.exception;

public class CustomExceptionExample extends Exception {

  @java.io.Serial
  private static final long serialVersionUID = 234122876006267687L;

  public CustomExceptionExample() {
    super();
  }

  public CustomExceptionExample(String message) {
    super(message);
  }
}
