package com.monzag;

public class NodeDoubly {

    private Object data;
    private Node previous;
    private Node next;

    public NodeDoubly(Object data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}
