package com.examplehub.basics.oop;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class VarargsExampleTest {
  @Test
  void test() {
    VarargsExample varargsExample = new VarargsExample();
    varargsExample.setLanguage("Java", "Go", "Python");
    assertEquals("[Java, Go, Python]", Arrays.toString(varargsExample.getLanguages()));
    assertEquals(6, varargsExample.sum(1, 2, 3));
    assertEquals(15, varargsExample.sum(1, 2, 3, 4, 5));
  }
}
