package com.monzag;

public class SinglyLinkedList {

    public Node head;
    public Node last;
    public int length;

    public SinglyLinkedList() {
    }

    public void add(Object item) {
        Node node = new Node(item);

        if (head == null) {
            this.head = node;
            this.head.setNext(null);
            this.last = node;

        } else {
            last.setNext(node);
            node.setNext(null);
            this.last = node;
        }

        length++;
    }

    public void insert(int index, int item) {

    }

    public void remove(int index) {

    }

    @Override
    public String toString() {
        String output = "";

        Node current = head;
        while (current != null) {
            output += current.getData().toString() + " ";
            current = current.getNext();
        }

        return output;
    }
}
