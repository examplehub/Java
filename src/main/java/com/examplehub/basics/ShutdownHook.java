package com.examplehub.basics;

public class ShutdownHook {
  public static void main(String[] args) {
    Runtime.getRuntime()
        .addShutdownHook(
            new Thread(
                () -> {
                  /* do something when JVM is shutdown */
                  System.out.print("JVM is Shutdown");
                }));

    System.out.println("JVM will be shutdown");
    System.exit(0);
  }
}
