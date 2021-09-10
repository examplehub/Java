package com.examplehub.basics.encrypt;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MD5ExampleTest {
  @Test
  void testMD5() throws NoSuchAlgorithmException {
    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
    messageDigest.update("Hello".getBytes(StandardCharsets.UTF_8));
    messageDigest.update("Word".getBytes(StandardCharsets.UTF_8));
    byte[] result = messageDigest.digest();
    assertEquals("4b6f86d49716af8d4f2edf01a309fc8", new BigInteger(1, result).toString(16));
  }

  @Test
  void testSHA1() throws NoSuchAlgorithmException {
    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
    messageDigest.update("Hello".getBytes(StandardCharsets.UTF_8));
    messageDigest.update("Word".getBytes(StandardCharsets.UTF_8));
    byte[] result = messageDigest.digest();
    assertEquals("bb91fbbc79de916e68ea0b4dcb7407bad1941aaf", new BigInteger(1, result).toString(16));
  }

  @Test
  void testSHA256() throws NoSuchAlgorithmException {
    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
    messageDigest.update("Hello".getBytes(StandardCharsets.UTF_8));
    messageDigest.update("Word".getBytes(StandardCharsets.UTF_8));
    byte[] result = messageDigest.digest();
    assertEquals("294a5c8e68aa0f68fa7f5309f65baf111b9b2e71b286319ca2c88ed40bb5020c", new BigInteger(1, result).toString(16));
  }
}