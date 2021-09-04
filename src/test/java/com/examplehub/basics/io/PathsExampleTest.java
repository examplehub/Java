package com.examplehub.basics.io;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class PathsExampleTest {
  @Test
  void get() {
    Path path = Paths.get("pom.xml");
    assertEquals("pom.xml", path.getFileName().toString());
  }
}
