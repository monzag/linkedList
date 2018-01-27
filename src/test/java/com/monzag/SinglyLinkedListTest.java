package com.monzag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    private SinglyLinkedList linkedList;

    @BeforeEach
    void createLinkedList() {
        this.linkedList = new SinglyLinkedList();
    }

    @Test
    void headNullTest() {
        assertNull(linkedList.head);
    }

    @Test
    void addTest() {
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        String expected = "0 1 2";
        assertEquals(expected, linkedList.toString());
    }

}