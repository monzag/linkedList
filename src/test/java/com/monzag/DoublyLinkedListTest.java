package com.monzag;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    private DoublyLinkedList dbLinkedList;

    @BeforeEach
    void createLinkedList() {
        this.dbLinkedList = new DoublyLinkedList();
    }

    public void addDataToLinkedList() {
        for (int i = 0; i < 11; i++) {
            dblinkedList.add(i);
        }
    }

}