package com.monzag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void addTest() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        String expected = "0 1 2";
        assertEquals(expected, linkedList.toString());
    }

}