package com.examplehub.basics.io;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class FilesExampleTest {
  @Test
  void testReadBytes() throws IOException {
    byte[] bytes = Files.readAllBytes(Paths.get("pom.xml"));
    System.out.println(new String(bytes));
  }

  @Test
  void testReadString() throws IOException {
    System.out.println(Files.readString(Paths.get("pom.xml")));
  }

  @Test
  void testReadAllLines() throws IOException {
    List<String> lines = Files.readAllLines(Paths.get("pom.xml"));
    for (String line : lines) {
      System.out.println(line);
    }
  }
}