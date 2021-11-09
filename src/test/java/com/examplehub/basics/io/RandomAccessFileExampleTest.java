package com.examplehub.basics.io;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class RandomAccessFileExampleTest {
  @Test
  void testSeek() throws IOException {
    String filename = "example.txt";
    try(PrintStream printStream = new PrintStream(new FileOutputStream(filename));
        RandomAccessFile randomAccessFile = new RandomAccessFile(filename, "rw")) {
      printStream.write("Java".getBytes(StandardCharsets.UTF_8));
      printStream.flush();

      assertEquals('J', randomAccessFile.read());
      randomAccessFile.seek(2);
      assertEquals('v', randomAccessFile.read());
      randomAccessFile.write("123".getBytes(StandardCharsets.UTF_8));
      randomAccessFile.seek(0);
      assertEquals("Jav123", randomAccessFile.readLine());
    }
    assertTrue(Files.deleteIfExists(Paths.get(filename)));
  }
}