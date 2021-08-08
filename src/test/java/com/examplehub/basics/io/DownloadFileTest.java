package com.examplehub.basics.io;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import org.junit.jupiter.api.Test;

class DownloadFileTest {
  @Test
  void testSolution1() throws IOException {
    String url = "https://file-examples-com.github.io/uploads/2017/10/file_example_JPG_100kB.jpg";
    String name = "images/file_example_1.jpg";
    assertTrue(DownloadFile.solution1(url, name));
  }

  @Test
  void TestSolution2() throws IOException {
    String url = "https://file-examples-com.github.io/uploads/2017/10/file_example_JPG_100kB.jpg";
    String name = "images/file_example_2.jpg";
    assertTrue(DownloadFile.solution2(url, name));
  }
}
