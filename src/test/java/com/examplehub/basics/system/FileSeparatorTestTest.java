package com.examplehub.basics.system;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

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