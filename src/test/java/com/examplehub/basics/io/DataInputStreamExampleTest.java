package com.examplehub.basics.io;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class DataInputStreamExampleTest {
  @Test
  void testRead() throws IOException {
    String filename = "example.txt";
    try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filename));
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filename))) {
      dataOutputStream.writeInt(97);
      dataOutputStream.flush();

      assertEquals(97, dataInputStream.readInt());
    }
    assertTrue(Files.deleteIfExists(Paths.get(filename)));
  }
}
