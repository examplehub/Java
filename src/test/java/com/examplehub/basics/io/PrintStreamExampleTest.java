package com.examplehub.basics.io;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class PrintStreamExampleTest {
  @Test
  void testPrint() throws IOException {
    String filename = "example.txt";
    PrintStream printStream = new PrintStream(filename);
    printStream.write("Java".getBytes(StandardCharsets.UTF_8));
    assertEquals("Java", FileReaderExample.read(filename));
    assertTrue(Files.deleteIfExists(Paths.get(filename)));
  }
}