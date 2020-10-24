package com.examplehub.datastructures.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {

  @Test
  void empty() {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    assertTrue(singlyLinkedList.empty());
    singlyLinkedList.insert("a");
    singlyLinkedList.insert("b");
    singlyLinkedList.insert("1");
    assertFalse(singlyLinkedList.empty());
  }

  @Test
  void size() {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    assertEquals(singlyLinkedList.size(), 0);
    singlyLinkedList.insert("a");
    singlyLinkedList.insert("b");
    singlyLinkedList.insert("1");
    assertEquals(singlyLinkedList.size(), 3);
  }

  @Test
  void insert() {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    for (int i = 1; i <= 5; ++i) {
      singlyLinkedList.insert(i + "");
    }
    assertEquals("1->2->3->4->5->NULL", singlyLinkedList.toString());
  }

  @Test
  void insetHead() {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    for (int i = 1; i <= 5; ++i) {
      singlyLinkedList.insertHead(i + "");
    }
    assertEquals("5->4->3->2->1->NULL", singlyLinkedList.toString());
  }

  @Test
  void insetTail() {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    for (int i = 1; i <= 5; ++i) {
      singlyLinkedList.insert(i + "");
    }
    assertEquals("1->2->3->4->5->NULL", singlyLinkedList.toString());
  }

  @Test
  void insertNth() {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    singlyLinkedList.insert("2");
    singlyLinkedList.insertNth(0, "1");
    singlyLinkedList.insertNth(2, "3");
    assertEquals("1->2->3->NULL", singlyLinkedList.toString());

    singlyLinkedList.insertNth(1, "666");
    assertEquals("1->666->2->3->NULL", singlyLinkedList.toString());
  }

  @Test
  void delete() {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    for (int i = 0; i < 5; ++i) {
      singlyLinkedList.insert(i + "");
    }
    assertEquals("0->1->2->3->4->NULL", singlyLinkedList.toString());

    assertEquals("3", singlyLinkedList.deleteNth(3));
    assertEquals("4", singlyLinkedList.deleteNth(3));
    assertEquals("0", singlyLinkedList.deleteNth(0));
    assertEquals("2", singlyLinkedList.deleteNth(1));
    assertEquals("1->NULL", singlyLinkedList.toString());
  }

  @Test
  void deleteHead() {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    for (int i = 0; i < 5; ++i) {
      singlyLinkedList.insert(i + "");
    }
    assertEquals("0->1->2->3->4->NULL", singlyLinkedList.toString());
    for (int i = 0; i <= 4; ++i) {
      assertEquals(i + "", singlyLinkedList.deleteHead());
    }

    assertTrue(singlyLinkedList.empty());
  }

  @Test
  void deleteTail() {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    for (int i = 0; i < 5; ++i) {
      singlyLinkedList.insert(i + "");
    }
    assertEquals("0->1->2->3->4->NULL", singlyLinkedList.toString());
    for (int i = 4; i >= 0; --i) {
      assertEquals(i + "", singlyLinkedList.deleteTail());
    }
    assertTrue(singlyLinkedList.empty());
  }

  @Test
  void deleteNth() {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    for (int i = 0; i < 5; ++i) {
      singlyLinkedList.insert(i + "");
    }
    assertEquals("0->1->2->3->4->NULL", singlyLinkedList.toString());
    assertEquals("3", singlyLinkedList.deleteNth(3));
    assertEquals("0", singlyLinkedList.deleteNth(0));
    assertEquals("2", singlyLinkedList.deleteNth(1));
    assertEquals("1->4->NULL", singlyLinkedList.toString());
  }

  @Test
  void testToString() {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    for (int i = 2; i <= 10; i += 2) {
      singlyLinkedList.insert(i + "");
    }
    assertEquals("2->4->6->8->10->NULL", singlyLinkedList.toString());
  }

  @Test
  void test() {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    assertTrue(singlyLinkedList.empty());
    assertEquals(singlyLinkedList.size(), 0);
    assertEquals("NULL", singlyLinkedList.toString());

    try {
      singlyLinkedList.delete();
      fail(); /* this will not happen */
    } catch (IndexOutOfBoundsException e) {
      assertTrue(true); /* this will happen */
    }

    singlyLinkedList.insert("3");
    singlyLinkedList.insert("4");
    singlyLinkedList.insertHead("0");
    singlyLinkedList.insertNth(1, "1");
    singlyLinkedList.insertNth(2, "2");
    singlyLinkedList.insertTail("5");

    assertEquals(6, singlyLinkedList.size());
    assertEquals("0->1->2->3->4->5->NULL", singlyLinkedList.toString());

    assertEquals("0", singlyLinkedList.deleteHead());
    assertEquals("5", singlyLinkedList.deleteTail());
    assertEquals("3", singlyLinkedList.deleteNth(2));
    assertEquals("4", singlyLinkedList.delete());
    assertEquals(2, singlyLinkedList.size());
    assertEquals("1->2->NULL", singlyLinkedList.toString());
  }

  @Test
  void testInsertHead() {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    singlyLinkedList.insertHead("5", "4", "3", "2", "1");
    assertEquals("1->2->3->4->5->NULL", singlyLinkedList.toString());
  }

  @Test
  void testInsertTail() {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    singlyLinkedList.insertTail("1", "2", "3", "4", "5");
    assertEquals("1->2->3->4->5->NULL", singlyLinkedList.toString());
  }
}
