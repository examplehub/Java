package com.examplehub.basics.io;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class FileInputStreamExampleTest {
  @Test
  void testReadFile() throws IOException {
    FileInputStreamExample.readFile("pom.xml");
  }

  @Test
  void testReadFileWithTryRecourse() throws FileNotFoundException {
    FileInputStreamExample.readFileWithTryRecourse("pom.xml");
  }

  @Test
  void testReadFileWithBuffer() throws IOException {
    FileInputStreamExample.readFileWithBuffer("pom.xml");
  }
}
