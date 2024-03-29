package com.examplehub.basics;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class HashMapExampleTest {

  @Test
  void testPut() {
    HashMap<String, String> hashMap = new HashMap<>();
    assertNull(hashMap.put("username", "admin"));
    assertNull(hashMap.put("password", "abc123"));
    assertEquals("{password=abc123, username=admin}", hashMap.toString());

    assertNull(hashMap.put("bio", "Github"));
    assertEquals("Github", hashMap.put("bio", "I love coding"));

    assertEquals("admin", hashMap.put("username", "admin_username"));
    assertEquals("admin_username", hashMap.get("username"));

    assertEquals(
        "{password=abc123, bio=I love coding, username=admin_username}", hashMap.toString());
  }

  @Test
  void testPutAll() {
    Map<String, String> map = Map.of("username", "admin", "password", "abc123");
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.putAll(map);
    assertEquals("{password=abc123, username=admin}", hashMap.toString());
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

    assertNull(hashMap.get("url"));
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

    String[][] keyValues =
        new String[][] {
          {"password", "abc123"},
          {"username", "admin"}
        };
    int index = 0;
    for (String key : hashMap.keySet()) {
      assertEquals(keyValues[index][0], key);
      assertEquals(keyValues[index][1], hashMap.get(key));
      index++;
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
    String[][] keyValues =
        new String[][] {
          {"password", "abc123"},
          {"username", "admin"}
        };
    int index = 0;
    for (Map.Entry<String, String> entry : hashMap.entrySet()) {
      assertEquals(keyValues[index][0], entry.getKey());
      assertEquals(keyValues[index][1], entry.getValue());
      index++;
    }
  }

  @Test
  void testStoreObj() {
    class Student {
      private String name;
      private int age;

      public Student(String name, int age) {
        this.name = name;
        this.age = age;
      }

      public String getName() {
        return name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public int getAge() {
        return age;
      }

      public void setAge(int age) {
        this.age = age;
      }
    }
    Student student = new Student("Jack", 25);
    HashMap<String, Student> hashMap = new HashMap<>();
    hashMap.put("jack", student);
    assertEquals("Jack", hashMap.get("jack").getName());
    assertEquals(25, hashMap.get("jack").getAge());
  }
}
