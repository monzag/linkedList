package com.monzag;

public class DoublyLinkedList extends SinglyLinkedList {

    public DoublyLinkedList() {
        super();
    }

    @Override
    public void remove(int index) {
        Node removed = get(index);
        if (removed != null) {
            removed.getPrevious().setNext(removed.getNext());
            removed.getNext().setPrevious(removed.getPrevious());
        }
        length--;
    }

    @Override
    public void add(Object item) {
        Node node = new Node(item);

        if (head == null) {
            this.head = node;
            this.last = this.head;

        } else {
            last.setNext(node);
            node.setPrevious(last);
            this.last = node;
        }
        length++;
    }
}
