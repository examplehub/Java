package com.examplehub.basics.system;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class FileSeparatorTestTest {
  @Test
  @EnabledOnOs({OS.LINUX, OS.MAC, OS.MAC})
  void testOnUnixLike() {
    assertEquals("/", File.separator);
  }

  @Test
  @EnabledOnOs(OS.WINDOWS)
  void testOnWindows() {
    assertEquals("\\", File.separator);
  }
}
