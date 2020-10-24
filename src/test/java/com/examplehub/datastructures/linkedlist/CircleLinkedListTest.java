package com.examplehub.datastructures.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleLinkedListTest {
  @Test
  void testCircleLinkedList() {
    CircleLinkedList<String> circleLinkedList = new CircleLinkedList<>();
    assertTrue(circleLinkedList.empty());
    assertEquals(0, circleLinkedList.size());
    assertEquals("NULL", circleLinkedList.toString());

    try {
      circleLinkedList.delete();
      fail(); /* this will not happen */
    } catch (IndexOutOfBoundsException e) {
      assertTrue(true); /* this will happen */
    }

    circleLinkedList.insert("3");
    circleLinkedList.insert("4");
    circleLinkedList.insertHead("0");
    circleLinkedList.insertNth(1, "1");
    circleLinkedList.insertNth(2, "2");
    circleLinkedList.insertTail("5");

    assertEquals(6, circleLinkedList.size());
    assertEquals("0->1->2->3->4->5->NULL", circleLinkedList.toString());

    assertEquals("0", circleLinkedList.deleteHead());
    assertEquals("5", circleLinkedList.deleteTail());
    assertEquals("3", circleLinkedList.deleteNth(2));
    assertEquals("4", circleLinkedList.delete());
    assertEquals(2, circleLinkedList.size());
    assertEquals("1->2->NULL", circleLinkedList.toString());
  }
}
