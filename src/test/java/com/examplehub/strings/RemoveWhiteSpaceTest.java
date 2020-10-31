package com.examplehub.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveWhiteSpaceTest {
  @Test
  void testRemoveWhitespace() {
    assertEquals("ILoveJava", RemoveWhiteSpace.removeWhitespace("I Love Java"));
    assertEquals("ILoveJava", RemoveWhiteSpace.removeWhitespace("I      Love       Java"));
    assertEquals(
        "ILoveJava", RemoveWhiteSpace.removeWhitespace("   I      L   ov   e       Ja  va"));
    assertEquals("", RemoveWhiteSpace.removeWhitespace("         "));
  }
}
