package com.examplehub.basics.map;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeMap;
import org.junit.jupiter.api.Test;

class TreeMapExampleTest {
  @Test
  void test() {
    TreeMap<String, String> map = new TreeMap<>();
    map.put("tencent", "wechat");
    map.put("apple", "iPhone");
    map.put("google", "pixel");
    assertEquals("iPhone", map.get("apple"));
    assertEquals("pixel", map.get("google"));
    assertEquals("wechat", map.get("tencent"));
  }
}
