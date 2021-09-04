package com.examplehub.basics.io;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.utils.StringUtils;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;
import org.junit.jupiter.api.Test;

class CharArrayReaderExampleTest {
  @Test
  void test() throws IOException {
    try (Reader reader = new CharArrayReader("hello".toCharArray())) {
      char[] chars = new char[1024];
      int len = reader.read(chars);
      assertEquals("hello", StringUtils.toString(chars, 0, len));
    }
  }
}
