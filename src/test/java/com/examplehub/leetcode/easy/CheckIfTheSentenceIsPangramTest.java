package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckIfTheSentenceIsPangramTest {
  @Test
  void testSolution1() {
    assertTrue(CheckIfTheSentenceIsPangram.solution1("thequickbrownfoxjumpsoverthelazydog"));
    assertFalse(CheckIfTheSentenceIsPangram.solution1("leetcode"));
  }

  @Test
  void testSolution2() {
    assertTrue(CheckIfTheSentenceIsPangram.solution2("thequickbrownfoxjumpsoverthelazydog"));
    assertFalse(CheckIfTheSentenceIsPangram.solution2("leetcode"));
  }

  @Test
  void testSolution3() {
    assertTrue(CheckIfTheSentenceIsPangram.solution3("thequickbrownfoxjumpsoverthelazydog"));
    assertFalse(CheckIfTheSentenceIsPangram.solution3("leetcode"));
  }
}
