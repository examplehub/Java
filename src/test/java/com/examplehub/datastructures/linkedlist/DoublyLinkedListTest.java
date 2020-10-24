package com.examplehub.datastructures.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {
  @Test
  void testDoublyLinkedList() {
    DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
    assertTrue(doublyLinkedList.empty());
    assertEquals(0, doublyLinkedList.size());

    for (int i = 3; i >= 1; i--) {
      doublyLinkedList.insertHead(i + "");
    }

    assertEquals(3, doublyLinkedList.size());
    assertEquals("1->2->3->NULL", doublyLinkedList.toString());
    assertEquals("3->2->1->NULL", doublyLinkedList.stringFromTailToHead());

    doublyLinkedList.insertTail("666");
    assertEquals("1->2->3->666->NULL", doublyLinkedList.toString());
    assertEquals("666->3->2->1->NULL", doublyLinkedList.stringFromTailToHead());

    doublyLinkedList.insertNth(3, "555");
    assertEquals("1->2->3->555->666->NULL", doublyLinkedList.toString());
    assertEquals("666->555->3->2->1->NULL", doublyLinkedList.stringFromTailToHead());

    doublyLinkedList.insertNth(2, "222");
    assertEquals("1->2->222->3->555->666->NULL", doublyLinkedList.toString());
    assertEquals("666->555->3->222->2->1->NULL", doublyLinkedList.stringFromTailToHead());

    doublyLinkedList.deleteHead();
    assertEquals("2->222->3->555->666->NULL", doublyLinkedList.toString());
    assertEquals("666->555->3->222->2->NULL", doublyLinkedList.stringFromTailToHead());

    doublyLinkedList.deleteTail();
    assertEquals("2->222->3->555->NULL", doublyLinkedList.toString());
    assertEquals("555->3->222->2->NULL", doublyLinkedList.stringFromTailToHead());

    doublyLinkedList.deleteNth(2);
    assertEquals("2->222->555->NULL", doublyLinkedList.toString());
    assertEquals("555->222->2->NULL", doublyLinkedList.stringFromTailToHead());

    doublyLinkedList.deleteNth(1);
    assertEquals("2->555->NULL", doublyLinkedList.toString());
    assertEquals("555->2->NULL", doublyLinkedList.stringFromTailToHead());

    doublyLinkedList.deleteNth(1);
    assertEquals("2->NULL", doublyLinkedList.toString());
    assertEquals("2->NULL", doublyLinkedList.stringFromTailToHead());

    doublyLinkedList.deleteNth(0);
    assertEquals("NULL", doublyLinkedList.toString());
    assertEquals("NULL", doublyLinkedList.stringFromTailToHead());

    assertTrue(doublyLinkedList.empty());
    assertEquals(0, doublyLinkedList.size());
  }
}
