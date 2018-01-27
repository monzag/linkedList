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
    void headTest() {
        addDataToLinkedList();
        int expected = 0;
        assertEquals(expected, linkedList.head.getData());
    }

    @Test
    void lengthTest() {
        addDataToLinkedList();
        int expected = 11;
        assertEquals(expected, linkedList.length);
    }

    @Test
    void lastNullTest() {
        assertNull(linkedList.last);
    }

    @Test
    void lastTest() {
        addDataToLinkedList();
        int expected = 10;
        assertEquals(expected, linkedList.last.getData());
    }

    @Test
    void addTest() {
        addDataToLinkedList();
        String expected = "0 1 2 3 4 5 6 7 8 9 10";
        assertEquals(expected, linkedList.toString());
    }

    @Test
    void getTest() {
        addDataToLinkedList();
        int expected = 2;
        assertEquals(expected, linkedList.get(2).getData());
    }

    @Test
    void removeTest() {
        addDataToLinkedList();
        linkedList.remove(3);
        linkedList.remove(8);
        String expected = "0 1 2 4 5 6 7 8 10";
        assertEquals(expected, linkedList.toString());
    }

    @Test
    void insertToStartTest() {
        addDataToLinkedList();
        linkedList.insert(0, -1);
        String expected = "-1 0 1 2 3 4 5 6 7 8 9 10";
        assertEquals(expected, linkedList.toString());
    }

    @Test
    void insertToEndTest() {
        addDataToLinkedList();
        linkedList.insert(11, 11);
        linkedList.insert(100, 100);
        String expected = "0 1 2 3 4 5 6 7 8 9 10 11 100";
        assertEquals(expected, linkedList.toString());
    }

    @Test
    void insertInTheMiddle() {
        addDataToLinkedList();
        linkedList.insert(3, 22);
        linkedList.insert(6, 44);
        String expected = "0 1 2 22 3 4 44 5 6 7 8 9 10";
        assertEquals(expected, linkedList.toString());
    }

    public void addDataToLinkedList() {
        for (int i = 0; i < 11; i++) {
            linkedList.add(i);
        }
    }
}