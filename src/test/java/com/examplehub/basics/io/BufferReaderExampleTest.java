package com.examplehub.basics.io;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class BufferReaderExampleTest {
  @Test
  void testCopyFile() throws IOException {
    String filename = "pom.xml";
    String newFileName = "pom_bk.xml";
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFileName))) {
      String line = bufferedReader.readLine();
      while (line != null) {
        String nextLine = bufferedReader.readLine();
        bufferedWriter.write(line);
        if (nextLine != null) {
          bufferedWriter.write(System.lineSeparator());
        }
        bufferedWriter.flush();
        line = nextLine;
      }
      assertEquals(new File(filename).length(), new File(newFileName).length());
    }
    assertTrue(Files.deleteIfExists(Paths.get(newFileName)));
  }
}