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

    @Override
    protected void insertToEnd(Object item) {
        Node tempLast = new Node(item);
        last.setNext(tempLast);
        tempLast.setPrevious(last);
        last = tempLast;
    }
    
    @Override
    protected void insertInTheMiddle(int index, Object item) {
        Node oldItemInIndex = get(index);
        Node newItemInIndex = new Node(item, oldItemInIndex, oldItemInIndex.getPrevious());
        oldItemInIndex.setPrevious(newItemInIndex);
        oldItemInIndex.getPrevious().setNext(newItemInIndex);
    }
}
