package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidAnagramTest {
  @Test
  void testSolution1() {
    assertTrue(ValidAnagram.solution1("anagram", "nagaram"));
    assertFalse(ValidAnagram.solution1("rat", "car"));
  }

  @Test
  void testSolution2() {
    assertTrue(ValidAnagram.solution2("anagram", "nagaram"));
    assertFalse(ValidAnagram.solution2("rat", "car"));
    assertFalse(ValidAnagram.solution2("a", "ab"));
  }

  @Test
  void testSolution3() {
    assertTrue(ValidAnagram.solution3("anagram", "nagaram"));
    assertFalse(ValidAnagram.solution3("rat", "car"));
    assertFalse(ValidAnagram.solution3("a", "ab"));
  }
}
