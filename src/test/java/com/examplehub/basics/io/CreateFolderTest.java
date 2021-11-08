package com.examplehub.basics.io;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CreateFolderTest {

  @Disabled
  @Test
  void test() {
    String path = "example_folder";
    assertTrue(CreateFolder.createFolder(path));
  }
}
