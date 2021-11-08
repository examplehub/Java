package com.examplehub.basics.io;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class BufferInputStreamExampleTest {
  @Test
  void testCopyFile() throws IOException {
    String filename = "pom.xml";
    String newFileName = "pom_bk.xml";
    try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFileName))) {
      byte[] buffer = new byte[1024];
      int readBytes;
      while ((readBytes = bis.read(buffer)) != -1) {
        bos.write(buffer, 0, readBytes);
        bos.flush();
      }
      assertEquals(new File(filename).length(), new File(newFileName).length());
    }
    assertTrue(Files.deleteIfExists(Paths.get(newFileName)));
  }
}
