package com.examplehub.basics.io;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class DeleteFileTest {
  @Test
  void test() throws IOException {
    String path = "example.txt";
    File file = new File(path);
    boolean isCreated = file.createNewFile();
    assertTrue(file.delete());

    path = "non_exists.txt";
    file = new File(path);
    assertFalse(file.delete());
  }
}
