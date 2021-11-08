package com.examplehub.basics.io;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;

class RecursionPrintDirectoryTest {

  @Test
  @Disabled
  void test1() {
    RecursionPrintDirectory.printFiles(new File("src/main/java"));
  }
}
