package com.monzag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    private DoublyLinkedList dbLinkedList;

    @BeforeEach
    void createLinkedList() {
        this.dbLinkedList = new DoublyLinkedList();
    }

    @Test
    void removeTest() {
        addDataToLinkedList();
        dbLinkedList.remove(2);
        dbLinkedList.remove(8);
        String expected = "0 1 3 4 5 6 7 8 10";
        assertEquals(expected, dbLinkedList.toString());
    }

    public void addDataToLinkedList() {
        for (int i = 0; i < 11; i++) {
            dbLinkedList.add(i);
        }
    }

}