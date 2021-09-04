package com.examplehub.basics.io;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.utils.StringUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.junit.jupiter.api.Test;

class StringReaderExampleTest {
  @Test
  void test() throws IOException {
    try (Reader reader = new StringReader("hello")) {
      char[] chars = new char[1024];
      int len = reader.read(chars);
      assertEquals("hello", StringUtils.toString(chars, 0, len));
    }
  }
}
