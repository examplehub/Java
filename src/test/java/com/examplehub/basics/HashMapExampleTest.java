package com.examplehub.basics;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class HashMapExampleTest {

  @Test
  void testPut() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("username", "admin");
    hashMap.put("password", "abc123");
    assertEquals("{password=abc123, username=admin}", hashMap.toString());

    assertNull(hashMap.put("bio", "Github"));
    assertEquals("Github", hashMap.put("bio", "I love coding"));
  }

  @Test
  void testPutAll() {
    Map<String, String> map = Map.of("username", "admin", "password", "abc123");
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.putAll(map);
    System.out.println(hashMap);
  }

  @Test
  void testPutIfAbsent() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("username", "admin");
    hashMap.put("password", null);
    assertEquals("admin", hashMap.putIfAbsent("username", "ADMIN"));
    assertNull(hashMap.put("password", "abc123"));
    assertNull(hashMap.putIfAbsent("bio", "I love coding"));

    assertEquals("admin", hashMap.get("username"));
    assertEquals("abc123", hashMap.get("password"));
    assertEquals("I love coding", hashMap.get("bio"));
  }

  @Test
  void testAddNull() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put(null, "v1");
    hashMap.put(null, "v2");
    hashMap.put(null, "v3");
    assertNotNull(hashMap.get(null));
    assertEquals("v3", hashMap.get(null));
  }

  @Test
  void testGet() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("username", "admin");
    hashMap.put("password", "abc123");
    assertEquals("admin", hashMap.get("username"));
    assertEquals("abc123", hashMap.get("password"));
    assertNull(hashMap.get("bio"));

    assertEquals("jack", hashMap.getOrDefault("user", "jack"));
  }

  @Test
  void testContainsKey() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("username", "admin");
    hashMap.put("password", "abc123");
    assertTrue(hashMap.containsKey("username"));
    assertTrue(hashMap.containsKey("password"));
    assertFalse(hashMap.containsKey("bio"));
  }

  @Test
  void testContainsValue() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("username", "admin");
    hashMap.put("password", "abc123");
    assertTrue(hashMap.containsValue("admin"));
    assertTrue(hashMap.containsValue("abc123"));
    assertFalse(hashMap.containsValue("I love coding"));
  }

  @Test
  void testRemove() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("username", "admin");
    hashMap.put("password", "abc123");
    assertEquals("admin", hashMap.remove("username"));
    assertEquals("abc123", hashMap.remove("password"));
    assertNull(hashMap.remove("username"));
    assertNull(hashMap.remove("password"));
  }

  @Test
  void testSize() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("username", "admin");
    hashMap.put("password", "abc123");
    assertEquals(2, hashMap.size());

    hashMap.put("bio", "I love java");
    assertEquals(3, hashMap.size());
  }

  @Test
  void testKeySet() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("username", "admin");
    hashMap.put("password", "abc123");
    assertEquals("[password, username]", hashMap.keySet().toString());

    // password->abc123
    // username->admin
    for (String key : hashMap.keySet()) {
      System.out.println(key + "->" + hashMap.get(key));
    }
  }

  @Test
  void testValues() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("username", "admin");
    hashMap.put("password", "abc123");
    assertEquals("[abc123, admin]", hashMap.values().toString());
  }

  @Test
  void testEmpty() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("username", "admin");
    assertFalse(hashMap.isEmpty());
    assertEquals("admin", hashMap.remove("username"));
    assertTrue(hashMap.isEmpty());
  }

  @Test
  void testEntry() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("username", "admin");
    hashMap.put("password", "abc123");
    // password->abc123
    // username->admin
    for (Map.Entry<String, String> entry : hashMap.entrySet()) {
      System.out.println(entry.getKey() + "->" + entry.getValue());
    }
  }
}
