package com.examplehub.basics.io;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.examplehub.utils.StringUtils;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class FileReaderExampleTest {

  @Test
  void testReadSingleChar() throws IOException {
    String filename = "example.txt";
    try (Writer writer = new FileWriter(filename)) {
      writer.write("Java");
    }
    try (Reader reader = new FileReader(filename)) {
      assertEquals('J', reader.read());
      assertEquals('a', reader.read());
      assertEquals('v', reader.read());
      assertEquals('a', reader.read());
      assertEquals(-1, reader.read());
    }
    Files.deleteIfExists(Paths.get(filename));
  }

  @Test
  void testReadChars() throws IOException {
    String filename = "example.txt";
    try (Writer writer = new FileWriter(filename)) {
      writer.write("Java");
    }
    try (Reader reader = new FileReader(filename, StandardCharsets.UTF_8)) {
      char[] letter = new char[4];
      int index = 0;
      int ch;
      while ((ch = reader.read()) != -1) {
        letter[index++] = (char) ch;
      }
      assertEquals("Java", new String(letter));
    }
  }

  @Test
  void testReadCharsToArray() throws IOException {
    String filename = "example.txt";
    try (Writer writer = new FileWriter(filename)) {
      writer.write("I love\n");
      writer.write("Java");
    }
    try (Reader reader = new FileReader(filename, StandardCharsets.UTF_8)) {
      char[] buffer = new char[1024];
      int len;
      StringBuilder builder = new StringBuilder();
      while ((len = reader.read(buffer)) != -1) {
        builder.append(StringUtils.toString(buffer, 0, len));
      }
      assertEquals("I love\nJava", builder.toString());
    }
  }

  @Test
  void testCopyCharacterFile() throws IOException {
    String filename = "pom.xml";
    String newFile = "pom_bk.xml";
    try (Writer writer = new FileWriter(newFile);
        Reader reader = new FileReader(filename)) {
      int ch;
      while ((ch = reader.read()) != -1) {
        writer.write(ch);
      }
      writer.flush();
      assertEquals(new File(filename).length(), new File(newFile).length());
    } finally {
      Files.deleteIfExists(Paths.get(newFile));
    }
  }
}
