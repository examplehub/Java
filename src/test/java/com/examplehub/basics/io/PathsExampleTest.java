package com.examplehub.basics.io;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PathsExampleTest {
  @Test
  void get() {
    Path path = Paths.get("pom.xml");
    assertEquals("pom.xml", path.getFileName().toString());
  }
}