package com.examplehub.basics.io;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import org.junit.jupiter.api.Test;

class RecursionPrintDirectoryTest {
  @Test
  void test1() {
    RecursionPrintDirectory.printFiles(new File("src/main/java"));
  }
}
