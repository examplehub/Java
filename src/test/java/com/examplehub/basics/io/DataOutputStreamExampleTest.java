package com.examplehub.basics.io;

import org.junit.jupiter.api.Test;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class DataOutputStreamExampleTest {
  @Test
  void testWriteInt() throws IOException {
    String filename = "example.txt";
    try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filename))) {
      dataOutputStream.writeInt(97);
    }
    assertTrue(Files.deleteIfExists(Paths.get(filename)));
  }
}