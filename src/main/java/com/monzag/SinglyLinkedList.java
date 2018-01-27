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

    public void insert(int index, Object item) {
        if (index == 0) {
            insertToStart(item);
        } else if (index >= length - 1 ) {
            insertToEnd(item);
        } else {
            insertInTheMiddle(index, item);
        }
    }

    private void insertToStart(Object item) {
        Node tempHead = new Node(item);
        tempHead.setNext(head);
        head = tempHead;
    }

    private void insertToEnd(Object item) {
        Node tempLast = new Node(item);
        last.setNext(tempLast);
        last = tempLast;
    }

    private void insertInTheMiddle(int index, Object item) {
        Node beforeInserting = get(index - 1);
        Node newIem = new Node(item, beforeInserting.getNext());
        beforeInserting.setNext(newIem);
    }

    public void remove(int index) {
        Node beforeRemoved = get(index-1);
        if (beforeRemoved != null) {
            beforeRemoved.setNext(beforeRemoved.getNext().getNext());
        }
    }

    public Node get(int index) {
        Node current = null;

        if (index > 0 && index < length) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
        }
        return current;
    }

    @Override
    public String toString() {
        String output = "";

        Node current = head;
        while (current != null) {
            output += current.getData().toString() + " ";
            current = current.getNext();
        }

        return output.substring(0, output.length() - 1);
    }
}
