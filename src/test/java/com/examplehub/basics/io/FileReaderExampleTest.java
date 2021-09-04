package com.examplehub.basics.io;

import com.examplehub.utils.StringUtils;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class FileReaderExampleTest {
  @Test
  void testReadChar() throws IOException {
    try (Reader reader = new FileReader("pom.xml", StandardCharsets.UTF_8)) {
      int ch;
      while ((ch = reader.read()) != -1) {
        System.out.print((char) ch);
      }
    } finally {
      System.out.println("read completed");
    }
  }

  @Test
  void testReadChars() throws IOException {
    try (Reader reader = new FileReader("pom.xml", StandardCharsets.UTF_8)) {
      char[] buffer = new char[1024];
      int len = 0;
      while ((len = reader.read(buffer)) != -1) {
        System.out.print(StringUtils.toString(buffer, 0, len));
      }
    }
  }
}
