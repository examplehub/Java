package com.examplehub.ciphers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCipherTest {
  @Test
  void testEncrypt() {
    assertEquals(
        "DEFGHIJKLMNOPQRSTUVWXYZABC", CaesarCipher.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 3));
    assertEquals(
        "defghijklmnopqrstuvwxyzabc", CaesarCipher.encrypt("abcdefghijklmnopqrstuvwxyz", 3));
  }

  @Test
  void testDecrypt() {
    assertEquals(
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ", CaesarCipher.decrypt("DEFGHIJKLMNOPQRSTUVWXYZABC", 3));
    assertEquals(
        "abcdefghijklmnopqrstuvwxyz", CaesarCipher.decrypt("defghijklmnopqrstuvwxyzabc", 3));
  }
}
