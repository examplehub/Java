package com.examplehub.basics.encrypt;

import org.junit.jupiter.api.Test;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class URLEncoderExampleTest {
  @Test
  void testEncodeDecode() {
    String encoded = URLEncoder.encode("中 文", StandardCharsets.UTF_8);
    assertEquals("%E4%B8%AD+%E6%96%87", encoded);
    assertEquals("中 文", URLDecoder.decode(encoded, StandardCharsets.UTF_8));
  }
}