package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindTheDifferenceTest {
  @Test
  void testSolution1() {
    assertEquals('e', FindTheDifference.solution1("abcd", "abcde"));
    assertEquals('y', FindTheDifference.solution1("", "y"));
    assertEquals('a', FindTheDifference.solution1("a", "aa"));
    assertEquals('a', FindTheDifference.solution1("ae", "aea"));
  }

  @Test
  void testSolution2() {
    assertEquals('e', FindTheDifference.solution2("abcd", "abcde"));
    assertEquals('y', FindTheDifference.solution2("", "y"));
    assertEquals('a', FindTheDifference.solution2("a", "aa"));
    assertEquals('a', FindTheDifference.solution2("ae", "aea"));
  }

  @Test
  void testSolution3() {
    assertEquals('e', FindTheDifference.solution3("abcd", "abcde"));
    assertEquals('y', FindTheDifference.solution3("", "y"));
    assertEquals('a', FindTheDifference.solution3("a", "aa"));
    assertEquals('a', FindTheDifference.solution3("ae", "aea"));
  }

  @Test
  void testSolution4() {
    assertEquals('e', FindTheDifference.solution4("abcd", "abcde"));
    assertEquals('y', FindTheDifference.solution4("", "y"));
    assertEquals('a', FindTheDifference.solution4("a", "aa"));
    assertEquals('a', FindTheDifference.solution4("ae", "aea"));
  }

  @Test
  void testSolution5() {
    assertEquals('e', FindTheDifference.solution5("abcd", "abcde"));
    assertEquals('y', FindTheDifference.solution5("", "y"));
    assertEquals('a', FindTheDifference.solution5("a", "aa"));
    assertEquals('a', FindTheDifference.solution5("ae", "aea"));
  }
}
