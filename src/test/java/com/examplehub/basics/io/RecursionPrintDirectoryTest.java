package com.examplehub.basics.io;

import java.io.File;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class RecursionPrintDirectoryTest {

  @Test
  @Disabled
  void test1() {
    RecursionPrintDirectory.printFiles(new File("src/main/java"));
  }
}
