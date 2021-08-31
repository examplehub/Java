package com.examplehub.basics.set;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.jupiter.api.Test;

class ArrayListExampleTest {
  @Test
  void testSize() {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Python");
    arrayList.add("C");
    arrayList.add("HTML");
    assertEquals(4, arrayList.size());
  }

  @Test
  void testGet() {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Python");
    arrayList.add("C");
    arrayList.add("HTML");
    assertEquals("Java", arrayList.get(0));
    assertEquals("HTML", arrayList.get(3));

    try {
      arrayList.get(arrayList.size());
      fail();
    } catch (IndexOutOfBoundsException e) {
      assertTrue(true);
    }
  }

  @Test
  void testForTravel() {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Python");
    arrayList.add("C");
    arrayList.add("HTML");
    String[] languages = {"Java", "Python", "C", "HTML"};
    int index = 0;
    for (String item : languages) {
      assertEquals(languages[index++], item);
    }
  }

  @Test
  void testIterator() {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Python");
    arrayList.add("C");
    arrayList.add("HTML");
    String[] languages = {"Java", "Python", "C", "HTML"};

    Iterator<String> iterator = arrayList.iterator();
    for (int i = 0; iterator.hasNext(); ++i) {
      assertEquals(languages[i], iterator.next());
    }
  }

  @Test
  void testToString() {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Python");
    arrayList.add("C");
    arrayList.add("HTML");
    assertEquals("[Java, Python, C, HTML]", arrayList.toString());
  }

  @Test
  void testSet() {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Python");
    arrayList.add("C");
    arrayList.add("HTML");
    assertEquals("Java", arrayList.set(0, "java"));
    assertEquals("java", arrayList.get(0));
  }

  @Test
  void testRemove() {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Python");
    arrayList.add("C");
    arrayList.add("HTML");

    assertEquals("Python", arrayList.remove(1));
    assertEquals("[Java, C, HTML]", arrayList.toString());
  }

  @Test
  void testSort() {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Python");
    arrayList.add("C");
    arrayList.add("HTML");

    Collections.sort(arrayList);
    assertEquals("[C, HTML, Java, Python]", arrayList.toString());
  }

  @Test
  void testContains() {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Python");
    arrayList.add("C");
    arrayList.add("HTML");
    assertTrue(arrayList.contains("Python"));
    assertFalse(arrayList.contains("python"));
    assertTrue(arrayList.contains(new String("Python")));

    class Person {
      private String name;

      public Person(String name) {
        this.name = name;
      }

      public String getName() {
        return name;
      }
    }
    List<Person> list = List.of(new Person("Jack"), new Person("Tom"));
    assertFalse(list.contains(new Person("Jim")));
    assertFalse(list.contains(new Person("Jack")));

    class Person1 {
      private String name;

      public Person1(String name) {
        this.name = name;
      }

      public String getName() {
        return name;
      }

      @Override
      public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return Objects.equals(name, person1.name);
      }

      @Override
      public int hashCode() {
        return Objects.hash(name);
      }
    }
    List<Person1> list1 = List.of(new Person1("Jack"), new Person1("Tom"));
    assertTrue(list1.contains(new Person1("Jack")));
  }

  @Test
  void testClear() {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Python");
    arrayList.add("C");
    arrayList.add("HTML");
    arrayList.clear();
    assertEquals(0, arrayList.size());
  }

  @Test
  void testOf() {
    List<String> list = List.of("Java", "Python", "C", "HTML");
    assertEquals(4, list.size());
    assertEquals("[Java, Python, C, HTML]", list.toString());

    try {
      list.add("Go");
      fail();
    } catch (UnsupportedOperationException e) {
      assertTrue(true);
    }
  }

  @Test
  void testToArray() {
    List<String> list = List.of("Java", "Python", "C", "HTML");
    String[] languages = list.toArray(new String[0]);
    assertEquals("[Java, Python, C, HTML]", Arrays.toString(languages));
  }

  @Test
  void testIndexOf() {
    List<String> list = List.of("Java", "Python", "C", "HTML");
    assertEquals(1, list.indexOf("Python"));
    assertEquals(-1, list.indexOf("python"));
  }

  @Test
  void testLastIndexOf() {
    List<String> list = List.of("Java", "Python", "C", "HTML", "Python");
    assertEquals(4, list.lastIndexOf("Python"));
    assertEquals(-1, list.lastIndexOf("python"));
  }
}
