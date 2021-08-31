package com.examplehub.basics.io;

import java.io.File;
import java.util.Objects;

public class RecursionPrintDirectory {
  public static void printFiles(File dir) {
    System.out.print("\t");
    if (dir.isFile()) {
      System.out.println(dir.getName());
    } else {
      System.out.println(dir.getName() + "/");
      for (File file : Objects.requireNonNull(dir.listFiles())) {
        printFiles(file);
      }
    }
  }
}
