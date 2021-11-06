package com.examplehub.basics.collection;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.junit.jupiter.api.Test;

class CollectionExampleTest {

  @Test
  void testRemove() {
    Collection<String> collection = new ArrayList<>();
    collection.add("1");
    collection.add("2");
    collection.add("3");
    collection.add("4");
    assertTrue(collection.remove("1"));
    assertTrue(collection.remove("4"));
    assertFalse(collection.remove("5"));
    assertEquals("[2, 3]", collection.toString());
  }

  @Test
  void testRemoveAll() {
    Collection<String> c1 = new ArrayList<>();
    c1.add("1");
    c1.add("2");
    c1.add("3");
    c1.add("4");

    Collection<String> c2 = new ArrayList<>();
    c2.add("2");
    c2.add("3");
    c2.add("5");

    assertTrue(c1.removeAll(c2));
    assertEquals("[1, 4]", c1.toString());
    assertEquals("[2, 3, 5]", c2.toString());
  }

  @Test
  void testRetainAll() {
    Collection<String> c1 = new ArrayList<>();
    c1.add("1");
    c1.add("2");
    c1.add("3");
    c1.add("4");

    Collection<String> c2 = new ArrayList<>();
    c2.add("2");
    c2.add("4");
    c2.add("5");

    assertTrue(c1.retainAll(c2));
    assertEquals("[2, 4]", c1.toString());
  }

  @Test
  void testToArray() {
    Collection<String> collection = new ArrayList<>();
    collection.add("1");
    collection.add("2");
    collection.add("3");
    collection.add("4");
    Object[] objects = collection.toArray();
    assertEquals("[1, 2, 3, 4]", Arrays.toString(objects));
  }

  @Test
  void testConvertArrayToCollection() {
    String[] digits = {"1", "2", "3", "4"};
    Collection<String> collection = Arrays.asList(digits);
    assertEquals("[1, 2, 3, 4]", collection.toString());
  }

  @Test
  void testIterator() {
    Collection<String> collection = new ArrayList<>();
    collection.add("1");
    collection.add("2");
    collection.add("3");
    collection.add("4");

    Iterator<String> iterator = collection.iterator();
    int count = 1;
    while (iterator.hasNext()) {
      assertEquals(count++ + "", iterator.next());
    }
  }

  @Test
  void testWriteToString() {
    Collection<String> collection = new ArrayList<>();
    collection.add("1");
    collection.add("2");
    collection.add("3");
    collection.add("4");

    Iterator<String> iterator = collection.iterator();
    StringBuilder builder = new StringBuilder();
    if (!iterator.hasNext()) {
      builder.append("[]");
    } else {
      builder.append("[");
      while (iterator.hasNext()) {
        String curItem = iterator.next();
        if (iterator.hasNext()) {
          builder.append(curItem).append(", ");
        } else {
          builder.append(curItem).append("]");
        }
      }
    }
    assertEquals("[1, 2, 3, 4]", builder.toString());
  }

  @Test
  void testRemoveUsingIterator() {
    Collection<String> collection = new ArrayList<>();
    collection.add("1");
    collection.add("2");
    collection.add("3");
    collection.add("4");

    Iterator<String> iterator = collection.iterator();
    while (iterator.hasNext()) {
      iterator.next();
      iterator.remove();
    }
    assertEquals("[]", collection.toString());
  }

  @Test
  void testForEach() {
    Collection<String> collection = new ArrayList<>();
    collection.add("1");
    collection.add("2");
    collection.add("3");
    collection.add("4");

    int count = 1;
    for (String item : collection) {
      assertEquals(count++ + "", item);
    }
  }
}
