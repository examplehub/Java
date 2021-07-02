package com.examplehub.datastructures.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SinglyLinkedListWithHeadTest {
  @Test
  void empty() {
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
    assertTrue(singlyLinkedList.empty());
    singlyLinkedList.insert("a");
    singlyLinkedList.insert("b");
    singlyLinkedList.insert("1");
    assertFalse(singlyLinkedList.empty());
  }

  @Test
  void size() {
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
    assertEquals(singlyLinkedList.size(), 0);
    singlyLinkedList.insert("a");
    singlyLinkedList.insert("b");
    singlyLinkedList.insert("1");
    singlyLinkedList.delete();
    assertEquals(singlyLinkedList.size(), 2);
  }

  @Test
  void insert() {
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
    for (int i = 1; i <= 5; ++i) {
      singlyLinkedList.insert(i + "");
    }
    assertEquals("1->2->3->4->5->NULL", singlyLinkedList.toString());
  }

  @Test
  void insetHead() {
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
    for (int i = 1; i <= 5; ++i) {
      singlyLinkedList.insertHead(i + "");
    }
    assertEquals("5->4->3->2->1->NULL", singlyLinkedList.toString());
  }

  @Test
  void insetTail() {
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
    for (int i = 1; i <= 5; ++i) {
      singlyLinkedList.insert(i + "");
    }
    assertEquals("1->2->3->4->5->NULL", singlyLinkedList.toString());
  }

  @Test
  void insertNth() {
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
    singlyLinkedList.insert("2");
    singlyLinkedList.insertNth(0, "1");
    singlyLinkedList.insertNth(2, "3");
    assertEquals("1->2->3->NULL", singlyLinkedList.toString());

    singlyLinkedList.insertNth(1, "666");
    assertEquals("1->666->2->3->NULL", singlyLinkedList.toString());
  }

  @Test
  void delete() {
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
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
  void deleteTarget() {
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
    for (int i = 0; i < 5; ++i) {
      singlyLinkedList.insert(i + "");
    }
    assertEquals("0->1->2->3->4->NULL", singlyLinkedList.toString());
    assertEquals("0", singlyLinkedList.delete("0"));
    assertEquals("3", singlyLinkedList.delete("3"));
    assertEquals("4", singlyLinkedList.delete("4"));
    assertEquals("1->2->NULL", singlyLinkedList.toString());
  }

  @Test
  void deleteHead() {
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
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
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
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
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
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
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
    for (int i = 2; i <= 10; i += 2) {
      singlyLinkedList.insert(i + "");
    }
    assertEquals("2->4->6->8->10->NULL", singlyLinkedList.toString());
  }

  @Test
  void test() {
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
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
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
    singlyLinkedList.insertHead("5", "4", "3", "2", "1");
    assertEquals("1->2->3->4->5->NULL", singlyLinkedList.toString());
  }

  @Test
  void testInsertTail() {
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
    singlyLinkedList.insertTail("1", "2", "3", "4", "5");
    assertEquals("1->2->3->4->5->NULL", singlyLinkedList.toString());
  }

  @Test
  void testReverse() {
    SinglyLinkedListWithHead<String> singlyLinkedList = new SinglyLinkedListWithHead<>();
    singlyLinkedList.insertTail("1", "2", "3", "4", "5");
    assertEquals("1->2->3->4->5->NULL", singlyLinkedList.toString());
    assertEquals("5->4->3->2->1->NULL", singlyLinkedList.reverse().toString());
  }
}
