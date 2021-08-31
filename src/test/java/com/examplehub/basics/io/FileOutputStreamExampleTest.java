package com.examplehub.basics.io;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.basics.file.DeleteFile;
import java.io.*;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class FileOutputStreamExampleTest {
  @Test
  void testWriteByteToFile() throws IOException {
    try (OutputStream outputStream = new FileOutputStream("temp.txt")) {
      outputStream.write('H');
      outputStream.write('e');
      outputStream.write('l');
      outputStream.write('l');
      outputStream.write('o');
      outputStream.flush();

      assertTrue(new File("temp.txt").delete());
    }
  }

  @Test
  void testWriteString() throws IOException {
    try (OutputStream outputStream = new FileOutputStream("temp.txt")) {
      outputStream.write("Hello".getBytes(StandardCharsets.UTF_8));
      assertTrue(new File("temp.txt").delete());
    }
  }

  @Test
  void testCopyFile() throws IOException {
    String srcPath = "pom.xml";
    String destPath = "pom.xml.bk";
    try (InputStream inputStream = new FileInputStream(srcPath);
        OutputStream outputStream = new FileOutputStream(destPath)) {
      byte[] bytes = new byte[1024];
      int readBytes;
      while ((readBytes = inputStream.read(bytes)) != -1) {
        outputStream.write(bytes, 0, readBytes);
      }
    }

    assertTrue(DeleteFile.deleteFile("pom.xml.bk"));
  }
}
