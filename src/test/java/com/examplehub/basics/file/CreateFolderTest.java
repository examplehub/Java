package com.examplehub.basics.file;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreateFolderTest {
  @Test
  void test() {
    String path = "example_folder";
    assertTrue(CreateFolder.createFolder(path));
  }
}
