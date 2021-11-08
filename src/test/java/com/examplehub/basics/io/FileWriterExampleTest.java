package com.examplehub.basics.io;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class FileWriterExampleTest {
  @Test
  void testWrite() throws IOException {
    String fileName = "example.txt";
    try (Writer writer = new FileWriter(fileName)) {
      writer.write("hello");
    }
    assertEquals("hello", FileReaderExample.read(fileName));
    Files.deleteIfExists(Paths.get(fileName));
  }

  @Test
  void testWriteSingleChar() throws IOException{
    String fileName = "example.txt";
    try (Writer writer = new FileWriter(fileName)) {
      writer.write('A');
      writer.write(66); //write B
    }
    assertEquals("AB", FileReaderExample.read(fileName));
    Files.deleteIfExists(Paths.get(fileName));
  }

  @Test
  void testWriteCharArray() throws IOException{
    char[] letters = {'J', 'a', 'v', 'a'};
    String fileName = "example.txt";
    try (Writer writer = new FileWriter(fileName)) {
      writer.write(letters);
    }
    assertEquals("Java", FileReaderExample.read(fileName));
    Files.deleteIfExists(Paths.get(fileName));
  }

  @Test
  void testWriteOnesOfCharArray() throws IOException{
    char[] letters = {'J', 'a', 'v', 'a'};
    String fileName = "example.txt";
    try (Writer writer = new FileWriter(fileName)) {
      writer.write(letters, 1, 2);
    }
    assertEquals("av", FileReaderExample.read(fileName));
    Files.deleteIfExists(Paths.get(fileName));
  }
}
